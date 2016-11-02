package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            InputStream io = new FileInputStream(reader.readLine());

            while (io.available() > 0) {
                int data = io.read();
                System.out.print((char)data);
            }

            io.close();;

        } catch (IOException e){
            System.out.println("IOException error: " + e);
        }

        reader.close();

        //add your code here
    }
}
