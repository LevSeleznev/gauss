/**
 * Created by Лев on 21.01.2016.
 */
public class Main {
    public static void gauss(int fields, int columns, Integer[][] array) {
        int[][] integers = new int[fields][columns + 1];
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                integers[i][j] = array[i][j];
            }
        }

        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                System.out.println(integers[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int fields = 3;
        int columns = 3;
        Integer[][] array = new Integer[][]{
                {4, 2, 1, 1},
                {7, 8, 9, 1},
                {9, 1, 3, 2}
        };
        gauss(fields, columns, array);
    }
}
