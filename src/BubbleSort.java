public class BubbleSort extends Sorter{

    BubbleSort(int[] toSort){
        super(toSort);
        algoName = "BubbleSort";
    }

    public void sort(){
        boolean completed = false;

        while(!completed){
            boolean flag = false;
            for (int i = 0; i < this.input.length-1; i++) {
                int num = input[i];

                if(num > input[i+1]){
                    input[i] = input[i+1];
                    input[i+1] = num;
                    flag = true;
                }
            }
            if(flag == false){
                completed = true;
            }
        }
        output = input;
    }
}
