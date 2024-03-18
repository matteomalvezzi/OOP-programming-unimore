package com.matteomalvezzi.OOP.oop.basic;

import java.util.Objects;

public class RationalNumber{

    final int numerator;
    final int denominator;


    public RationalNumber(int numerator, int denominator) {
        int gcd = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }



    public RationalNumber add(RationalNumber o){
        int lcm = leastCommonMultiple(this.denominator, o.denominator);
        int n = ((o.denominator/lcm)*o.numerator) + ((this.denominator/lcm)*this.numerator);
        return new RationalNumber(n, lcm);
    }
    public RationalNumber multiply(RationalNumber o){
        int n = o.numerator*this.numerator;
        int d = o.denominator*this.denominator;
        return new RationalNumber(n, d);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    static private int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}
