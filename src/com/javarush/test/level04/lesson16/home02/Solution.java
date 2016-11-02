package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static int middle(int a, int b, int c){
       return min(max(a,b), max(b,c));
    }

    public static int cinInt() throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        return Integer.parseInt(s);

    }

    public static int max(int a, int b){if (a > b) return a; else return b;}

    public static int min(int a, int b){if (a < b) return a; else return b;}

    public static void main(String[] args)   throws Exception
    {
        System.out.println(middle(cinInt(), cinInt(), cinInt()));
    }
}
