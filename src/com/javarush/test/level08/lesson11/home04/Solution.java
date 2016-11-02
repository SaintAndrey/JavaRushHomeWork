package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
     int insert;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (Integer val: array) {
            if (val < min) min = val.intValue();
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int insert= Integer.parseInt(reader.readLine());
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < insert; i++)
        {
            integerList.add(Integer.parseInt(reader.readLine()));
        }
        //Тут создать и заполнить список
        return integerList;
    }
}
