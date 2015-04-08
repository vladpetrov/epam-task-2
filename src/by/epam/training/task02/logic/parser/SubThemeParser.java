package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SubThemeParser extends Parser {
    private static final SubThemeParser instance = new SubThemeParser();

    private SubThemeParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static SubThemeParser getInstance() {
        return instance;
    }

}
