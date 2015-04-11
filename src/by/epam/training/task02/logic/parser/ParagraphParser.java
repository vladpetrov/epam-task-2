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

    private Parser codeParser;

    private ParagraphParser() {
    }

    public Parser getCodeParser() {
        return codeParser;
    }

    public void setCodeParser(Parser codeParser) {
        this.codeParser = codeParser;
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {
        TextComponent component = null;
        List<String> matches;
        String currText;
        String textForNextParser;
        int zeroIndex = 0;

        if (RegexTools.matches(RegexConstants.PARAGRAPH_REGEX, text)) {
            matches = RegexTools.findByRegex(RegexConstants.PARAGRAPH_REGEX, text);
            currText = text;
            for (String match : matches) {
                if (currText.indexOf(match) == 0) {
                    currText = RegexTools.removeFirstRegexMatch(RegexConstants.PARAGRAPH_REGEX, currText);
                    component = new CompositeTextElement(match);
                    parentComponent.addTextComponent(component);
                    this.getNextParser().parse(match, component);
                    continue;
                }
                textForNextParser = currText.substring(zeroIndex, currText.indexOf(match));
                this.getCodeParser().parse(textForNextParser, component);
                component = new CompositeTextElement(match);
                parentComponent.addTextComponent(component);
                this.getNextParser().parse(match, component);

                currText = currText.substring((currText.indexOf(match) + match.length()), currText.length());
            }
            if (currText.length() != 0) {
                this.getCodeParser().parse(currText, component);
            }
        } else {
            this.getNextParser().parse(text, parentComponent);
        }

    }

    public static ParagraphParser getInstance() {
        return instance;
    }

}
