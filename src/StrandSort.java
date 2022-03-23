public class StrandSort extends Sorter{

    int[] sub;

    StrandSort(int[] toSort){
        super(toSort);
        algoName = "StrandSort";
    }

    public void sort(){
        strandSort();
    }

    private void strandSort(){

        sub = new int[0];

        if(input.length == 0){
            return;
        }


        sub = addToArray(input, sub, 0);
        int last = sub[0];
        input = removeFromArray(input, 0);
    
        for (int i = 0; i < input.length; i++) {

            if(input[i] > last){
                sub = addToArray(input, sub, i);
                last = input[i];
                input = removeFromArray(input, i);
                i--;
            }
        }

        this.output = mergeArrays(output, sub);

        strandSort();

    }

    //does not work because 2,5,8 and 5,7,8 = 2,5,5,7,8,8
    //maybe try to merge each number seperatly
    // private int[] mergeArrays(int[] arr1, int[] arr2){
    //     int[] result = new int[arr1.length + arr2.length];
        
    //     System.arraycopy(arr2, 0, result, findIndex(arr1, arr2), arr2.length);
        
    //     int n = 0;
    //     for (int i = 0; i < result.length; i++) {
    //         if(result[i] == 0){
    //             result[i] = arr1[n];
    //             n++;
    //         }
    //     }
        
    //     return result;

    // }


    private int[] mergeArrays(int[] arr1, int[] arr2){
        int [] result = new int[arr1.length + arr2.length];


        int arr1Counter = 0;
        int arr2Counter = 0;

        for (int i = 0; i < result.length;) {

            if (arr1Counter < arr1.length){

                for (int j = arr1Counter; j < arr1.length; j++) {
                    if(arr2Counter < arr2.length){
                        if(arr2[arr2Counter] > arr1[arr1Counter]){
                            result[i] = arr1[arr1Counter];
                            arr1Counter++;
                            i++;
                        }
                    }else{
                        result[i] = arr1[arr1Counter];
                        arr1Counter++;
                        i++;
                    }
                }
            }
            if(arr2Counter < arr2.length){
                result[i] = arr2[arr2Counter];
                arr2Counter++;
                i++;
            }

        }



        return result;
    }


    private int[] addToArray(int[] source, int[] dest, int index){
        
        
        int[] result =  new int[dest.length + 1];
        for (int i = 0; i < dest.length; i++) {
            result[i] = dest[i];
        }
        result[result.length - 1] = source[index];

        return result;
    }

    private int[] removeFromArray(int[] source, int index){

        int[] result = new int[source.length-1];

        int n = 0;
        for (int i = 0; i < source.length; i++) {
            if(i != index){
                result[n] = source[i];
                n++;
            }
        }

        return result;

    }

}
