public class SelectionSort extends Sorter{

    SelectionSort(int[] toSort){
        super(toSort);
        algoName = "SelectionSort";
    }

    public void sort(){
        for (int i = 0; i < sorted.length; i++) {
            int index = findIndex(findMin(unsorted));
            sorted[i] = unsorted[index];
            unsorted[index] = Integer.MAX_VALUE;
        }
    }

    private int findMin(int[] toSearch){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < toSearch.length; i++) {
            if(toSearch[i] < minValue){
                minValue = toSearch[i];
            }
        }
        return minValue;
    }

    private int findIndex(int value){
        for (int i = 0; i < sorted.length; i++) {
            if(unsorted[i] == value){
                return i;
            }
        }
        return -1;
    }
}
