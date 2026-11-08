import java.util.Scanner;
import java.util.Arrays;

class lesson_arrays {
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

        int[][] grid = new int[3][4]; // 3 строки, 4 столбца
        grid[1][2] = 7;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }
        System.out.println();
    } 
}
