package utils;

public class Utils {
    public static void swap(int[] data, int from, int to) {
        int temp = data[from];
        data[from] = data[to];
        data[to] = temp;
    }
}
