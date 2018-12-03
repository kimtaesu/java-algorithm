import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void search() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch(arr, 0, arr.length - 1, 5);
        Assert.assertEquals(index, 4);
    }

    int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) return -1;

        int mid = (left + right) / 2;

        if (arr[mid] < arr[left]) {
            return binarySearch(arr, mid + 1, right, key);
        } else if (arr[mid] > arr[right]) {
            return binarySearch(arr, left, mid - 1, key);
        } else {
            return mid;
        }
    }
}
