package com.matteomalvezzi.OOP.oop.bankaccount;

abstract class AbstractBankAccount implements BankAccount{

    String IBAN;
    double balance;

    double interestRate;

    double operationFee;

    public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.interestRate = interestRate;
        this.operationFee = operationFee;
    }

    @Override
    public String getIBAN() {
        return this.IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * sets the operation fee
     *
     * @param operationFee operation fee that will be set
     * @throws IllegalArgumentException if the specified operation fee is negative
     */
    @Override
    public void setOperationFee(double operationFee){
        if(operationFee < 0.0) throw new IllegalArgumentException("Negative Fee");
        this.operationFee = operationFee;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) this.balance += amount;
    }

    /**
     * withdraw an amount from balance
     * @param amount amount that will be withdrawn
     * @return the amount withdrawn
     * */
    @Override
    public double withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    /**
     * transfer an amount from bank account to other
     * @param amount amount that will be transfer
     * @param other bank account that will receive amount
     * @return return amount transferred
     * */
    @Override
    public double transfer(BankAccount other, double amount) {
        this.withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    protected void applyFee() {
        balance -= operationFee;
    }

    /**
     * Verifies the integrity of an IBAN
     * @param IBAN the IBAN to be verified
     */
    protected void checkIBAN(String IBAN){
        if (IBAN.length() < 8 || IBAN.length() > 34)  throw new IllegalArgumentException("Invalid length");

        String countryCode = IBAN.substring(0, 2);
        if (!(Character.isUpperCase(countryCode.charAt(0)) && Character.isUpperCase(countryCode.charAt(1)))) {
            throw new IllegalArgumentException("Invalid country code");
        }
    }
}
