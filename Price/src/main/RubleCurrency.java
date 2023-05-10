package main;

import java.util.Scanner;

public class RubleCurrency implements Currency{
    private int number;

    public RubleCurrency(int number) {
        this.number = number;
    }

    public void output() {
        System.out.println("Ввод с консоли: " + number);
        if (number == 0) {
            System.out.println("Вывод программы: " + "ноль" + toWords());
        } else if (number < 20 && number > 0) {
            System.out.println("Вывод программы: " + upToTwentyInWords() + toWords());
        } else if ((number >= 20) && (number <= 99)) {
            System.out.println("Вывод программы: " + upToHundredInWords() + " " + upToTwentyInWords() + toWords());
        } else if ((number >= 100) && (number <= 999)) {
            System.out.println("Вывод программы: " + upToThousandInWords() + " " + upToHundredInWords() + " " + upToTwentyInWords() + toWords());
        } else {
            System.out.println("Введите положительное число от НУЛЯ до ТЫСЯЧИ");
        }
}

public String toWords() {;
    String price = " рублей";
    if ((number < 10) || (number > 20)) {
        int lastDigit = number % 10;
        if (lastDigit == 1) {
            price = " рубль";
        } else if ((lastDigit == 2) || (lastDigit == 3) || (lastDigit == 4)) {
            price = " рубля";
        } else {
            price = " рублей";
        }
    }
    return price;
}

public String[] arrayToTen() {
    String[] tenArray = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"
            , "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    return tenArray;
}

public String upToTwentyInWords() {
    String words = "";
    int lastDigit = number % 10;
    String[] tenArray = arrayToTen();
    for (int i = 0; i <= tenArray.length; i++) {
        if (i == number && number < 20 && number > 0) {
            words = tenArray[number -1];
        } else if ((number > 20) && (lastDigit == i) && (lastDigit !=0)) {
            words = tenArray[lastDigit-1];
        }
    }
    return words;
}

public String upToHundredInWords() {
    String words = "";
    if (number > 100){
        number %= 100;
    }
    String[] arrayOfNumbersToOneHundred = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    if ((number >= 20) && (number < 30)) {
        words = arrayOfNumbersToOneHundred[0];
    } else if ((number >= 30) && (number < 40)) {
        words = arrayOfNumbersToOneHundred[1];
    } else if ((number >= 40) && (number < 50)) {
        words = arrayOfNumbersToOneHundred[2];
    } else if ((number >= 50) && (number < 60)) {
        words = arrayOfNumbersToOneHundred[3];
    } else if ((number >= 60) && (number < 70)) {
        words = arrayOfNumbersToOneHundred[4];
    } else if ((number >= 70) && (number < 80)) {
        words = arrayOfNumbersToOneHundred[5];
    } else if ((number >= 80) && (number < 90)) {
        words = arrayOfNumbersToOneHundred[6];
    } else if ((number >=90) && (number < 100)){
        words = arrayOfNumbersToOneHundred[7];
    }
    return words;
}

    public String upToThousandInWords() {
        String words = "";
        String[] arrayOfNumbersToOneHundred = {"Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
        if ((number >= 100) && (number < 200)) {
            words = arrayOfNumbersToOneHundred[0];
        } else if ((number >= 200) && (number < 300)) {
            words = arrayOfNumbersToOneHundred[1];
        } else if ((number >= 300) && (number < 400)) {
            words = arrayOfNumbersToOneHundred[2];
        } else if ((number >= 400) && (number < 500)) {
            words = arrayOfNumbersToOneHundred[3];
        } else if ((number >= 500) && (number < 600)) {
            words = arrayOfNumbersToOneHundred[4];
        } else if ((number >= 600) && (number < 700)) {
            words = arrayOfNumbersToOneHundred[5];
        } else if ((number >= 700) && (number < 800)) {
            words = arrayOfNumbersToOneHundred[6];
        } else if ((number >= 800) && (number < 900)) {
            words = arrayOfNumbersToOneHundred[7];
        } else {
            words = arrayOfNumbersToOneHundred[8];
        }
        return words;
    }

}
