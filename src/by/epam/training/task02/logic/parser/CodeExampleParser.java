package by.epam.training.task02.logic.parser;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CodeExampleParser extends Parser {
    private static final CodeExampleParser instance = new CodeExampleParser();

    private CodeExampleParser() {
    }

    @Override
    public String parse(String text) {
        return null;
    }

    public static CodeExampleParser getInstance() {
        return instance;
    }

}
