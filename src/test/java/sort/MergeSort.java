package sort;

import org.junit.Assert;
import org.junit.Test;

import utils.Utils;

public class MergeSort {
    int[] actualData = new int[]{69, 10, 30, 2, 16, 8, 31, 22};
    int[] expectData = new int[]{2, 8, 10, 16, 22, 30, 31, 69};

    int[] temp = new int[actualData.length];

    @Test
    public void test() {
        mergeSort(actualData, 0, actualData.length - 1);
        Assert.assertArrayEquals(actualData, expectData);
    }

    void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(data, left, middle);
            mergeSort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    void merge(int[] data, int l, int m, int r) {
        int left = l, k = l;
        int middle = m;
        int right = m + 1;
        int end = r;

        while (left <= middle && right <= end) {
            if (data[left] <= data[right]) {
                temp[k++] = data[left++];
            } else {
                temp[k++] = data[right++];
            }
        }

        if (left > middle) { // left 가 middle보다 크다는건 left 배열은 모두 소진했다는 의미
            for (int i = right; i <= end; i++, k++)
                temp[k] = data[i];
        } else {
            for (int i = left; i <= middle; i++, k++)
                temp[k] = data[i];
        }

        for (int i = l; i <= r; i++) { // temp에 있는 데이터들을 실제 배열로 옮기는 작업
            data[i] = temp[i];
        }
        System.out.println("\n 합병 정렬 >> ");
        Utils.printArr(data);
    }
}
