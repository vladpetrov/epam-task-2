package by.epam.training.task02.util.regexutil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Higgs on 08.04.2015.
 */
public final class RegexTools {

    private static List<String> resultList;
    private static String resultString;
    private static Pattern pattern;
    private static Matcher matcher;

    private RegexTools() {
    }

    public static List<String> findByRegex(String regex, String text) {
        if (matches(regex, text)) {                        //TODO: optimize code
            pattern = Pattern.compile(regex, Pattern.MULTILINE);        //Multiline regex matching
            matcher = pattern.matcher(text);
            resultList = new ArrayList<>();
            while (matcher.find()) {
                resultList.add(matcher.group());
            }
        }
        return resultList;
    }

    public static String getFirstMatch(String regex, String text) {
        if (matches(regex, text)) {
            pattern = Pattern.compile(regex, Pattern.MULTILINE);
            matcher = pattern.matcher(text);

            matcher.find();
            resultString = matcher.group();

        }
        return resultString;
    }

    public static boolean matches(String regex, String text) {
        pattern = Pattern.compile(regex, Pattern.MULTILINE);        //Multiline regex matching
        matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static String removeRegexMatches(String regex, String text) {
        if (matches(regex, text)) {
            pattern = Pattern.compile(regex, Pattern.MULTILINE);
            matcher = pattern.matcher(text);

            resultString = matcher.replaceAll("");

        }
        return resultString;
    }

    public static String removeFirstRegexMatch(String regex, String text) {
        if (matches(regex, text)) {
            pattern = Pattern.compile(regex, Pattern.MULTILINE);
            matcher = pattern.matcher(text);

            resultString = matcher.replaceFirst("");

        }
        return resultString;
    }


}
