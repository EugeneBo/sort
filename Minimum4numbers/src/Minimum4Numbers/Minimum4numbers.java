package Minimum4Numbers;
import java.util.Scanner;

public class Minimum4numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        System.out.print("d: ");
        d = sc.nextInt();

        System.out.print("Result: ");

        if (a<=b && a<=c && a<=d) System.out.println(a);
        else if (b<=c && b<=d) System.out.println(b);
             else if (c<=d) System.out.println(c);
                  else System.out.println(d);

    }
}
