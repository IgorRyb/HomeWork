
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Answer ans1 = new Answer(1, "Один");
        Answer ans2 = new Answer(2, "Два");
        Answer ans3 = new Answer(3, "Три");
        Answer ans4 = new Answer(4, "Четыре");
        Answer ans5 = new Answer(5, "Пять");
        Answer arrayAnswer1[] = {ans1, ans2, ans3, ans4, ans5};
        Question que1 = new Question("Сколько существует примитивных типов в языке Java?", arrayAnswer1 , ans4);
        Answer ans11 = new Answer(1, "Pull-up");
        Answer ans12 = new Answer(2, "Pull Request");
        Answer ans13 = new Answer(3, "Commit");
        Answer ans14 = new Answer(4, "Branch");
        Answer arrayAnswer2[] = {ans11, ans12, ans13, ans14};
        Question que2 = new Question("Как называется состояние репозитория в Git на какой-то момент времени?", arrayAnswer2 ,ans13);
        Answer ans21 = new Answer(1, "static");
        Answer ans22 = new Answer(2, "void");
        Answer ans23 = new Answer(3, "final");
        Answer ans24 = new Answer(4, "public");
        Answer arrayAnswer3[] = {ans21, ans22, ans23, ans24};
        Question que3 = new Question(" Как называется модификатор для создания константы?", arrayAnswer3 ,ans23);
        Question arrayQuestions[] = {que1, que2,que3};
        Test test = new Test(arrayQuestions);
        test.passTest();
    }

    public static class Question {

        // {"а) Сколько существует примитивных типов в языке Java?", " б) Как называется состояние репозитория в Git на какой-то момент времени?", "в) Как называется модификатор для создания константы?"};
        private String textQuestion;
        boolean isCorrect;
        int userInput;
        private Answer trueAnswer;
        private Answer[] arrayAnswer;


        public Question(String textQuestion, Answer[] arrayAnswer, Answer trueAnswer) {
            this.textQuestion = textQuestion;
            this.arrayAnswer = arrayAnswer;
            this.trueAnswer = trueAnswer;
        }

        boolean ask() {
                int b = 0;
                System.out.println(this.textQuestion + " Варианты ответов:");
                while (b < this.arrayAnswer.length) {
                    System.out.println(this.arrayAnswer[b].code + "."+ this.arrayAnswer[b].textAnswer);
                    b++;
                }
                Scanner scan = new Scanner(System.in);
                userInput = scan.nextInt();
                if (userInput == trueAnswer.code) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
            return isCorrect;
        }

    }

    public static class Answer {
        private int code;
        private String textAnswer;

        public Answer(int code, String textAnswer) {
            this.textAnswer = textAnswer;
            this.code = code;
        }

        // {{"1. Один", "2. Два", "3. Три", "4. Четыре", "5. Пять"}, {"1. Pull-up", "2. Pull Request", "3. Commit", "4. Branch"}, {"1. static", "2. void", "3. final", "4. public"}};


    }

    public static class Test {
        static int trueCount = 0, falseCount = 0;
        private static Question[] quests;
        public Test(Question[] quests) {
            this.quests =  quests;
        }

        static void passTest() {
            for (int i=0; i < quests.length; i++) {
                if (quests[i].ask()) {
                    System.out.println(quests[i].userInput + "- это верный ответ");
                    trueCount++;
                }
                else {
                    System.out.println("Ваш ответ: " + quests[i].userInput + " - это неверный ответ");
                    falseCount++;
                }
                System.out.println("");
            }
            System.out.println("Результат: Правильных ответов " + trueCount + " , Неправильных ответов " + falseCount);
        }
    }
}

