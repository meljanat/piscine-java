public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("|");
        String res = "";
        for (int i = 0; i < parts.length; i++) {
            int firstPnt = parts[i].indexOf(".");
            int lastPnt = parts[i].lastIndexOf(".");
            if (firstPnt == lastPnt) {
                lastPnt = parts[i].length();
            }
            parts[i] = parts[i].substring(firstPnt + 1, lastPnt).trim();
            if (parts[i].length() > 0) {
                res += parts[i] + " ";
            }
        }
        return res.trim();
    }
}