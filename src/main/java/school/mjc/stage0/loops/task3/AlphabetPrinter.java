package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (int i = 65; i <= 90; i++) {
            char ch=(char) i;
            System.out.println(Character.toLowerCase(ch));
        }
    }
}
