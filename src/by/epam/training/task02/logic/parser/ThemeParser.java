package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class ThemeParser extends Parser {
    private static final ThemeParser instance = new ThemeParser();

    private ThemeParser() {
    }

    @Override
    public void parse(String text) {
        parse(text, this.getTextObject().getRoot());
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        if (RegexTools.matches(RegexConstants.THEME_REGEX, text)) {
            TextComponent parent = parentComponent;
            List<String> matches = RegexTools.findByRegex(RegexConstants.THEME_REGEX, text);
            for (String theme : matches) {
                TextComponent component = new CompositeTextElement(theme);
                parent.addTextComponent(component);
            }
            String textForNextParser = RegexTools.removeRegexMatch(RegexConstants.THEME_REGEX, text);
//            this.getNextParser().parse(textForNextParser);

            System.out.println(textForNextParser);

        } else {
            this.getNextParser().parse(text);
        }
    }

    public static ThemeParser getInstance() {
        return instance;
    }

}
