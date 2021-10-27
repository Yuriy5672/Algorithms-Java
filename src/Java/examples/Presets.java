package Java.examples;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Presets {
    private static int[] intArray = new int[] {90, 34, 83,
            37, 94, 48, 59, 3, 5, 3, 32, 43, 83, 51};
    public static int[] getIntArray() {return intArray;}

    private static String fileType = ".txt";
    public static String getFileType() {return fileType;}

    private static ArrayList<File> fileList = new ArrayList<>();
    public static ArrayList<File> getArrayListFile(){return fileList;}

    private static File filePathToRootFolder =
            new File("/path");
    public static File getPathToRootFolder(){return filePathToRootFolder;}

    public static void printIntArray(int[] array){
        System.out.print("Current array: ");
        for (int i:array)
            System.out.print(i + " ");
        System.out.println("");
    }

    public static void printListFile(List<File> listFile){
        System.out.println("Current list: ");
        for (File file:listFile)
            System.out.println(file.getName() + " ");
        System.out.println("");
    }

}
