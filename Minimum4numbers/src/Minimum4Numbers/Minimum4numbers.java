package Minimum4Numbers;

import java.util.Scanner;

public class Minimum4numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, min;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        System.out.print("d: ");
        d = sc.nextInt();

        min = a;

        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;

        System.out.print("Result: " + min);
    }
}
