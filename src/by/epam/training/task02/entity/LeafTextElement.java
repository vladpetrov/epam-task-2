package by.epam.training.task02.entity;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class LeafTextElement extends TextComponent {

    private String contentText;

    public LeafTextElement() {
    }

    public LeafTextElement(String contentText) {
        this.contentText = contentText;
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
    public void addTextComponent(TextComponent component) {
    }

    @Override
    public TextComponent getTextComponent(int index) {
        return null;
    }

    @Override
    public List<TextComponent> getChilds() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LeafTextElement that = (LeafTextElement) o;

        return !(contentText != null ? !contentText.equals(that.contentText) : that.contentText != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (contentText != null ? contentText.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LeafTextElement{" +
                "contentText='" + contentText + '\'' +
                "} " + super.toString();
    }
}
