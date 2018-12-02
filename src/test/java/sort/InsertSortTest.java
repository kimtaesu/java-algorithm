package sort;

import org.junit.Assert;
import org.junit.Test;


public class InsertSortTest {
    int[] actualData = new int[]{1, 6, 2, 8, 9};
    int[] expectData = new int[]{1, 2, 6, 8, 9};

    @Test
    public void test() {
        insertSort(actualData);
        Assert.assertArrayEquals(actualData, expectData);
    }

    void insertSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int standard = data[i];  // 기준

            int j = i - 1;   // 비교할 대상
            while (j >= 0 && standard < data[j]) {
                data[j + 1] = data[j];
                // 비교대상이 큰 경우 오른쪽으로 밀어냄
                j--;
            }
            data[j + 1] = standard;
        }
    }
}

