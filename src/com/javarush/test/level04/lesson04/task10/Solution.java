package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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


        if ((a == b) && (a == c)) {
            System.out.println(a + " " + a + " " + a);
        } else
        if ((a == b) || (a == c )){
            System.out.println(a + " " + a);
        } else if ( b == c) {
        System.out.println(b + " " + b);
    } else if ((a == b) && (a == c)) {
        System.out.println(a + " " + a + " " + a);
    }

    }
}