package Java.examples;

public class BubbleSort {
    public static void bubbleSort(){
        int[] array = Presets.getIntArray();

        int arrLen = array.length;
        int temp;
        int step = 0;
        for(int y = arrLen; y > 0; y--){
            for(int i = 1; i < y; i++){
                if(array[i] < array[i - 1]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            System.out.print("#" + step + " ");
            Presets.printIntArray(array);
            step++;
        }
        System.out.println("Bubble sort result: ");
        Presets.printIntArray(array);
    }
}
