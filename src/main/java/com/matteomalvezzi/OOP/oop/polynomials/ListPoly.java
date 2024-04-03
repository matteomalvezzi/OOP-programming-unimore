package com.matteomalvezzi.OOP.oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly {

    ArrayList<Double> coefficients;

    public ListPoly(double[] array) {

        coefficients = new ArrayList<>();
        for (double el : array) coefficients.add(el);
    }


    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coeff = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeff[i] = coefficients.get(i);
        }
        return coeff;
    }

    @Override
    public int degree() {
        return this.coefficients.size() -1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(super.calculate_derivative_coefficients());
    }
}
