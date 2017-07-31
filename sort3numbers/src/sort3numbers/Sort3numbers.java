package sort3numbers;

import java.util.Scanner;

public class Sort3numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        System.out.print("Result: ");


        if (a < b) {
            if (b < c)
                System.out.print(a + ", " + b + ", " + c);
            else {
                if (a > c)
                    System.out.print(c + ", " + a + ", " + b);
                else
                    System.out.print(a + ", " + c + ", " + b);
            }
        } else {
            if (b > c)
                System.out.println(c + ", " + b + ", " + a);
            else {
                if (a > c)
                    System.out.print(b + ", " + c + ", " + a);
                else
                    System.out.print(b + ", " + a + ", " + c);
            }
        }


    }
}
