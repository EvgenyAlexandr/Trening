import java.util.*;


public class Main {
    public static void main(String[] args) {

        /* Java Collections Framework
         Collections - Основные интерфейсы:
            ├-- List - упорядоченные элементы с дубликатами
            ├-- Set  - уникальные элементы без порядка
            └-- Map  - пары ключ-значение            */

        /* List
            ├-- ArrayList   - (Массив, с авто величиной)
            ├-- LinkedList  - (Node - 3 поля: Значение, адресПредидущего, адресСледующего)
            └-- Vector      - (Редко используется)
                ========= Основные методы =========
                list.add(element)        // добавить в конец
                list.get(index)          // получить по индексу
                list.remove(index)       // удалить по индексу
                list.size()              // количество элементов
                list.indexOf(element)    // найти индекс элемента     */

        //Test_List_ArrayList();
        //Test_List_LinkedList();

        /* Set - Множества
        • Коллекция уникальных элементов
        • Запрещает дубликаты
        • Основные реализации: HashSet, TreeSet, LinkedHashSet
        Короче: только уникальные значения, нет порядка (кроме LinkedHashSet и TreeSet).
        ========= Основные методы =========
        set.add(element)        // добавить элемент
        set.remove(element)     // удалить элемент
        set.contains(element)   // проверить наличие
        set.size()              // количество элементов     */

        /* Set
            ├-- HashSet         - (быстро, уникально, беспорядочно)
            ├-- TreeSet         - (отсортировано, уникально, медленнее HashSet)
            └-- LinkedHashSet   - (быстро, уникально, сохраняет порядок добавления)      */
        //Test_Set_HashSet ();
        //Test_Set_TreeSet ();
        Test_Set_LinkedHashSet ();





        /* Map - пары ключ-значение
            ├-- HashMap       - (быстро, уникально, беспорядочно)
            ├-- TreeMap       - (отсортировано, уникально, медленнее HashSet)
            └-- LinkedHashMap - (быстро, уникально, сохраняет порядок добавления)



        // Основные методы
            map.put(key, value)     // добавить/заменить
            map.get(key)            // получить значение
            map.remove(key)         // удалить
            map.containsKey(key)    // проверить ключ
            map.keySet()            // все ключи
            map.values()            // все значения




         , , LinkedHashMap       */

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        int count = map.get("apple"); // 1

        //Collections_List.Test();
        //Test();

    }




    public static void Test_List_ArrayList () {
        /* ArrayList:
          •	Динамический массив элементов
          •	Быстрый доступ по индексу (O(1))
          •	Медленные вставки/удаления в середине
          Короче: быстро ищется, медленно меняется.   */

        System.out.println("\nList - ArrayList");

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
    }

    public static void Test_List_LinkedList () {
        /* LinkedList:
          • Двусвязный список элементов
          • Быстрые вставки/удаления в середине
          • Медленный доступ по индексу
        Короче: быстро меняется, медленно ищется.           */
        System.out.println("\nList - LinkedList");

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
    }

    public static void Test_Set_HashSet () {
        /* HashSet:
            • Нет индексов, т.е методов get и set тоже нет.
            • Хранит элементы в хеш-таблице
            • Максимальная производительность (O(1))
            • Не гарантирует порядок элементов
        Короче: быстро, уникально, беспорядочно.    */

        System.out.println("\nSet - HashSet");

        Set<Integer> numbers = new HashSet<>();

        // Теперь добавим ряд целочисленных переменных во множество
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);

        // С помощью contains можно проверить наличие элемента в сете
        if (numbers.contains(5)) {
            System.out.println("Хватит вставлять сюда 5!");
        }

        // Выведем размер множества в консоль
        System.out.println("Размер множества HashSet = " + numbers.size());


        // Удалим число 5 с помощью метода remove
        numbers.remove(5);
        // Выведем оставшиеся значения
        System.out.println("Удалим из множества 5 и выведем все что осталось = " + numbers);
    }

    public static void Test_Set_TreeSet() {
        /* TreeSet:
            • Хранит элементы в красно-черном дереве
            • Автоматическая сортировка элементов
            • Производительность O(log n)
        Короче: отсортировано, уникально, медленнее HashSet.        */

        System.out.println("\nSet - TreeSet");

        Set<Integer> numbers = new TreeSet<>();

        // Теперь добавим ряд целочисленных переменных во множество
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);

        // С помощью contains можно проверить наличие элемента в сете
        if (numbers.contains(5)) {
            System.out.println("Хватит вставлять сюда 5!");
        }

        // Выведем размер множества в консоль
        System.out.println("Размер множества HashSet = " + numbers.size());


        // Удалим число 5 с помощью метода remove
        numbers.remove(5);
        // Выведем оставшиеся значения
        System.out.println("Удалим из множества 5 и выведем все что осталось = " + numbers);
    }

    public static void Test_Set_LinkedHashSet () {
        /* LinkedHashSet:
            • Сочетание HashSet и LinkedList
            • Сохраняет порядок добавления элементов
            • Производительность близка к HashSet (O(1))
        Короче: уникально, быстро, с порядком добавления.       */

        System.out.println("\nSet - LinkedHashSet");

        Set<Integer> numbers = new LinkedHashSet<>();

        // Теперь добавим ряд целочисленных переменных во множество
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        System.out.println(numbers);

        // С помощью contains можно проверить наличие элемента в сете
        if (numbers.contains(5)) {
            System.out.println("Хватит вставлять сюда 5!");
        }

        // Выведем размер множества в консоль
        System.out.println("Размер множества HashSet = " + numbers.size());


        // Удалим число 5 с помощью метода remove
        numbers.remove(5);
        // Выведем оставшиеся значения
        System.out.println("Удалим из множества 5 и выведем все что осталось = " + numbers);

    }

}

