package com.matteomalvezzi.OOP.functional;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {


    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }
    }

    public static List<Account> applyInterest(List<Account> accounts) {

        Comparator<Account> com = (o1, o2) -> (int)o2.amount - (int)o1.amount;

        return accounts.stream()
                .filter( a -> a.duePayment.isBefore(LocalDateTime.now()))
                .peek( a -> a.amount += a.amount * a.interestRate)
                .sorted( com )
                .collect(Collectors.toList());
    }

}
