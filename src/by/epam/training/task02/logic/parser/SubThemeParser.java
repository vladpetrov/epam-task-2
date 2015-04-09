package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SubThemeParser extends Parser {
    private static final SubThemeParser instance = new SubThemeParser();

    private SubThemeParser() {
    }

    @Override
    public void parse(String text) {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {

    }

    public static SubThemeParser getInstance() {
        return instance;
    }

}
