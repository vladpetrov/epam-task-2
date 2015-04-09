package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;

/**
 * Created by Higgs on 08.04.2015.
 */
public class ParagraphParser extends Parser {
    private static final ParagraphParser instance = new ParagraphParser();

    private ParagraphParser() {
    }

    @Override
    public void parse(String text) {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {

    }

    public static ParagraphParser getInstance() {
        return instance;
    }

}
