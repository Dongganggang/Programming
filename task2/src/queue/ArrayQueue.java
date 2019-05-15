package queue;

public class ArrayQueue<T> {
    private T[] queue;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue() {
        queue = (T[]) new Object[10];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    public ArrayQueue(int num) {
        queue = (T[]) new Object[num];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    public boolean inQueue(T t) {
        if (count == queue.length) {
            System.out.println("队列已满，入队失败");
            return false;
        }

        queue[(rear++) % queue.length] = t;
        count++;
        return true;
    }

    public T outQueue(){
        if(count == 0){
            System.out.println("队列为空，出队失败");
            return null;
        }

        count++;
        return queue[(front++) % queue.length];
    }

    public T getFront(){
        if(count == 0){
            System.out.println("队列为空");
        }
        return queue[front];
    }

    public boolean isFull(){
        return (count == queue.length);
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>(10);
        System.out.println("队满？" + arrayQueue.isFull());
        System.out.println("队空？" + arrayQueue.isEmpty());
        for (int i = 0; i < 10; i++) {
            arrayQueue.inQueue(i);
        }
        System.out.println("队满？" + arrayQueue.isFull());
        System.out.println("队空？" + arrayQueue.isEmpty());
        System.out.println("队首" + arrayQueue.getFront());

        for (int i = 0; i < 5; i++) {
            System.out.println("出队" + arrayQueue.outQueue());
        }
        System.out.println("队首" + arrayQueue.getFront());

    }

}
