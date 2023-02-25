/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author mical
 */
public class Demo {

    public static final double PI = 3.1415;

    public static long getPowerForInt(int a, int b) {

        if (a < 0 || a > 9) {
            throw new IllegalArgumentException("Invalid a. a must be between 0..9");
        }
        if (b < 0 || b > 9) {
            throw new IllegalArgumentException("Invalid b. b must be between 0..9");
        }
        long product = 1;
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("Undefined.");
            } else {
                product = 0;
            }
        } else {
            if (b == 0) {
                product = 1;
            } else if (b == 1) {
                product = a;
            } else {
                for (int i = 2; i <= b; i++) {
                    product = product * i;
                }
            }
        }

        return product;
    }

    public static void main(String[] args) {
        System.out.println(getPowerForInt(0, 5));
    }
}
