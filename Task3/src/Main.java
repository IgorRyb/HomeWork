import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] answers = {{"1. Один", "2. Два", "3. Три", "4. Четыре", "5. Пять"},{"1. Pull-up", "2. Pull Request", "3. Commit", "4. Branch", " "},{"1. static", "2. void", "3. final", "4. public", " "}};
        int trueCount = 0, falseCount = 0;
        String[] questions = {"Сколько существует примитивных типов в языке Java?", "Как называется состояние репозитория в Git на какой-то момент времени?", "Как называется модификатор для создания константы"};
        int[] trueAnswers = {3, 2, 2};
        for (int i=0;i< questions.length;i++) {
            System.out.println(questions[i] + " Варианты ответов:");
            int b=0;
            while (b < answers[0].length) {
                System.out.println(answers[i][b]);
                b++;
            }
            int a = scanner.nextInt();
            if (a == trueAnswers[i]+1) {
                System.out.println(a + " - Ответ верный");
                trueCount ++;
            }
            else {
                System.out.println(a + " - Ответ неверный");
                falseCount ++;
            }
        }
        System.out.println("Результат: Правильных ответов " + trueCount + " , Неправильных ответов " + falseCount);
    }
}