import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(110);
        stack.push(120);
        stack.push(10);
        stack.push(110);
        stack.push(120);
        System.out.println("stack=" + stack);
        System.out.println("new stack "+ stack.pop());
        System.out.println("new stack "+ stack.peek());
    }
}
