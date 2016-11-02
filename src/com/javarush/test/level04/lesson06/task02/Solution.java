package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int max1 = 0, max2 = 0;

        if (a > b){
            max1 = a;
        } else max1 = b;

        if (c > d){
            max2 = c;
        } else  max2 = d;

        if (max1 > max2){
            System.out.println(max1);
        } else System.out.println(max2);

    }
}
