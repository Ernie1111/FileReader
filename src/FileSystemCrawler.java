import java.io.File;

/**
 * A File System Crawler Represents an object that given a String which represents the path of the start
 * of the "crawl" can crawl the file system and apply a given FileCrawlerProcessor.
 */
public class FileSystemCrawler {
    private String rootFilePath;
    private FileCrawlerProcessor fileCrawlerProcessor;

    public FileSystemCrawler(String givenPath) {
        // TODO i left this for you todo
    }

    public void crawlFileSystem() {
        // TODO i took this code from what you originally had, modify it to use the FileCrwalerProcessor after you
        // have implemented the methods in that class

        // TODO look up "File Exceptions and how to catch them java"
        // Open up the file
        File filePath = new File(this.rootFilePath);
        File[] listFiles = filePath.listFiles();

        for (int i = 0; i < listFiles.length; i++){

            // Probably move this if logic to the processor.
            if(listFiles[i].isFile()){

            }
            // Figure out how to make use of the processor
        }
    }

}
