public class QuickSort extends Sorter{

    QuickSort(int[] toSort){
        super(toSort);
        algoName = "QuickSort";
    }

    private int[] swapArr(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public void sort(){
        quickSort(unsorted, 0, unsorted.length-1);

        sorted = unsorted;
    }

    private void quickSort(int[] arr, int low, int high){
        if(low < high){

            // determine pivot
            int pivot = partition(arr, low, high);

            //split
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high){

        // pivot always last
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            
            if(arr[j] < pivot){
                i++;
                swapArr(arr, i, j);
            }

        }

        swapArr(arr, i+1, high);
        return i+1;

    }
    
}
