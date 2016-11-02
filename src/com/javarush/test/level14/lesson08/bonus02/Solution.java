package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(NOD(a,b));
    }

    public static int NOD(int a, int b){
        ArrayList<Integer> q = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        int otv = 1;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                q.add(i);
            }
        }

        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                r.add(i);
            }
        }

        for (int i = 0; i < q.size() ;i++) {
            for (int j = 0; j < r.size(); j++) {
                if (q.get(i) == r.get(j))
                    otv = q.get(i);
            }
        }
        return otv;
    }
}
