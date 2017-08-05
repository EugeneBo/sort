package sort3numbers;

import java.util.Scanner;

public class Sort3numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, mid, min, max;

        System.out.println("Input three numbers:");

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.print("c: ");
        c = sc.nextInt();

        System.out.println("Result: ");

        min = a;
        if (min > b) {min=b;}
        if (min > c) {min=c;}
        System.out.println("min = "+min);


        max = a;
        if (max < b) {max=b;}
        if (max < c) {max=c;}
        System.out.println("max = "+max);


        mid=a;
        if (a>=min && a!=max) {mid=a;}
        if (b>=min && b!=max) {mid=b;}
        if (c>=min && c!=max) {mid=c;}
        System.out.println("mid = "+mid);

        System.out.println(min+" "+mid+" "+max);
//        if (temp > b) {a = b; b = temp; }
//        if (temp > c) {a = c; c = temp; }



//        System.out.print(temp);
//        min = temp;
//
//        temp = a;
//        if (temp > b && b > min) temp = b;
//        if (temp > c && c > min) temp = c;
//        System.out.print(temp);
//        mid = temp;
//
//        temp = a;
//        if (temp > b && b > mid) temp = b;
//        if (temp > c && c > mid) temp = c;
//        System.out.print(temp);


    }
}