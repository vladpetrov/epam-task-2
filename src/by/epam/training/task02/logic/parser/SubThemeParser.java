package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.logic.LogicException;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SubThemeParser extends Parser {

    private Parser nextParser;

    public SubThemeParser() {
    }

    public SubThemeParser(Parser nextParser) {
        setNextParser(nextParser);
    }

    @Override
    public void setNextParser(Parser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public Parser getNextParser() {
        return nextParser;
    }

    @Override
    public void parse(String text, TextComponent parentComponent) throws LogicException {
        TextComponent component = null;
        List<String> matches;
        String currText;
        String textForNextParser;
        int zeroIndex = 0;

        if (RegexTools.matches(RegexConstants.SUB_THEME_REGEX, text)) {
            matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
            currText = text;
            for (String match : matches) {
                if (currText.indexOf(match) == 0) {
                    currText = RegexTools.removeFirstRegexMatch(RegexConstants.SUB_THEME_REGEX, currText);
                    component = new CompositeTextElement(match);
                    parentComponent.addTextComponent(component);
                    continue;
                }
                textForNextParser = currText.substring(zeroIndex, currText.indexOf(match));
                this.getNextParser().parse(textForNextParser, component);
                component = new CompositeTextElement(match);
                parentComponent.addTextComponent(component);
                currText = currText.substring((currText.indexOf(match) + match.length()), currText.length());
            }
            if (currText.length() != 0) {
                this.getNextParser().parse(currText, component);
            }
        } else {
            this.getNextParser().parse(text, parentComponent);
        }

    }

}
