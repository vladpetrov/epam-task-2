package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SentenceParser extends Parser {
    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        TextComponent parent;
        TextComponent component = null;
        List<String> matches;
        String textForNextParser;
        if (RegexTools.matches(RegexConstants.THEME_REGEX, text)) {
            parent = parentComponent;
            matches = RegexTools.findByRegex(RegexConstants.THEME_REGEX, text);
            for (String theme : matches) {
                component = new CompositeTextElement(theme);
                parent.addTextComponent(component);
            }
            textForNextParser = RegexTools.removeRegexMatch(RegexConstants.THEME_REGEX, text);

//            for(TextComponent childComponent: parent.getChilds()) {
//                this.getNextParser().parse(textForNextParser, childComponent);
//            }
            this.getNextParser().parse(textForNextParser, component);
        } else {
            this.getNextParser().parse(text, this.getTextObject().getRoot());
        }

    }

    public static SentenceParser getInstance() {
        return instance;
    }

}
