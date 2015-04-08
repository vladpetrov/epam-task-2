package by.epam.training.task02.entity;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public abstract class TextComponent {

    public abstract void setContentText(String contentText);

    public abstract String getContentText();

    public abstract void addTextComponent(TextComponent component);

    public abstract TextComponent getTextComponent(int index);

    public abstract List<TextComponent> getChilds();

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
        final StringBuffer sb = new StringBuffer("TextComponent{");
        sb.append("hashCode: " + hashCode());
        sb.append('}');
        return sb.toString();
    }
}
