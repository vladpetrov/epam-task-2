package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextObject;

import java.util.regex.Pattern;

/**
 * Created by Higgs on 08.04.2015.
 */
public abstract class Parser {

    protected TextObject textObject;
    protected Parser nextParser;


    public TextObject getTextObject() {
        return textObject;
    }

    public void setTextObject(TextObject textObject) {
        this.textObject = textObject;
    }

    public void setNextParser(Parser nextParser) {
        this.nextParser = nextParser;
    }

    public Parser getNextParser() {
        return nextParser;
    }

    public String parse(String text) {
        String parsed = null;
        if(getNextParser() != null) {
            parsed = getNextParser().parse(text);
        }
        return parsed;
    }

}
