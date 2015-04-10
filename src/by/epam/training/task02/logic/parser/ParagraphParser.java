package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class ParagraphParser extends Parser {
    private static final ParagraphParser instance = new ParagraphParser();

    private ParagraphParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        TextComponent parent;
        TextComponent component = null;
        List<String> matches;
        String currText;
        String textForNextParser;
        int zeroIndex = 0;

        if (RegexTools.matches(RegexConstants.PARAGRAPH_REGEX, text)) {
            parent = parentComponent;
            matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
            currText = text;


        } else {
            this.getNextParser().parse(text, parentComponent);
        }


    }

    public static ParagraphParser getInstance() {
        return instance;
    }

}
