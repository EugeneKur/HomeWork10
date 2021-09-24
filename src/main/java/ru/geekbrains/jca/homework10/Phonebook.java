package ru.geekbrains.jca.homework10;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> phonebook;

    public Phonebook(){
        this.phonebook = new HashMap<>();
    }

    public void add(String name, String number){ //метод добавление новго человека с номером
        if(phonebook.containsKey(name)){ // Проверка наличия человека с такой же фамилией
            List<String> numbers = phonebook.get(name);
            if(!numbers.contains(number)){ //
                numbers.add(number);
            }
        } else {
            phonebook.put(name, new ArrayList<>(Arrays.asList(number))); // Если условие не выполенено, то добавляем человека с фамилией и номером
        }
    }

    public List<String> get(String name){ // метод поиска номеров по фамилии
        if (phonebook.containsKey(name)){
            return phonebook.get(name);
        } else {
            System.out.println("This name don't contains in this phonebook");
        }
        return new ArrayList<>();
    }


}
