package stack;

import java.util.Stack;

public class MoveBack {
    static Stack<String> stack1 = new Stack<String>();
    static Stack<String> stack2 = new Stack<String>();

    public static void main(String[] args) {
        //1.
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");

        //2.
        stack2.push("c");
        stack1.pop();
        stack2.push("b");
        stack1.pop();

        //3.
        stack1.push("b");
        stack2.pop();
        stack1.push("d");

        //4.
        stack2.pop();
    }

}
