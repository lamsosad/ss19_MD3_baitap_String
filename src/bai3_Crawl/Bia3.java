package bai3_Crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bia3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            InputStreamReader source = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(source);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // regex
            Pattern p = Pattern.compile("<a\\s+href=\"([^\"]*)\"[^>]*>(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (Exception e) {
            System.err.println("Lỗi tý");
        }
    }
}
