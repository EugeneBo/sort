package InsideSort3Numbers;

import java.util.Scanner;


public class InsideSort3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, temp;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }

        if (b > c) {
            temp = c;
            c = b;
            b = temp;
        }

        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }

        System.out.println("Result: " + a + " " + b + " " + c);

    }
}
