## 삽입 정렬
```java
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
```
![](https://gmlwjd9405.github.io/images/algorithm-insertion-sort/insertion-sort.png)

## 버블 정렬
```java
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
```

## 선택 정렬

![](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

## 시간 복합도
![](https://gmlwjd9405.github.io/images/algorithm-insertion-sort/sort-time-complexity.png)