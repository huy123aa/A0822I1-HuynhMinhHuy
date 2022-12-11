package _11_DSA_stack_queue.dao_nguoc_phan_tu;

public class Test {
    public static void main(String[] args) {
        String input = "Hello Codegym";
        System.out.println(input);
        String output;
        StringReverseThroughStack theReverser = new StringReverseThroughStack(input);
        output = theReverser.reverse();
        System.out.println("Reversed: " + output);
    }
}

