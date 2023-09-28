import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


//Opens up file
        File filePath = new File("C:\\Users\\Dev\\Developer");
//Reading what is in the file
        File[] listFiles = filePath.listFiles();
//Prints the names of files
        System.out.println("File Names: ");
        for (int i = 0; i < listFiles.length; i++){
            if(listFiles[i].isFile()){
                System.out.println(listFiles[i].getName());
            }
        }



    }
}