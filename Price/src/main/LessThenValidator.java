package main;

public class LessThenValidator implements Validator{
    public boolean check(int n) {
        boolean b = true;
        if (n < 0) b = false;
        return b;
    }
}
