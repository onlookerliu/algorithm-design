import java.util.Stack;

public class ReverseStackRecursive {

    static Stack<Character> stack = new Stack<>();

    static char getAndRemoveLastElement() {
        char element = stack.pop();
        if (stack.isEmpty()) {
            return element;
        } else {
            char last = getAndRemoveLastElement();
            stack.push(element);
            return last;
        }
    }

    static void reverse() {
        if (stack.isEmpty()) {
            return;
        }
        char last = getAndRemoveLastElement();
        reverse();
        stack.push(last);
    }

    public static void main(String[] args) {
        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');
        System.out.println("Original Stack");
        System.out.println(stack);

        // function to reverse the stack
        reverse();
        System.out.println("Reverse Stack");
        System.out.println(stack);
    }
}