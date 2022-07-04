package group1.homework.braceChecker;

public class BraceChecker {

    private String text;

    private final Stack stack = new Stack();
    private final Stack stackForIndex = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '(') {
                        System.err.println("Error: closed " + c + " but opened" + (char) pop + " at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    stackForIndex.pop();

                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '{') {
                        System.err.println("Error: closed " + c + " but opened" + (char) pop + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '[') {
                        System.err.println("Error: closed " + c + " but opened" + (char) pop + " at " + i);
                    }
                    break;

            }

        }
//        int last;
//        while ((last = stack.pop()) !=0) {
//            System.err.println("Error: opened" + (char)last + " but not closed");
//        }


        while (!stack.isEmpty()) {
            System.err.println("Error: opened " + (char) stack.pop() +
                    " but not closed at " + stackForIndex.pop());
        }
    }

}
