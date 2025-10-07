public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(\\d+)(cm|€)( )", "$1$3");
    }

    public static String obfuscateEmail(String s) {
        int atIdx = s.indexOf('@');
        if (atIdx == -1)
            return s;

        String username = s.substring(0, atIdx);
        String domain = s.substring(atIdx + 1);

        String obfUser = username;
        if (username.matches(".*[-._].*")) {
            obfUser = username.replaceAll("(?<=[-._]).", "*").replaceAll("(?<=.)(?=[-._])", "*");
        } else if (username.length() > 3) {
            obfUser = username.substring(0, username.length() - 3) + "***";
        }

        String[] domainParts = domain.split("\\.");
        String obfDomain = domain;
        if (domainParts.length == 3) {
            obfDomain = "*" + "." + domainParts[1] + ".*";
        } else if (domainParts.length == 2) {
            String tld = domainParts[1];
            if (!tld.equals("com") && !tld.equals("org") && !tld.equals("net")) {
                obfDomain = "*.*";
            }
        }

        return obfUser + "@" + obfDomain;
    }
}