package sort;

import org.junit.Assert;
import org.junit.Test;

import utils.Utils;

public class SelectSort {
    int[] actualData = new int[]{8, 6, 2, 9, 1};
    int[] expectData = new int[]{1, 2, 6, 8, 9};

    @Test
    public void test() {
        selectSort(actualData);
        Assert.assertArrayEquals(actualData, expectData);
    }

    void selectSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {

            }
        }
    }
}
