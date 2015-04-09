package by.epam.training.task02.logic.factory;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.LeafTextElement;
import by.epam.training.task02.entity.TextComponent;

/**
 * Created by higgs on 09.04.15.
 */
public final class TextComponentFactory {

    private TextComponentFactory() {
    }

    public static TextComponent getLeafTextElement(String leafContent) {
        return new LeafTextElement(leafContent);
    }

    public static TextComponent getCompositeTextElement(String compositeContent) {
        return new CompositeTextElement(compositeContent);
    }


}
