package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SentenceParser extends Parser {
    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static SentenceParser getInstance() {
        return instance;
    }

}
