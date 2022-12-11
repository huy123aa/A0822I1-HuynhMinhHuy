package _11_DSA_stack_queue.dao_nguoc_phan_tu;

public class StringReverseThroughStack {
    private String input;
    private String output;

    public StringReverseThroughStack(String in) {
        input = in;
    }

    public String reverse() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output += ch;
        }
        return output;
    }
}

