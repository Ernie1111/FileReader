import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner consoleInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter the path of the folder you would like to scan for content counting.");
        String rootFilePath = consoleInput.nextLine();  // Read user input

        FileSystemCrawler myFileSystemCrawler = new FileSystemCrawler(rootFilePath);
        myFileSystemCrawler.crawlFileSystem();

        System.out.println("All Done!");
    }
}