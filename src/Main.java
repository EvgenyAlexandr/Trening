import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Java Collections Framework: List
        /* Основные интерфейсы:
            • List - упорядоченные элементы с дубликатами
            • Set - уникальные элементы без порядка
            • Map - пары ключ-значение
         */

        // ArrayList
        System.out.println("List - ArrayList");

        List<String> list_String = new ArrayList<>();
        list_String.add("Один");
        list_String.add("Два");
        list_String.add("Три");
        list_String.add("Четыре");
        list_String.add("Пять");

        System.out.println("list_String = " + list_String);
        // В консоле отобразится -> list_String = [Один, Два, Три, Четыре, Пять]

        // Получение итератора
        Iterator<String> iterator = list_String.iterator();

        // Перебор элементов с использованием итератора
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        // Получение итератора
//        Iterator<Integer> iterator = list.iterator();
//
//        // Перебор элементов с использованием итератора
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            System.out.println(element);
//        }


    }
}