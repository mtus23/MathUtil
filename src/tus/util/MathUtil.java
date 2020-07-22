/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tus.util;

/**
 *
 * @author DELL
 */
public class MathUtil {

    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * (computeFactorial(n - 1));

    }
}
