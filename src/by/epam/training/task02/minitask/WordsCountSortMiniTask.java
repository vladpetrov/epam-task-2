package by.epam.training.task02.minitask;

import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.util.comparator.WordsCountComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by higgs on 12.04.15.
 */
public class WordsCountSortMiniTask implements MiniTask {

    private TextObject textObject;
    private Comparator comparator = new WordsCountComparator();

    public WordsCountSortMiniTask() {
    }

    public WordsCountSortMiniTask(TextObject textObject) {
        this.textObject = textObject;
    }

    @Override
    public void execute() {
        List<String> sentences = TextFinder.getSentences(TextFinder.getParagraphs(textObject));
        Collections.sort(sentences, comparator);

        System.out.println("Sentences sorted by words count: ");

        for (String str : sentences) {
            System.out.println(str);
        }
    }

}
