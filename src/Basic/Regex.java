package Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tiejin on 7/30/2018.
 */
public class Regex {
    private static boolean MapStr(String s, String patten) {
        boolean isMatch = Pattern.matches(patten, s);
        return isMatch;
    }

    private static void CatchStr(String s, String patten) {
        // 创建 Pattern 对象
        Pattern p = Pattern.compile(patten);
        // 现在创建 matcher 对象
        Matcher m = p.matcher(s);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }

    public static void main(String[] args) {
        // 1.字符串中是否包含某些字符
        String s1 = "abcdefghi";
        String patt1 = ".*cde.*";
        Boolean ans1 = MapStr(s1, patt1);
        System.out.println("ans1:" + ans1);

        // 2.捕获组
        String s2 = "This order was placed for QT3000! OK?";
        String patt2 = "(\\D*)(\\d+)(.*)";
        CatchStr(s2, patt2);

        // 3.

    }

}
