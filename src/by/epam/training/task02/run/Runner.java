package by.epam.training.task02.run;

import by.epam.training.task02.util.regexutil.RegexSearch;
import by.epam.training.task02.util.textfileutil.TextFileAccessor;
import by.epam.training.task02.util.regexutil.RegexConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by higgs on 01.04.15.
 */
public class Runner {

    public static void main(String[] args) {

        List<String> matches = new ArrayList<>();

        String str = TextFileAccessor.readFromFile("src/text.txt");

        matches = RegexSearch.findByRegex(RegexConstants.SUB_THEME_REGEX, str);
//
        for(String line : matches) {
            System.out.println(line);
        }

//        TextFileAccessor.writeToFile("src/outp.txt", subNumber);
    }

}
