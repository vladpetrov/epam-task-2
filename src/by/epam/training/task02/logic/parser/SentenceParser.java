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

    public SentenceParser() {
        super();
    }

    public SentenceParser(Parser nextParser) {
        super();
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
    public void parse(String text, TextComponent parentComponent) {
        TextComponent component;
        List<String> matches;

        if (RegexTools.matches(RegexConstants.SENTENCE_REGEX, text)) {
            matches = RegexTools.findByRegex(RegexConstants.SENTENCE_REGEX, text);
            for (String match : matches) {
                component = new CompositeTextElement(match);
                parentComponent.addTextComponent(component);
                this.getNextParser().parse(match, component);
            }
        } else {
            this.getNextParser().parse(text, parentComponent);
        }
    }

}
