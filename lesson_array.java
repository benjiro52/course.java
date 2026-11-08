import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class lesson_array {
    public static void main(String[] args) {
        int a[] = new int[5]; // 5 нулей: [0, 0, 0, 0, 0]
        int b[] = {1, 2, 3, 4, 5}; // сразу с значениями
        String[] names = new String[3]; // [null, null, null]

        a[0] = 10;
        System.out.println(a[0]);
        System.out.println(b[2]);
        System.out.println(b.length);
        System.out.println("___________________________________");

        int[] nums = {1, 4, 7, 5, 2, 8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        int[] copy = Arrays.copyOf(nums, 6);
        Arrays.fill(copy, 0);
        System.out.println(Arrays.toString(copy));
        System.out.println("__________________________");

        
    } 
}
