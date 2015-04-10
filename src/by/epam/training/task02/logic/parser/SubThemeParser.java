package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SubThemeParser extends Parser {
    private static final SubThemeParser instance = new SubThemeParser();

    private SubThemeParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        TextComponent parent;
        TextComponent component = null;
        List<String> matches;
        String currText;
        String textForNextParser;
        int zeroIndex = 0;

        if (RegexTools.matches(RegexConstants.SUB_THEME_REGEX, text)) {
            parent = parentComponent;
            matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
            currText = text;
            for (String match : matches) {
                if (currText.indexOf(match) == 0) {
                    currText = RegexTools.removeFirstRegexMatch(RegexConstants.SUB_THEME_REGEX, currText);
                    component = new CompositeTextElement(match);
                    component.setContentText(match);
                    parent.addTextComponent(component);
                    continue;
                }
                textForNextParser = currText.substring(zeroIndex, currText.indexOf(match));
                this.getNextParser().parse(textForNextParser, component);
                component = new CompositeTextElement(match);
                component.setContentText(match);
                parent.addTextComponent(component);

                currText = currText.substring((currText.indexOf(match) + match.length()), currText.length());
            }
            this.getNextParser().parse(currText, component);
        } else {
            this.getNextParser().parse(text, parentComponent);
        }
    }

    public static SubThemeParser getInstance() {
        return instance;
    }

}
