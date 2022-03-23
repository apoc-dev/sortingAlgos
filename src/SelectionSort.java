public class SelectionSort extends Sorter{

    SelectionSort(int[] toSort){
        super(toSort);
        algoName = "SelectionSort";
    }

    public void sort(){
        output = new int[input.length];
        for (int i = 0; i < output.length; i++) {
            int index = findIndex(findMin(input));
            output[i] = input[index];
            input[index] = Integer.MAX_VALUE;
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
        for (int i = 0; i < output.length; i++) {
            if(input[i] == value){
                return i;
            }
        }
        return -1;
    }
}
