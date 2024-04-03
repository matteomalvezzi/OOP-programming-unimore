package com.matteomalvezzi.OOP.oop.polynomials;

public interface Poly {


    /**
     * return coefficient of a specific monomial contained in the polynomial
     * @param degree degree of monomial
     * */
    double coefficient(int degree);

    /**
     *  return all coefficients of polynomial
     *  @return all coefficients in a double array
     * */
    double[] coefficients();


    /**
     * get polynomial degree
     * @return polynomial degree
     * */
    int degree();


    /**
     * return the derivative of polynomial
     * @return new derivative polynomial
     * */
    Poly derivative();
}
