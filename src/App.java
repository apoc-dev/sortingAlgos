import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // prepare env
        Random random = new Random();

        // prepare array to sort
        int arrlenght = 100000;
        int[] toSort = new int[arrlenght];
        for (int i = 0; i < arrlenght; i++) {
            toSort[i] = random.nextInt(arrlenght);
        }

        System.out.println(Sorting(new SelectionSort(copyArr(toSort))));        
        System.out.println(Sorting(new BubbleSort(copyArr(toSort))));
        System.out.println(Sorting(new QuickSort(copyArr(toSort))));
    }

    static String Sorting(Sorter sorter){

        Timer timer = new Timer();
        timer.start();
        sorter.sort();
        timer.stop();
        //System.out.println(sorter.toString());
        return sorter.algoName + " | Valid: " + sorter.validate() + " | Sorting took: " + timer.getTime() + "ms";

    }

    static int[] copyArr(int[] source){
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        return result;
    }
}
