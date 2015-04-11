package by.epam.training.task02.entity;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class LeafTextElement extends TextComponent {
    private String contentText = "";

    public LeafTextElement() {
    }

    public LeafTextElement(String contentText) {
        setContentText(contentText);
    }

    @Override
    public String print() {
        return contentText;
    }

    @Override
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    @Override
    public String getContentText() {
        return contentText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeafTextElement that = (LeafTextElement) o;
        if (contentText != null ? !contentText.equals(that.contentText) : that.contentText != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return contentText != null ? contentText.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LeafTextElement{" +
                "contentText='" + contentText + '\'' +
                '}';
    }

}
