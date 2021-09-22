import java.util.Stack;

public class Inversion {
    //import java.util.Stack;

    public static class SimpleTesting {
        public static void main(String[] args) {
            String str = "alejandro";
            System.out.println(str);
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }
            StringBuilder strb = new StringBuilder();
            while (!stack.empty()) {
                strb.append(stack.pop());
            }
            System.out.println(strb);
        }
    }
}
