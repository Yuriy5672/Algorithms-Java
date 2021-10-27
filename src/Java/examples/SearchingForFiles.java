package Java.examples;

import java.io.File;
import java.util.List;

public class SearchingForFiles {
    private static List<File> resultFileList;

    //Search for the specified files by the specified path
    public static void searchForFilesInFolders(){
        searchFiles(Presets.getPathToRootFolder(), Presets.getArrayListFile());
        Presets.printListFile(resultFileList);
    }

    //Traversing the tree in depth based on recursion
    private static void searchFiles(File rootFile, List<File> fileList){
        System.out.println("Searching at: " + rootFile.getAbsolutePath());
        File[] directoryFiles = rootFile.listFiles();
        if(directoryFiles != null){
            for(File file: directoryFiles){
                if(file.isDirectory()){
                    searchFiles(file, fileList);
                }else{
                    if(file.getName().toLowerCase().endsWith(Presets.getFileType()))
                        fileList.add(file);
                }
            }
        }else{
            System.out.println("ERROR: No directory files found");
        }
        resultFileList = fileList;
    }

}
