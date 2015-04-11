package by.epam.training.task02.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public abstract class TextComponent {

    public TextComponent() {
    }

    public void setContentText(String contentText) {
        throw new UnsupportedOperationException();
    }

    public String getContentText() {
        throw new UnsupportedOperationException();
    }

    public void addTextComponent(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    public TextComponent getTextComponent(int index) {
        throw new UnsupportedOperationException();
    }

    public List<TextComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getClass().toString().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TextComponent{}";
    }
}


