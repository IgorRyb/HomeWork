package tests;

import main.Currency;
import main.Money;

public class MoneyTest {
    int n;
    Currency currency = Currency.RUBLE;
    public void oneInputCheck() {
        String scenario = "Проверка нужного окончания числа 1 и его текстового вида";
        try {
            n = 1;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.toWords(currency).equals("рубль") && rubleCurrency.upToTwentyInWords().equals("один")) {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twoInputCheck() {
        String scenario = "Проверка нужного окончания числа 2 и его текстового вида";
        try {
            n = 2;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToTwentyInWords().equals("два") && rubleCurrency.toWords(currency).equals("рубля")) {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void fiveInputCheck() {
        String scenario = "Проверка нужного окончания числа 5 и его текстового вида";
        try {
            n = 5;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToTwentyInWords().equals("пять") && rubleCurrency.toWords(currency).equals("рублей")) {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void elevenInputCheck() {
        String scenario = "Проверка нужного окончания числа 11 и его текстового вида";
        try {
            n = 11;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToTwentyInWords() == "одинадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twelveInputCheck() {
        String scenario = "Проверка нужного окончания числа 12 и его текстового вида";
        try {
            n = 12;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToTwentyInWords() == "двенадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void fifteenInputCheck() {
        String scenario = "Проверка нужного окончания числа 15 и его текстового вида";
        try {
            n = 15;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToTwentyInWords() == "пятнадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twentyInputCheck() {
        String scenario = "Проверка нужного окончания числа 20 и его текстового вида";
        try {
            n = 20;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twentyOneInputCheck() {
        String scenario = "Проверка нужного окончания числа 21 и его текстового вида";
        try {
            n = 21;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "один" && rubleCurrency.toWords(currency) == "рубль") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twentyThreeInputCheck() {
        String scenario = "Проверка нужного окончания числа 23 и его текстового вида";
        try {
            n = 23;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "три" && rubleCurrency.toWords(currency) == "рубля") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void twentyFiveInputCheck() {
        String scenario = "Проверка нужного окончания числа 25 и его текстового вида";
        try {
            n = 25;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "пять" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void thirtyInputCheck() {
        String scenario = "Проверка нужного окончания числа 30 и его текстового вида";
        try {
            n = 30;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToHundredInWords() == "тридцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void oneHundredInputCheck() {
        String scenario = "Проверка нужного окончания числа 100 и его текстового вида";
        try {
            n = 100;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredOneInputCheck() {
        String scenario = "Проверка нужного окончания числа 101 и его текстового вида";
        try {
            n = 101;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "один" && rubleCurrency.toWords(currency) == "рубль") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void oneHundredTwoInputCheck() {
        String scenario = "Проверка нужного окончания числа 102 и его текстового вида";
        try {
            n = 102;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "два" && rubleCurrency.toWords(currency) == "рубля") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void oneHundredFiveInputCheck() {
        String scenario = "Проверка нужного окончания числа 105 и его текстового вида";
        try {
            n = 105;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "пять" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTenInputCheck() {
        String scenario = "Проверка нужного окончания числа 110 и его текстового вида";
        try {
            int n = 110;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "десять" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable("Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void oneHundredElevenInputCheck() {
        String scenario = "Проверка нужного окончания числа 111 и его текстового вида";
        try {
            n = 111;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "одинадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable("Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTwelveInputCheck() {
        String scenario = "Проверка нужного окончания числа 112 и его текстового вида";
        try {
            n = 112;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToTwentyInWords() == "двенадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable("Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredFifteenInputCheck() {
        String scenario = "Проверка нужного окончания числа 115 и его текстового вида";
        try {
            n = 115;
            Money currency = new Money(n);
            if (currency.upToTwentyInWords() == "пятнадцать") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable("Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTwentyInputCheck() {
        String scenario = "Проверка нужного окончания числа 120 и его текстового вида";
        try {
            n = 120;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTwentyOneInputCheck() {
        String scenario = "Проверка нужного окончания числа 121 и его текстового вида";
        try {
            n = 121;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "один" && rubleCurrency.toWords(currency) == "рубль") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTwentyTwoInputCheck() {
        String scenario = "Проверка нужного окончания числа 122 и его текстового вида";
        try {
            n = 122;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "два" && rubleCurrency.toWords(currency) == "рубля") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void oneHundredTwentyFiveInputCheck() {
        String scenario = "Проверка нужного окончания числа 125 и его текстового вида";
        try {
            n = 125;
            Money rubleCurrency = new Money(n);
            if (rubleCurrency.upToThousandInWords() == "Сто" && rubleCurrency.upToHundredInWords() == "двадцать" && rubleCurrency.upToTwentyInWords() == "пять" && rubleCurrency.toWords(currency) == "рублей") {
                System.out.println("passed: " + scenario);
            } else {
                throw new Throwable(" Ожидалось другое окончание или другой текст");
            }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
