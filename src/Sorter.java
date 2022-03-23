public abstract class Sorter {
    
    String algoName;
    int[] input;
    int[] output;

    Sorter(int[] toSort){
        input = toSort;
        output = new int[0];
    }

    public abstract void sort();

    public String toString(){
        String str = Integer.toString(output[0]);
        for (int i = 1; i < output.length; i++) {
            str = str + "," + output[i];
        }
        return str;
    }

    public boolean validate(){
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < output.length; i++) {
            if(last>output[i]){
                return false;
            }
            last = output[i];
        }
        return true;

    }
        
    
    
}
