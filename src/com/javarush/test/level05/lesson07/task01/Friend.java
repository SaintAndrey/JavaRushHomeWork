package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friend;
    //напишите тут ваш код
    public void initialize(String name){
        this.friend = name;
    }
    public void initialize(String name, String age){
        this.friend = name+age;
    }
    public void initialize(String name, String age, String pol){
        this.friend = name+age+pol;
    }
}
