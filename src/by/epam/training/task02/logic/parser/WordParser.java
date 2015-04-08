package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class WordParser extends Parser {
    private static final WordParser instance = new WordParser();

    private WordParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static WordParser getInstance() {
        return instance;
    }

}
