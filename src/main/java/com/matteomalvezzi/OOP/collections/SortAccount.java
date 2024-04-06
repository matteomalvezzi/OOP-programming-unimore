package com.matteomalvezzi.OOP.collections;

import java.time.LocalDate;
import java.util.*;

public class SortAccount {
    public static class Account implements Comparable<Account>{
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }

        @Override
        public int compareTo(Account o) {
            return Double.compare(this.amount, o.amount);
        }
    }

    List<Account> aList;

    /* ------ Standard algorithm with Bubble sort------ */

    public static void sortByAmount(List<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            for (int k = 0; k < accounts.size()-1; k++) {
                Account a1 = accounts.get(k);
                Account a2 = accounts.get(k+1);

                if(a2.amount < a1.amount){
                    accounts.set(k, a2);
                    accounts.set(k+1, a1);
                }
            }
        }
    }
    public static void sortByInterestRate(List<Account> accounts){
        System.out.println(Arrays.toString(accounts.toArray()));

        for (int i = 0; i < accounts.size(); i++) {

            for (int k = 0; k < accounts.size()-1; k++) {
                Account a1 = accounts.get(k);
                Account a2 = accounts.get(k+1);

                if(a2.interestRate < a1.interestRate){
                    accounts.set(k, a2);
                    accounts.set(k+1, a1);
                }
            }
        }
    }
    public static void sortByDuePayment(List<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            for (int k = 0; k < accounts.size()-1; k++) {
                Account a1 = accounts.get(k);
                Account a2 = accounts.get(k+1);

                if(a2.duePayment.isBefore(a1.duePayment)){
                    accounts.set(k, a2);
                    accounts.set(k+1, a1);
                }
            }
        }
    }


    //** ------ Using Comparator and sort method inner List ------**//

    /**
     * Different use of compare method
     * 1. We can create a Comparator class where we implement Comparator interface and Override compare method where we can compare two difference Accounts
     * 2. We can define anonymous Comparator class with new Comparator object directly inner sort method where we can directly define compare method
     * 3. We can replace anonymous Comparator with lambda expression, lambda expression permit us to declare a method, with parameter, directly in another method.
     *      we have to specify parameter and method, this new method replace compare method.
     * 4. Given that our method to compare contain only Double.compare we can use Comparator.comparingDouble method contained in Comparator where with lambda function we can associate Account Object with amount
     *      comparingDouble will return a Comparator that includes compare method that will use amount
     * 5. In alternative, we can say to Comparator.comparingDouble to use Account::getAmount method to retrieve Double to use for comparing
     * */
    public static void sortByAmountVer2(List<Account> accounts){

        //Method 2
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.amount, o2.amount);
            }
        });

        //Method 3
        accounts.sort((o1, o2) -> Double.compare(o1.amount, o2.amount));

        //Method 4
        accounts.sort(Comparator.comparingDouble(o -> o.amount));

        //Method 5
        accounts.sort(Comparator.comparingDouble(Account::getAmount));
    }


    //** ------ Using Comparable and sort method from Comparable class  ------**//

    /**
     * In this case we use a static method from Collections, we need to remember to implement Comparable<Account> interface
     * in Account class (without this implementations sort not working) and after we have to Override compareTo method.
     * */
    public static void sortByAmountVer3(List<Account> accounts){
        Collections.sort(accounts);
    }
}


