package ru.geekbrains.jca.homework10;

import java.util.*;

public class HomeWork10 {
    public static void main(String[] args) {
//        String[] WordArray = new String[]{ //Не понял формулировку задания. Нам нужно создать обычный массив или ArrayList? Пример преобразования массива в ArrayList для дальнейшей работы
//                "Bird",
//                "Cat",
//                "Car",
//                "Dog",
//                "Computer",
//                "Dog",
//                "Phone",
//                "Fish",
//                "Bird",
//                "Water",
//                "Door",
//                "Window",
//                "Car",
//        };

//        List<String> WordList = new ArrayList<>();
//        WordList = Arrays.asList(WordArray); // Предаставление обычного массива, как ArrayList

        Exercice1(); // Вызов метода первого задания
        Phonebook phonebook = new Phonebook(); // Второе задание
        phonebook.add("Petrov", "464646"); // Добавление в список номера и фамилии
        phonebook.add("Durov","564445");
        phonebook.add("Durov","699875");
        phonebook.add("Durov","987536");
        phonebook.add("Ivanov","5856546");
        phonebook.add("Kolov","556459");
        phonebook.add("Bumagin","46546541");
        phonebook.add("Sidorov","564899");
        phonebook.add("Ivanov","54988777");
        phonebook.add("Popov","64894755");
        phonebook.add("Smirnov","9885454");
        phonebook.add("Smirnov","879998");
        phonebook.add("Smirnov","78588587");
        phonebook.add("Smirnov","544886844");

        System.out.println(phonebook.get("Petrov")); // Поиск номера по фамилии
        System.out.println(phonebook.get("Smirnov"));


    }

    private static void Exercice1() { // метод первого задания
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bird");
        arrayList.add("Car");
        arrayList.add("Bird");
        arrayList.add("Book");
        arrayList.add("Book");
        arrayList.add("Window");
        arrayList.add("Door");
        arrayList.add("Water");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Bird");
        arrayList.add("Phone");
        arrayList.add("Sugar");
        arrayList.add("Window");
        arrayList.add("Window");

        Set<String> setOfUniqueWords = new LinkedHashSet<>(arrayList); // С помощью сет создаем список без повторов
        System.out.println(setOfUniqueWords);
        String[] WordArray = new String[setOfUniqueWords.size()]; // Вспомогательный массив
        setOfUniqueWords.toArray(WordArray); // перенос элементов сета в вспомогательный массив

        for (int i = 0; i < WordArray.length; i++) { //Цикл подсчета повторяющихся элементов
            int count = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (WordArray[i] == arrayList.get(j)) count++;
            }
            System.out.println(WordArray[i] + " = " + count);
        }
    }
}
