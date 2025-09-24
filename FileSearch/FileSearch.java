import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static String searchFile(String fileName) {
        String currentDir = "documents";
        return searchInside(fileName, currentDir);
    }

    public static String searchInside(String fileName, String directory) throws IOException {
        File dir = new File(directory);
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    String result = searchInside(fileName, file.getAbsolutePath());
                    if (result != null) {
                        return result;
                    }
                } else if (file.getName().equals(fileName)) {
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }
}