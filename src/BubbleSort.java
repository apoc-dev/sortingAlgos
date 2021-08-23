public class BubbleSort extends Sorter{

    BubbleSort(int[] toSort){
        super(toSort);
        algoName = "BubbleSort";
    }

    public void sort(){
        boolean completed = false;

        while(!completed){
            boolean flag = false;
            for (int i = 0; i < this.unsorted.length-1; i++) {
                int num = unsorted[i];

                if(num > unsorted[i+1]){
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = num;
                    flag = true;
                }
            }
            if(flag == false){
                completed = true;
            }
        }
        sorted = unsorted;
    }
}
