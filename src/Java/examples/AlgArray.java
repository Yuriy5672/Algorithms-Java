package Java.examples;

public class AlgArray {
    //Find minimum element in array
    public static void fmea(){
        int[] array = Presets.getIntArray();

        int minValue = array[0];
        int minIndex = 0;
        int arrLen = array.length;
        for(int i = 1; i < arrLen; i++){
            if(array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }

        Presets.printIntArray(array);
        System.out.println("Min value: " + minValue);
        System.out.println("Min index: " + minIndex);
    }

    //Sorting by choice


}
