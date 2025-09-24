import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            return;
        }
        try (InputStream in = new FileInputStream(args[0])) {
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            System.out.flush();
        }
    }
}