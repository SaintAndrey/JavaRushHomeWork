package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> list = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            list.put("soname " + i + 1, "name " + (i +1));
        }
        return (HashMap)list;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> names = new ArrayList<String>();
        HashSet<String> rem = new HashSet<String>();

        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (!names.contains(pair.getValue())) {
                names.add(pair.getValue());
            } else {
                rem.add(pair.getValue());
            }
        }

        for (String val: rem) {
            removeItemFromMapByValue(map, val);
        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
