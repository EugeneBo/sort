package homework.Sort3Numbers;

import java.util.Scanner;
//1) Создать 2 переменные (целочисленные) их вводит пользователь. Программа выводит минимальное.
//2) Отдельно напиcать программу. Пользователь вводи а б с. Программа выводит минимальное (именно число).
//3) Пользователь вводит 2 числа. Программа выводит 2 числа в порядке возрастания.
//4) тоже самое но для трех чисел. (код предыдущей задачи пригодится)
//5) Пользователь ввел три числа. Программа выводит sout(a b c) в порядке возрастания.

public class Sort3Numbers {
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


