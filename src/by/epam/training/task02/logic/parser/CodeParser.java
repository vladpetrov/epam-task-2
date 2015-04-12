package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.LeafTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.logic.LogicException;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CodeParser extends Parser {

    public CodeParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) throws LogicException {
        parentComponent.addTextComponent(new LeafTextElement(text));
    }

}
