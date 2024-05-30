/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;

import java.util.Scanner;

import static cz.cvut.fel.pjv.TextIO.isDouble;
import static cz.cvut.fel.pjv.TextIO.isInteger;

public class Lab02 {
    public int counterbynumber = 0;
    public int counterbyrow = 0;
    public double sum = 0;
    double mean = 0;
    public double sumofSquares = 0;
    double[] emtyArray2 = new double[10];

    public double variableDB = 0;

    public void start(String[] args) {
        homework();
    }


    public void homework() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String s = scanner.nextLine();

            counterbyrow++;

            if  (isDouble(s)) {
                counterbynumber++;
                variableDB = Double.valueOf(s);
                sum += variableDB;
                emtyArray2[counterbynumber - 1] = variableDB;
                if (counterbynumber == 10) {
                    mean = sum / counterbynumber;
                    for (int i = 0; i < emtyArray2.length; i++) {
                        sumofSquares += Math.pow(emtyArray2[i] - mean, 2);
                    }
                    double result = Math.sqrt(sumofSquares / counterbynumber);

                    System.out.printf("%2d %.3f %.3f\n", counterbynumber, mean, result);
                    counterbynumber = 0;
                    sum = 0;
                    sumofSquares = 0;
                    for (int i = 0; i < emtyArray2.length; i++) {
                        emtyArray2[i] = 0;
                    }
                } else if (counterbynumber > 1 && !scanner.hasNext()) {
                    mean = sum / counterbynumber;
                    for (int i = 0; i < counterbynumber; i++) {
                        sumofSquares += Math.pow(emtyArray2[i] - mean, 2);
                    }
                    double result = Math.sqrt(sumofSquares / counterbynumber);

                    System.out.printf("%2d %.3f %.3f\n", counterbynumber, mean, result);
                }
            } else {
                System.err.println("A number has not been parsed from line " + counterbyrow);
            }

        } System.err.println("End of input detected!");

    }
}