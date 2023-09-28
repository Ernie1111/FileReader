import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * A file Crawler Processor is an object that executes a preset process/appliction on a given file.
 *
 * The Initial Purpose is just to count how many files of each type (extentions) exist within a folder and to recurse
 * in all child folders. This can be augmented later with Polymorphism
 */
public class FileCrawlerProcessor {

    // Use this to map the file extension (txt, csv, png, ...) to an integer that you should start at 0.
    // Everytime you process a file you should increment that file types counter by 1
    private Map<String, Integer> fileExtensionMap;


    public FileCrawlerProcessor() {
        this.fileExtensionMap = new HashMap<String, Integer>();
    }

    public void processFile(File givenFile) {
        // TODO process the file, if the files is X ... then Y
    }

    public void writeOutputFile() {
        // TODO write the output file that tells me how many types of each file existed in the folder tree
    }
}
