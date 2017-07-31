package InsideSort3Numbers;

import java.util.Scanner;


public class InsideSort3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, min, mid, max;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        System.out.print("Result: ");

        //узнаем минимальное
        if (a < b) {
            if (a < c) min = a;
            else min = c;
        } else if (b < c) min = b;
        else min = c;


        if (min == a) {
            if (b > c) {
                mid = c;
                max = b;
            } else {
                mid = b;
                max = c;
            }

        } else {
            if (min == b) {
                if (a > c) {
                    mid = c;
                    max = a;
                } else {
                    mid = a;
                    max = c;
                }

            } else {

                if (a > b) {
                    mid = b;
                    max = a;
                } else {
                    mid = a;
                    max = b;
                }


            }
        }
        a = min;
        b = mid;
        c = max;

        System.out.println(a+" "+b+" "+c);

    }
}
