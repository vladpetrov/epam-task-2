package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class ThemeParser extends Parser {
    private static final ThemeParser instance = new ThemeParser();

    private ThemeParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static ThemeParser getInstance() {
        return instance;
    }

}
