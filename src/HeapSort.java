public class HeapSort extends Sorter{

    HeapSort(int[] toSort){
        super(toSort);
        algoName = "HeapSort";
    }

    public void sort(){

        int n = input.length;

        for (int i = n / 2 - 1; i >= 0; i--){
          heapify(input, n, i);
        }
            
        for (int i = n-1; i > 0; i--) {
            
            int largest = input[0];
            input[0] = input[i];
            input[i] = largest;

            heapify(input, i, 0);

        }

        
        output = input;

    }

    private void heapify(int[] arr, int lenght, int root){

        int largest = root;

        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if( left < lenght && arr[left] > arr[largest]){
            largest = left;
        }

        if ( right < lenght && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;
            heapify(arr, lenght, largest);
        }


    }
    
}
