package com.matteomalvezzi.OOP.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{

    /**
     * constructor of pro bank account
     * pro bank account has like interestRate: 1 and operationFee : 0.02 (2 percent)
     * @param IBAN IBAN of bank account
     * @param balance initial balance of bank account
     * */
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 0.02, 1);
    }

    @Override
    public void deposit(double amount) {
        applyFee();
        super.deposit(amount);
    }

    @Override
    public double withdraw(double amount) {
        applyFee();
        return super.withdraw(amount);
    }
}
