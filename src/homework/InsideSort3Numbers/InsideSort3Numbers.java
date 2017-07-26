package homework.InsideSort3Numbers;
//1) Создать 2 переменные (целочисленные) их вводит пользователь. Программа выводит минимальное.
//2) Отдельно напиcать программу. Пользователь вводи а б с. Программа выводит минимальное (именно число).
//3) Пользователь вводит 2 числа. Программа выводит 2 числа в порядке возрастания.
//4) тоже самое но для трех чисел. (код предыдущей задачи пригодится)
//5) Пользователь ввел три числа. Программа выводит sout(a b c) в порядке возрастания.

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