package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = 0;

        if (c > b){
            d = c;
            c = b;
            b = d;
        }

        if (b > a){
            d = b;
            b = a;
            a = d;
        }

        if (c > b){
            d = c;
            c = b;
            b = d;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
