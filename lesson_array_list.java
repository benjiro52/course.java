import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class lesson_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // like vector in c++

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1)); // 20
        list.set(1, 25); // list[1] = 25
        list.remove(0); // -list[0]
        System.out.println(list.size()); // 2
        System.out.println(list); 
        System.out.println("___________________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        ArrayList<Integer> list2 = new ArrayList<>(List.of(10, 20, 30));
        list2.remove(1);                    // удалит элемент по ИНДЕКСУ 1 -> [10, 30]
        list2.remove(Integer.valueOf(10));  // удалит значение 10


        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Anna");
        ArrayList<Person> people = new ArrayList<>();

        Collections.sort(list);        // как std::sort
        Collections.reverse(list);
        int max = Collections.max(list);

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
    }
} 