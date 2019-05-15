package stack;//链表实现链式栈


public class LinkStack<T> {


    private class Node {
        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;

        }

    }

    private Node top; //栈顶元素
    private int num; //链式栈结点数目

    //空链式栈
    public LinkStack() {
        top = null;
    }

    public LinkStack(T data) {
        top = new Node(data, null);
        num++;
    }

    public int getNum() {
        return num;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    //入栈
    public void push(T data) {
        top = new Node(data, top);
        num++;
    }

    //出栈
    public T pop() {
        if (this.getNum() == 0){
            System.out.println("栈为空");
            return null;
        }
        T del = top.data;
        top = top.next;
        num--;
        return del;
    }

    //获取栈顶元素
    public T getTop() {
        return top.data;
    }

    //清空
    public void clear() {
        top = null;
        num = 0;
    }

    public void printStack(LinkStack<T> stack){
        Node temp = top;
        for (int i = 0; i < stack.num; i++) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkStack<String> linkStack = new LinkStack<String>();
        linkStack.push("a1");
        linkStack.push("a2");
        linkStack.push("a3");
        linkStack.push("a4");
        linkStack.push("a5");
        linkStack.printStack(linkStack);

        System.out.println("栈内元素数目："+ linkStack.getNum());
        System.out.println("栈顶元素：" + linkStack.getTop());
        System.out.println("出栈"+linkStack.pop());
        System.out.println("出栈"+linkStack.pop());
        System.out.println("出栈"+linkStack.pop());
        System.out.println("出栈"+linkStack.pop());
        System.out.println("出栈"+linkStack.pop());
        System.out.println("出栈"+linkStack.pop());

    }
}
