
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Answers ans = new Answers();
        Questions que = new Questions(ans);
        Test test = new Test(que);
        test.passTest();
    }

    public static class Questions {

        private final static String[] arrayQuestions = {"а) Сколько " +
                "существует примитивных типов в языке Java?", " б) Как называется состояние репозитория в Git на какой-то момент времени?", "в) Как называется модификатор для создания константы?"};
        static boolean True;
        static int userInput;
        private static Answers ans;

        public Questions(Answers ans) {
            this.ans = ans;
        }

        static boolean ask(int n) {
                int b = 0;
                System.out.println(arrayQuestions[n] + " Варианты ответов:");
                while (b < ans.arrayAnswer[n].length) {
                    System.out.println(ans.arrayAnswer[n][b]);
                    b++;
                }
                Scanner scan = new Scanner(System.in);
                userInput = scan.nextInt();
                if (userInput == ans.arrayTrueAnswers[n] + 1) {
                    True = true;
                } else {
                    True = false;
                }
            return True;
        }

    }

    public static class Answers {
        private static int[] arrayTrueAnswers = {3, 2, 2};
        private static String[][] arrayAnswer = {{"1. Один", "2. Два", "3. Три", "4. Четыре", "5. Пять"}, {"1. Pull-up", "2. Pull Request", "3. Commit", "4. Branch"}, {"1. static", "2. void", "3. final", "4. public"}};


    }

    public static class Test {
        static int trueCount = 0, falseCount = 0;
        private static Questions quest;

        public Test(Questions quest) {
            this.quest = quest;
        }

        static void passTest() {
            for (int i=0; i < quest.arrayQuestions.length; i++) {
                if (quest.ask(i)) {
                    System.out.println(quest.userInput + "- это верный ответ");
                    trueCount++;
                }
                else {
                    System.out.println("Ваш ответ: " + quest.userInput + " - это неверный ответ");
                    falseCount++;
                }
                System.out.println("");
            }
            System.out.println("Результат: Правильных ответов " + trueCount + " , Неправильных ответов " + falseCount);
        }
    }
}

