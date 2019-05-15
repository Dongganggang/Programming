package queue;

public class CirQueue<E> {
    E[] a;
    private static final int DEFAULT_SIZE = 10;
    int front; //队首下标
    int rear;  //队尾下标

    public CirQueue() {
        this(DEFAULT_SIZE);
    }

    /**
     * 指定队列长度初始化
     *
     * @param num
     */
    public CirQueue(int num) {
        a = (E[]) (new Object[num]);
        front = 0;
        rear = 0;

    }


    public boolean adddata(E obj) {
        if ((rear + 1) % a.length == front) {
            System.out.println("队列已满");
            return false;
        }
        a[rear] = obj;
        rear = (rear + 1) % a.length;
        return true;

    }

    public E deldata() {
        if (rear == front) {
            System.out.println("队列为空");
            return null;
        } else {
            E obj = a[front];
            front = (front + 1) % a.length;
            return obj;
        }
    }

    public int getsize() {
        if (rear > front) {
            return (rear - front);
        } else
            return (a.length - 1);
    }

    public boolean isEmpty() {
        if (front == rear) {
            System.out.println("队列为空");
            return true;
        } else {
            System.out.println("队列不为空");
            return false;
        }
    }

    public static void main(String[] args) {
        CirQueue<String> cirQueue = new CirQueue<String>(5);
        cirQueue.adddata("1");
        cirQueue.adddata("2");
        cirQueue.adddata("3");

        cirQueue.isEmpty();
        System.out.println("元素数目：" + cirQueue.getsize());
        for (int i = 0; i < cirQueue.getsize(); i++) {
            System.out.println(cirQueue.deldata() + " ");
        }


    }


}
