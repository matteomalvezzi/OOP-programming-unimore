package com.matteomalvezzi.OOP.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{

    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0.0);
    }

    @Override
    public double withdraw(double amount) {
        double maxAmount = Math.min(amount, balance);

        return super.withdraw(maxAmount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        String srcCountry = this.IBAN.substring(0,2);
        if(!other.getIBAN().startsWith(srcCountry)) throw new IllegalArgumentException("International IBANs not supported in a free account");

        double maxAmount = withdraw(amount);
        other.deposit(maxAmount);
        return maxAmount;
    }
}
