package by.epam.training.task02.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CompositeTextElement extends TextComponent {
    private List<TextComponent> children = new ArrayList<>();
    private String contentText = "";

    public CompositeTextElement() {
    }

    public CompositeTextElement(String contentText) {
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
        children.add(component);
    }

    @Override
    public TextComponent getTextComponent(int index) {
        return children.get(index);
    }

    @Override
    public List<TextComponent> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CompositeTextElement that = (CompositeTextElement) o;

        if (contentText != null ? !contentText.equals(that.contentText) : that.contentText != null) return false;
        return !(children != null ? !children.equals(that.children) : that.children != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (contentText != null ? contentText.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CompositeTextElement{" +
                "contentText='" + contentText + '\'' +
                ", children=" + children +
                "} " + super.toString();
    }

}
