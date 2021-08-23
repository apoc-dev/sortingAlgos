public abstract class Sorter {
    
    String algoName;
    int[] unsorted;
    int[] sorted;

    Sorter(int[] toSort){
        unsorted = toSort;
        sorted = new int[toSort.length];
    }

    public abstract void sort();

    public String toString(){
        String str = "";
        for (int i = 0; i < sorted.length; i++) {
            str = str + "," + sorted[i];
        }
        return str;
    }

    public boolean validate(){
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < sorted.length; i++) {
            if(last>sorted[i]){
                return false;
            }
            last = sorted[i];
        }
        return true;

    }
        
    
    
}
