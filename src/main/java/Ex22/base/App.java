/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex22.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int n1 = getN1();
        int n2 = getN2();
        int n3 = getN3();

        int largest = getLargest(n1, n2, n3);
        if(largest == -1)
            myApp.specialOutput();
        else
            myApp.output(largest);
    }

    private void output(int largest) {
        System.out.println("The largest number is " + largest + ".");
    }

    private void specialOutput() {
        System.out.println("Multiple numbers are the largest");
    }

    private static int getLargest(int n1, int n2, int n3) {
        if(n1 > n2)
        {
            if (n1 > n3)
                return n1;
            else
                return n3;

        } else {
            if (n2 > n3)
                return n2;
            else
                return n3;
        }




    }

    private static int getN1() {
        System.out.print("Enter the first number: ");
        return Integer.parseInt(in.nextLine());
    }

    private static int getN2() {
        System.out.print("Enter the second number: ");
        return Integer.parseInt(in.nextLine());
    }

    private static int getN3() {
        System.out.print("Enter the third number: ");
        return Integer.parseInt(in.nextLine());
    }

}
