package com.matteomalvezzi.OOP.oop.polynomials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly{

    protected double[] calculate_derivative_coefficients(){

        double[] derivative = new double[degree()];

        for (int i = 1; i <= degree(); i++) {
            derivative[i-1] = this.coefficient(i) * i;
        }
        return derivative;
    }

    @Override
    public int hashCode() {return Objects.hashCode(coefficients()); }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        else if (!(obj instanceof Poly)) return false;

        Poly p = (Poly) obj;
        if(degree() != p.degree()) return false;

        for (int i = 0; i <= degree(); i++) {
            if(coefficient(i) != p.coefficient(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= degree(); i++) {
            //first
            if(i == 0) sb.append(coefficient(i)).append(" + ");
            //last
            else if(i == degree()) sb.append(coefficient(i)).append(" * x^").append(i);
            //middle
            else  sb.append(coefficient(i)).append(" * x^").append(i).append(" + ");
        }
        return sb.toString();
    }
}
