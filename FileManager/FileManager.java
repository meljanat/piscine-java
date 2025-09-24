import java.io.*;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

    public static String getContentFile(String fileName) throws IOException {
        return cat(fileName);
    }

    public static void deleteFile(String fileName) {
        new File(fileName).delete();
    }

    public static String cat(String args) throws IOException {
        if (args == null) {
            return "";
        }
        StringBuilder content = new StringBuilder();
        try (InputStream in = new FileInputStream(args)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }
        }
        return content.toString();
    }
}