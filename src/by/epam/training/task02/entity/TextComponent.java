package by.epam.training.task02.entity;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public abstract class TextComponent {

    public void setContentText(String contentText) {
        throw new UnsupportedOperationException("Text component: unsupported operation!");
    }

    public abstract String print();

    public String getContentText() {
        throw new UnsupportedOperationException("Text component: unsupported operation!");
    }

    public void addTextComponent(TextComponent textComponent) {
        throw new UnsupportedOperationException("Text component: unsupported operation!");
    }

    public TextComponent getChild(int index) {
        throw new UnsupportedOperationException("Text component: unsupported operation!");
    }

    public List<TextComponent> getChildren() {
        throw new UnsupportedOperationException("Text component: unsupported operation!");
    }


}


