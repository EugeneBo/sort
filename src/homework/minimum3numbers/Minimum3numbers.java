package homework.minimum3numbers;

import java.util.Scanner;

//1) Создать 2 переменные (целочисленные) их вводит пользователь. Программа выводит минимальное.
//2) Отдельно напиcать программу. Пользователь вводи а б с. Программа выводит минимальное (именно число).
//3) Пользователь вводит 2 числа. Программа выводит 2 числа в порядке возрастания.
//4) тоже самое но для трех чисел. (код предыдущей задачи пригодится)
//5) Пользователь ввел три числа. Программа выводит sout(a b c) в порядке возрастания.


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

        if (a < b) {
            if (a < c) System.out.print(a);
            else System.out.println(c);
        } else if (b < c) System.out.println(b);
               else System.out.println(c);


    }
}
