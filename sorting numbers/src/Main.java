import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        int number = 0;
        List<Integer> list1 = new ArrayList<>();
        Random rand = new Random();
        Sorting sorting = new Sorting();
        FilllingAndPrint.filling(rand, list1);
        FilllingAndPrint.print(list1);
        long startTimeSorting = System.currentTimeMillis();
        sorting.sorting(list1);
        System.out.println("--- После сортировки ---");
        FilllingAndPrint.print(list1);
        long endTimeSorting = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку: " + (endTimeSorting - startTimeSorting) + " миллисекунд");
        List<Integer> list2 = new ArrayList<>();
        FilllingAndPrint.filling(rand, list2);
        long startTimeSorting2 = System.currentTimeMillis();
        Collections.sort(list2);
        long endTimeSorting2 = System.currentTimeMillis();
        System.out.println("Время затраченное на сортировку с Collection.sort: " + (endTimeSorting2 - startTimeSorting2) + " миллисекунд");
    }

    public class FilllingAndPrint {

        private static int number;
        List<Integer> newArray = new ArrayList<>();


        public static List<Integer> filling(Random rand, List array) {
            while (number < 10) {
                array.add(rand.nextInt(-100, 100));
                number++;
            }
            return array;
        }

        public static void print(List array) {
            for (int n = 0; n < array.size(); n++) {
                System.out.println(array.get(n));
            }


        }
    }

    public static class Sorting {


        public List<Integer> sorting(List<Integer> array) {
            for (int i = 0; i < array.size() - 1; i++) {
                int nmin = i;
                int min = array.get(i);
                for (int j = i + 1; j < array.size(); j++) {
                    if (min > array.get(j)) {
                        min = array.get(j);
                        nmin = j;
                    }
                }
                array.set(nmin, array.get(i));
                array.set(i, min);
            }
            return array;
        }
    }

}