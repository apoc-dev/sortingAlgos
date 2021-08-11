public class App {
    public static void main(String[] args) throws Exception {
        SelectionSort sSort = new SelectionSort(new int[]{3,4,6,8,1,10,11,5});
        sSort.sort();
        System.out.println(sSort.toString());
    }
}
