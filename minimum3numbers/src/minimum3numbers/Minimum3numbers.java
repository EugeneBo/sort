package minimum3numbers;

import java.util.Scanner;

public class Minimum3numbers {
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

        if (a<=b && a<=c) System.out.println(a);
        else if (a>=b && b<=c) System.out.println(b);
             else  System.out.println(c);



    }
}



//        А теперь сделай так, чтобы факт определения минимума для каждой буквы был в одном месте
//        сейчас у тебя в двух местах понимание того, что меньшее c
//        в двух элсах
//        и заодно продумывай что будет, если будет еще и d