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
        int index = 0;
        if (RegexTools.matches(RegexConstants.SUB_THEME_REGEX, text)) {
            parent = parentComponent;
            matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
//            for (String subTheme : matches) {
//                component = new CompositeTextElement(subTheme);
//                parent.addTextComponent(component);
//
//            }

            currText = text;

            for (String match : matches) {
                if (currText.indexOf(match) == 0) continue;
                textForNextParser = currText.substring(index, currText.indexOf(match));
                currText = RegexTools.removeRegexMatch(textForNextParser, currText);
                textForNextParser = RegexTools.removeRegexMatch(RegexConstants.SUB_THEME_REGEX, textForNextParser);

                index = text.indexOf(match);
            }


//            textForNextParser = RegexTools.removeRegexMatch(RegexConstants.THEME_REGEX, text);

//            for(TextComponent childComponent: parent.getChilds()) {
//                this.getNextParser().parse(textForNextParser, childComponent);
//            }
//            this.getNextParser().parse(textForNextParser, component);
        } else {
            this.getNextParser().parse(text, this.getTextObject().getRoot());
        }

    }

    public static SubThemeParser getInstance() {
        return instance;
    }

}
