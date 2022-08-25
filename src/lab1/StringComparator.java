package lab1;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    private char symbol;

    public StringComparator(final char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(final char symbol) {
        this.symbol = symbol;
    }

    @Override
    public int compare(String s1, String s2) {
        long l1 = s1.chars().filter(ch -> ch == symbol).count();
        long l2 = s2.chars().filter(ch -> ch == symbol).count();

        return Long.compare(l1, l2) * -1;
    }
}