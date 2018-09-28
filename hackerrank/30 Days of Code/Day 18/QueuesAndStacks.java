import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueuesAndStacks {

    Stack<Character> st = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();

    void pushCharacter(char ch) {
        st.push(ch);
    }

    void enqueueCharacter(char ch) {
        q.add(ch);
    }

    char popCharacter() {
        return st.pop();
    }

    char dequeueCharacter() {
        return q.poll();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        
        char[] s = input.toCharArray();

        QueuesAndStacks p = new QueuesAndStacks();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
