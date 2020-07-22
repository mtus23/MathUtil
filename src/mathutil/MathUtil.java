/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static tus.util.MathUtil.computeFactorial;

/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));

        System.out.println("6! = " + computeFactorial(6));

        System.out.println("0! = " + computeFactorial(0));

        System.out.println("1! = " + computeFactorial(1));

        //expected exception
        //System.out.println("-5! = " + computeFactorial(-5));
        
        //TDD kết hợp unitTesting xài n thư viện: JUnit, TestNG, PHPUnit, CPPUnit, xUnit, MTest,...
        

    }

}
