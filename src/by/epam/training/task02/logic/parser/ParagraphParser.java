package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class ParagraphParser extends Parser {
    private static final ParagraphParser instance = new ParagraphParser();

    private ParagraphParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static ParagraphParser getInstance() {
        return instance;
    }

}
