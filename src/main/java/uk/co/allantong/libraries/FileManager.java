package uk.co.allantong.libraries;

// References external packages or dependencies
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

// A demonstration of how external Libraries / JARS can be used
public class FileManager {

    // The Encoding defaults to UTF-8, an option for someone who is not interested in how the file
    // data will be stored
    public static void writeToFile(String filePath, String data) {
        writeToFile(filePath, data, "UTF-8");
    }

    // Overloaded Method, i.e. two methods with the same name, but different arguments
    // Also demonstrates how error exception or error handling is implemented
    public static void writeToFile(String filePath, String data, String encoding) {
        try {
            FileUtils.writeStringToFile(new File(filePath), data, encoding);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
