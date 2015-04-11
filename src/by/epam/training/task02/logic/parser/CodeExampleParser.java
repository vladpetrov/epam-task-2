package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.LeafTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CodeExampleParser extends Parser {
    private static final CodeExampleParser instance = new CodeExampleParser();

    private CodeExampleParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        parentComponent.addTextComponent(new LeafTextElement(text));
    }

    public static CodeExampleParser getInstance() {
        return instance;
    }

}
