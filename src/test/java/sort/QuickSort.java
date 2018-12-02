package sort;

import org.junit.Assert;
import org.junit.Test;

import utils.Utils;

public class QuickSort {
    int[] actualData = new int[]{8, 6, 3, 2, 5, 4, 9, 7, 1};
    int[] expectData = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void test() {
        quickSort(actualData, 0, actualData.length - 1);
        Assert.assertArrayEquals(actualData, expectData);
    }

    void quickSort(int[] data, int left, int right) {
        if (left < right) {
            int pivot = partition(data, left, right);

            quickSort(data, left, pivot - 1);
            quickSort(data, pivot + 1, right);
        }
    }

    int partition(int[] data, int left, int right) {
        int pivot = (left + right) / 2;
        while (left < right) {
            while (left < right && data[left] < data[pivot]) left++;
            while (left < right && data[right] > data[pivot]) right++;
            if (left < right) {
                Utils.swap(data, left, right);
            }
        }
        Utils.swap(data, left, pivot);
        return left;
    }
}
