
 import java.io.IOException;
 import java.net.URL;
 import java.util.Scanner;


 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

public class labetrwqqW {

    public static void main(String[] args) {

        String test = new String();
        test = "http://erdani.com/tdpl/hamlet.txt";

      String test2= urlToString(test);

      String in = "i have a male cat. the color of male cat is Black";
      int i = 0;
      Pattern p = Pattern.compile("Hamlet");
      Matcher m = p.matcher( test2 );
      while (m.find()) {
          i++;
      }
      System.out.println(i);






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
