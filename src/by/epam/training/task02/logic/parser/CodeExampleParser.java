package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CodeExampleParser extends Parser {
    private static final CodeExampleParser instance = new CodeExampleParser();

    private CodeExampleParser() {
    }

    @Override
    public void parse(String text) {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {

    }

    public static CodeExampleParser getInstance() {
        return instance;
    }

}
