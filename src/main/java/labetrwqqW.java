
 import java.io.IOException;
 import java.net.URL;
 import java.util.Scanner;




public class labetrwqqW {

    public static void main(String[] args) {

        String test = new String();
        test = "http://erdani.com/tdpl/hamlet.txt";

      String test2= urlToString(test);
System.out.println(test2);

        /**
         * Retrieve contents from a URL and return them as a string.
         *
         * @param url url to retrieve contents from
         * @return the contents from the url as a string, or an empty string on error
         */
}

        public static String urlToString(final String url) {
            Scanner urlScanner;
            try {
                urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
            } catch (IOException e) {
                return "";
            }
            String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            return contents;
        }

}
