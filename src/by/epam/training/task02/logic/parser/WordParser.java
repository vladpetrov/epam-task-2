package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;

/**
 * Created by Higgs on 08.04.2015.
 */
public class WordParser extends Parser {
    private static final WordParser instance = new WordParser();

    private WordParser() {
    }

    @Override
    public void parse(String text) {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {

    }

    public static WordParser getInstance() {
        return instance;
    }

}
