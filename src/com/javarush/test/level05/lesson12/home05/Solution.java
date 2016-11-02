package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String str= "";
        int sum = 0;
        Integer s=0;
        while (!str.equals("сумма"))
        {
            str = sc.nextLine();
            try
            {
                s = Integer.parseInt(str);
                sum+= s;
            }
            catch (NumberFormatException e)
            {
            }
        }
        System.out.println(sum);
    }
}
