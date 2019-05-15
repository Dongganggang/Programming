package queue;

class Node{
    Object data;
    Node next;

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkQueue {
    Node front;
    Node rear;
    int num ;

    public LinkQueue(){
        front = rear = null;
        num = 0;
    }

    public boolean isEmpty(){
        if(num == 0){
            System.out.println("队列为空");
            return true;
        }
        else {
            System.out.println("队列不为空");
            return false;
        }
    }

    public boolean addData(Object data){
        if(num == 0){
            front = new Node(data, null);
            rear = front;
            num++;
            return true;
        }
        Node temp = new Node(data, null);
        rear.setNext(temp);
        rear = temp;
        num++;
        return true;
    }

    public boolean delData(){
        if(isEmpty()){
            return false;
        }

        front = front.next;
        num--;
        return true;
    }
    public int getNum(){
        return num;
    }

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.addData(1);
        linkQueue.addData(2);
        linkQueue.addData(3);

        linkQueue.isEmpty();
        System.out.println("元素数目：" + linkQueue.getNum());
        for (int i = 0; i < linkQueue.getNum(); i++) {
            System.out.println(linkQueue.delData() + " ");
        }
    }


}
