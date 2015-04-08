package by.epam.training.task02.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class CompositeTextElement extends TextComponent {

    private String contentText;
    private List<TextComponent> childs = new ArrayList<>();

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
        childs.add(component);
    }

    @Override
    public TextComponent getTextComponent(int index) {
        return childs.get(index);
    }

    @Override
    public List<TextComponent> getChilds() {
        return childs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CompositeTextElement that = (CompositeTextElement) o;

        if (contentText != null ? !contentText.equals(that.contentText) : that.contentText != null) return false;
        return !(childs != null ? !childs.equals(that.childs) : that.childs != null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (contentText != null ? contentText.hashCode() : 0);
        result = 31 * result + (childs != null ? childs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CompositeTextElement{");
        sb.append("contentText='").append(contentText).append('\'');
        sb.append(", childs=").append(childs);
        sb.append('}');
        return sb.toString();
    }

}
