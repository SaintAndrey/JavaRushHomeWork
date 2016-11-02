package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int maximum = sc.nextInt();

        int max = sc.nextInt();
        for (int i = 1; i < maximum; ++i){
            int m = sc.nextInt();
            if (max < m) max = m;
        }
        /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = ;*/

        //напишите тут ваш код




        System.out.println(max);
    }
}
