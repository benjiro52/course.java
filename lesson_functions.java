public class lesson_functions {
    static int sum(int a, int b) {
        return a + b;
    }

    static void greeting(String name) {
        System.out.println("Hello "+ name);
    }

    public static void main(String[] args) {
        int result = sum(6,7);
        System.out.println(result);

        greeting("Ivan");
    }
}
