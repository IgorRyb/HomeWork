import java.io.*;

public class Main {


    public static void main(String[] args) {
        Writer writer = new Writer("Проверка");
        writer.writeTextInBufferWriter();
        try {
            Reader reader = new Reader();
            reader.readFileText();
        } catch (RuntimeException e) { // 2. rethrow
            System.exit(15); // 3. Остановка приложения
        }
    }

    public static class Writer {
        String text;
        public Writer(String text) {
            this.text = text;
        }

        public void writeTextInBufferWriter() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D://Word//text.txt")) //  4. try-with-resource
            ) {
                writer.write(text);
            } catch (IOException e) {
                System.out.println("Дружище, путь указан некорректно, " + e.getMessage()); // 1. Вывод ошибки
            }
        }

    }

    public static class Reader {
        String c;

        public Reader() {

        }
        public void readFileText() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("D://Word//text.txt"));
                while ((c = reader.readLine()) != null) {
                    System.out.print(c);
                }
            } catch (IOException e) {
                throw new RuntimeException("Произошла ошибка" + e); // 2. rethrow
            }

        }
    }

}