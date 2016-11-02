package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int s1=10, s2=10;
        while (s1>0)
        {
         while (s2>0)
            {
                System.out.print("S");
                s2-=1;
            }
            System.out.println();
            s1-=1;
            s2=10;
        }
    }
}
