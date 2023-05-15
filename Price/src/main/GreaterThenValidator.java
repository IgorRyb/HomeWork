package main;

public class GreaterThenValidator implements Validator{
    public GreaterThenValidator() {
    }

    public boolean check(int n) {
        boolean b = n <= 999;
        return b;
    }
}
