package structure;


public class MyQueue<T> {


    // 큐 배열은 front와 rear 그리고 maxSize를 가진다.
    private int front;
    private int rear;
    private int maxSize;
    private Object[] queue;

    // 큐 배열 생성
    public MyQueue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queue = new Object[maxSize];
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return front == rear + 1;
    }

    // 큐가 꽉 찼는지 확인
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // 큐 rear에 데이터 등록
    public void add(T item) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException();
        queue[++rear] = item;
    }

    // 큐에서 front 데이터 조회
    public T peek() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        return (T) queue[front];
    }

    // 큐에서 front 데이터 제거
    public T remove() {
        T item = peek();
        queue[front] = null;
        front++;
        return item;
    }
}
