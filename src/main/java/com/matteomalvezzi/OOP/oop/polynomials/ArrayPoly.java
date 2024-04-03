package com.matteomalvezzi.OOP.oop.polynomials;

public class ArrayPoly extends AbstractPoly{

    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int degree) {
        if(degree >= coefficients.length || degree < 0) throw new IllegalArgumentException("Invalid degree");

        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length -1;
    }

    @Override
    public Poly derivative() {
        double[] derivative_coefficients = super.calculate_derivative_coefficients();

        return new ArrayPoly(derivative_coefficients);
    }
}
