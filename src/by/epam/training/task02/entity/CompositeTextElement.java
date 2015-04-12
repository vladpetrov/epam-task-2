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
    public String print() {
        String text = "";
        for (TextComponent component : children) {
            if ((component.getClass() != LeafTextElement.class) && (component.getContentText() != "")) {
                text += component.getContentText();
            }
            text += component.print();
        }
        return text;
    }

    @Override
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    @Override
    public String getContentText() {
        return contentText;
    }

    public void addTextComponent(TextComponent component) {
        children.add(component);
    }

    public TextComponent getChild(int index) {
        return children.get(index);
    }

    public List<TextComponent> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeTextElement that = (CompositeTextElement) o;
        if (children != null ? !children.equals(that.children) : that.children != null) return false;
        if (contentText != null ? !contentText.equals(that.contentText) : that.contentText != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = children != null ? children.hashCode() : 0;
        result = 31 * result + (contentText != null ? contentText.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CompositeTextElement{" +
                "children=" + children +
                ", contentText='" + contentText + '\'' +
                '}';
    }

}
