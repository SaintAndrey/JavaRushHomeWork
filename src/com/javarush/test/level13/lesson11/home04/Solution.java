package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String str;
        String result;
        Boolean first = true;
        try {
            OutputStream io = new FileOutputStream(reader.readLine());
            str = reader.readLine();

            while (!(str.equals("exit"))) {
                if (first) {
                    result = str;
                    first = false;
                }
                else
                    result = '\n' + str;
                list.add(result);

                //io.write(result.getBytes());
                str = reader.readLine();
            }
            result = '\n'+"exit";
            list.add(result);

            for (int i = 0; i < list.size(); i++) {
                io.write(list.get(i).getBytes());
            }

            io.close();

        } catch (IOException e){
            System.out.println("IOException error: " + e);
        }

        reader.close();
    }
}