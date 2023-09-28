import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


//Opens up file
        File filePath = new File("C:\\Users\\Dev\\Developer");
//Reading what is in the file
        File[] listFiles = filePath.listFiles();
//Prints the names of files in a text file

        try {
            FileWriter writer = new FileWriter("ListofFiles.txt");
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    writer.write(listFiles[i].getName());

                }

            }
        }

        catch(IOException e){
                e.printStackTrace();
            }
        }
    }

