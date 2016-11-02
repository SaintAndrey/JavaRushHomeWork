package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       InputStream inputStream = System.in;
        Reader iSR = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(iSR);

        String name1 = bufferedReader.readLine(), si1 = bufferedReader.readLine(), si2 = bufferedReader.readLine();
        int i1 = Integer.parseInt(si1), i2 = Integer.parseInt(si2);

        System.out.println(name1 + " получает " + i1 + " через " + i2 + " лет.");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

    }
}