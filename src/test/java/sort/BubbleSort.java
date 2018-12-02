package sort;

import org.junit.Assert;
import org.junit.Test;

import utils.Utils;

public class BubbleSort {
    int[] actualData = new int[]{8, 6, 2, 9, 1};
    int[] expectData = new int[]{1, 2, 6, 8, 9};

    @Test
    public void test() {
        bubbleSort(actualData);
        Assert.assertArrayEquals(actualData, expectData);
    }

    void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 1; j < data.length - i; j++) {
                if (data[j] < data[j - 1]) {
                    isSwap = true;
                    Utils.swap(data, j, j - 1);
                }
            }
            if (!isSwap) break;
        }
    }
}
