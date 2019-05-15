package stack;//数组实现顺序栈

public class ArrayStack {
    private String[] stack;
    private int len; //栈大小
    private int num; //元素个数

    public ArrayStack(int len) {
        this.stack = new String[len];
        this.len = len;
        this.num = 0;
    }


    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //push
    public boolean push(String n) {
        if (num == len) {
            System.out.println("栈已满，入栈非法");
            return false;
        }

        stack[num++] = n;
        return true;
    }


    public String pop() {
        if (num == 0) {
            System.out.println("栈为空，出栈非法");
            return null;
        }
        return stack[--num];
    }

    public void printNum(ArrayStack as) {
        if(as.getNum() == 0)
            System.out.println("栈为空");

        for (int i = 0; i < as.getNum(); i++) {
            System.out.println(as.stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(5);
        as.push("5");
        as.push("1");
        as.push("3");
        as.printNum(as);

        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
    }



}