package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        String string = sc.nextLine();
        int mon = Integer.parseInt(string.substring(0,2));
        int day = Integer.parseInt(string.substring(3,5));
        int year = Integer.parseInt(string.substring(6));
        System.out.println(dateFormat.format(new Date(year-1900, mon-1, day)).toUpperCase());

    }
}
