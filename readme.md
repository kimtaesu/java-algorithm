## 시간 복합도
![](https://gmlwjd9405.github.io/images/algorithm-insertion-sort/sort-time-complexity.png)

## 안정정렬 VS 불안정 정렬
안정정렬: 동일한 값에 대해 순서가 바뀔수 없음. 

불안정정렬: 동일한 값에 대해 순서가 바뀔수 있음.

* 안정 정렬
> Bubble, Insertion, Merge
* 불안정 정렬
> Selection, Shell, Heap, Quick
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
```java
 void selectSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[indexMin] < data[j]) {
                    indexMin = j;
                }
            }
            Utils.swap(data, indexMin, i);
        }
    }
```
![](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

## 퀵 정렬
```java
void quickSort(int[] data, int left, int right) {
    if (left < right) {
        int pivot = partition(data, left, right);

        quickSort(data, left, pivot - 1);
        quickSort(data, pivot + 1, right);
    }
}
```

```java
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
```
![](https://gmlwjd9405.github.io/images/algorithm-quick-sort/quick-sort.png)

## 합병정렬
![](https://gmlwjd9405.github.io/images/algorithm-merge-sort/merge-sort-concepts.png)