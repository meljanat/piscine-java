import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length < 2) {
            return;
        }

        String content_1 = cat(new String[] { args[0] });
        String[] words = content_1.trim().split("\\s+");
        StringBuilder capitalizedContent = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedContent.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        try (OutputStream out = new FileOutputStream(args[1])) {
            out.write(capitalizedContent.toString().trim().getBytes());
            out.flush();
        }
    }

    public static String cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            return "";
        }
        StringBuilder content = new StringBuilder();
        try (InputStream in = new FileInputStream(args[0])) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }
        }
        return content.toString();
    }
}