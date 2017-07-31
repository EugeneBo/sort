package minimum2numbers;


import java.util.Scanner;

public class Minimum2numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Input two numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("Result: ");

        if (a > b)
            System.out.println(b);
        else
            System.out.println(a);





    }
}
