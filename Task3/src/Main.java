import java.util.Scanner;

public class Main {
    public static int trueCount = 0, falseCount = 0;

    public static void main(String[] args) {
        Questions que = new Questions();
        Answers ans = new Answers();
        String[] questions = Questions.arrayQuestions;
        for (int i = 0; i < questions.length; i++) {
            que.typeQuestions(i);
            int b = 0;
            ans.OutputOfAnswerOptions(b, i);
            int userResponse = que.userInput();
            boolean TrueAnswer = ans.checkingForCorrect(i, userResponse);
            if (TrueAnswer) {
                System.out.println(userResponse + " - Ответ верный");
                trueCount++;
            } else {
                System.out.println(userResponse + " - Ответ неверный");
                falseCount++;
            }
            System.out.println();
        }
        System.out.println("Результат: Правильных ответов " + trueCount + " , Неправильных ответов " + falseCount);

    }

    public static class Questions {
        static String[] arrayQuestions = {"а) Сколько существует примитивных типов в языке Java?", " б) Как называется состояние репозитория в Git на какой-то момент времени?", "в) Как называется модификатор для создания константы?"};

        static void typeQuestions(int n) {
            System.out.println(arrayQuestions[n] + " Варианты ответов:");
        }

        public static int userInput() {
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            return userInput;
        }
    }

    public static class Answers {
        int[] arrayTrueAnswers = {3, 2, 2};
        static String[][] arrayAnswer = {{"1. Один", "2. Два", "3. Три", "4. Четыре", "5. Пять"}, {"1. Pull-up", "2. Pull Request", "3. Commit", "4. Branch"}, {"1. static", "2. void", "3. final", "4. public"}};
        boolean True;

        public void OutputOfAnswerOptions(int b, int p) {
            while (b < arrayAnswer[p].length) {
                System.out.println(arrayAnswer[p][b]);
                b++;
            }
        }

        public boolean checkingForCorrect(int n, int p) {
            if (p == arrayTrueAnswers[n] + 1) {
                True = true;
            } else {
                True = false;
            }
            return True;
        }
    }
}

