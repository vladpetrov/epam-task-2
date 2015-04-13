package by.epam.training.task02.minitask;

import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by higgs on 12.04.15.
 */
public class UniqueWordSearchMiniTask implements MiniTask {

    private TextObject textObject;

    public UniqueWordSearchMiniTask() {
    }

    public UniqueWordSearchMiniTask(TextObject textObject) {
        this.textObject = textObject;
    }

    @Override
    public void execute() {
        List<String> sentences = TextFinder.getSentences(TextFinder.getParagraphs(textObject));
        String firstSentence = sentences.get(0);
        List<String> firstSentenceWords = RegexTools.findByRegex(RegexConstants.WORD_REGEX, firstSentence);

        System.out.println("Unique words from first sentence:");

        boolean uniqueWordFlag = false;

        for (String word : firstSentenceWords) {
            for (String sentence : sentences) {
                if (sentence.equals(firstSentence)) continue;
                if (RegexTools.matches(word.toLowerCase(), sentence.toLowerCase())) {
                    uniqueWordFlag = false;
                    break;
                }
                uniqueWordFlag = true;
            }
            if (uniqueWordFlag) {
                System.out.println(word);
            }
        }

    }

}
