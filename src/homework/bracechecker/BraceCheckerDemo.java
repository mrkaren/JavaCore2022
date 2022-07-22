package homework.bracechecker;

public class BraceCheckerDemo {

    public static void main(String[] args) {
        String text = "Hello {From} (asdf} [Java](({lksjd";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }


}
