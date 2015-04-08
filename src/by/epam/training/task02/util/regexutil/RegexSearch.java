package by.epam.training.task02.util.regexutil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Higgs on 08.04.2015.
 */
public final class RegexSearch {

    private static List<String> result;
    private static Pattern pattern;
    private static Matcher matcher;

    private RegexSearch() {
    }

    public static List<String> findByRegex(String regex, String text) {

        if(matches(regex, text)) {                        //TODO: optimize code
            matcher = pattern.matcher(text);
            pattern = Pattern.compile(regex, Pattern.MULTILINE);        //Multiline regex matching
            result = new ArrayList<>();
            while (matcher.find()) {
                result.add(matcher.group());
            }
        }
        return result;
    }

    public static boolean matches(String regex, String text) {
        pattern = Pattern.compile(regex, Pattern.MULTILINE);        //Multiline regex matching
        matcher = pattern.matcher(text);

        return matcher.find();
    }

}
