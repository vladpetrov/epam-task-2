package by.epam.training.task02.minitask;

import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by higgs on 12.04.15.
 */
public class GivenLengthWordsMiniTask implements MiniTask {

    private TextObject textObject;
    private int wordLength;

    public GivenLengthWordsMiniTask() {
    }

    public GivenLengthWordsMiniTask(TextObject textObject, int wordLength) {
        this.textObject = textObject;
        this.wordLength = wordLength;
    }

    @Override
    public void execute() {
        List<String> sentences = TextFinder.getSentences(TextFinder.getParagraphs(textObject));
        Set<String> resultWords = new LinkedHashSet<>();
        List<String> suitableWords;

        for (String sentence : sentences) {
            if (RegexTools.matches("\\?", sentence)) {
                suitableWords = RegexTools.findByRegex("\\b\\w{" + wordLength + "}\\b", sentence);
                for (String word : suitableWords) {
                    resultWords.add(word);
                }
            }
        }

        System.out.println("Interrogative sentences " + wordLength + "-symbols length words:");
        for (String str : resultWords) {
            System.out.println(str);
        }
    }

}
