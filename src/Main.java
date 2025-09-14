import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Java Collections Framework: List
        /* Основные интерфейсы:
            • List - упорядоченные элементы с дубликатами
            • Set - уникальные элементы без порядка
            • Map - пары ключ-значение    */

        /* List
            ├-- ArrayList   - (Массив, с авто величиной)
            ├-- LinkedList  - (Node - 3 поля: Значение, адресПредидущего, адресСледующего)
            └-- Vector      - (Редко используется)              */

        // ArrayList
        Test_ArrayList();
        // LinkedList
        Test_LinkedList();




    }


    public static void Test_ArrayList () {

        System.out.println("List - ArrayList");

        List<String> list_String = new ArrayList<>();
        list_String.add("Один");
        list_String.add("65");
        list_String.add("Три");
        list_String.add("Четыре");
        list_String.add("Шесть");

        list_String.set(1, "Два"); 	              // Замена элемента в списке позиция 1 на значение 65 на "Два"
        list_String.add(4,"Пять");  // Вставляем нужное в нужное место. (Счет как в массиве с 0)

        //list_String.remove(5); 	          // Удаление элемента из списка позиция 5.
        list_String.remove((String) "Шесть"); 	  // Удаление элемента со значением "Шесть"


        System.out.println("list_String = " + list_String);
        // В консоле отобразится -> list_String = [Один, Два, Три, Четыре, Пять]

        // Получение итератора
        Iterator<String> iterator = list_String.iterator();

        // Перебор элементов с использованием итератора
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        /* ArrayList:
          •	Динамический массив элементов
          •	Быстрый доступ по индексу (O(1))
          •	Медленные вставки/удаления в середине
          Короче: быстро ищется, медленно меняется.   */
    }

    public static void Test_LinkedList () {

        System.out.println("List - LinkedList");

        List<String> list_String = new LinkedList<>();
        list_String.add("Один");
        list_String.add("65");
        list_String.add("Три");
        list_String.add("Четыре");
        list_String.add("Шесть");

        list_String.set(1, "Два"); 	              // Замена элемента в списке позиция 1 на значение 65 на "Два"
        list_String.add(4,"Пять");  // Вставляем нужное в нужное место. (Счет как в массиве с 0)

        //list_String.remove(5); 	          // Удаление элемента из списка позиция 5.
        list_String.remove((String) "Шесть"); 	  // Удаление элемента со значением "Шесть"


        System.out.println("list_String = " + list_String);
        // В консоле отобразится -> list_String = [Один, Два, Три, Четыре, Пять]

        // Получение итератора
        Iterator<String> iterator = list_String.iterator();

        // Перебор элементов с использованием итератора
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        /* LinkedList:
            • Двусвязный список элементов
            • Быстрые вставки/удаления в середине
            • Медленный доступ по индексу
           Короче: быстро меняется, медленно ищется.  */
    }
}