import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name_, int age_) {
        name = name_;
        age = age_;
    }

    public void print() {
        System.out.print("Name: " + name + '\n' + "Age: " + age);
    }
}

public class lesson {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person = new Person("benjiro", 16);
        person.print();

        System.out.print('\n');
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.close();

        System.out.println("hi, " + name + " Age: " + age);
        
    }

    int age = 17;
    long big = 10_000_000_000L;
    double pi = 3.14;
    boolean ok = true;
    char letter = 'A';
    String name = "Ivan";   // String с большой буквы, это класс
}
