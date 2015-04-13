package by.epam.training.task02.minitask;

import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by higgs on 12.04.15.
 */
public final class TextFinder {

    private TextFinder() {
    }

    public static List<String> getParagraphs(TextObject textObject) {
        List<String> paragraphs;
        String text = textObject.getRoot().print();
        paragraphs = RegexTools.findByRegex(RegexConstants.PARAGRAPH_REGEX, text);

        return paragraphs;
    }

    public static List<String> getSentences(List<String> paragraphs) {
        List<String> sentences = new ArrayList<>();
        List<String> permSentences;

        for (String paragraph : paragraphs) {
            permSentences = RegexTools.findByRegex(RegexConstants.SENTENCE_REGEX, paragraph);
            sentences.addAll(permSentences);
        }
        return sentences;
    }

}
