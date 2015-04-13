package by.epam.training.task02.util.comparator;

import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.Comparator;

/**
 * Created by higgs on 12.04.15.
 */
public class WordsCountComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int count1 = RegexTools.findByRegex(RegexConstants.WORD_REGEX, o1).size();
        int count2 = RegexTools.findByRegex(RegexConstants.WORD_REGEX, o2).size();

        if (count1 > count2) {
            return 1;
        } else if (count1 < count2) {
            return -1;
        } else {
            return 0;
        }

    }

}
