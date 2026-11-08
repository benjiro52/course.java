import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int ant = 0;
        for (int i = 0; i <= number; i++) {
            ant += i;
        }

        System.out.print(ant);
    }
}