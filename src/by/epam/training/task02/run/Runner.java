package by.epam.training.task02.run;

import by.epam.training.task02.entity.LeafTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.logic.parser.*;
import by.epam.training.task02.util.textfileutil.TextFileAccessor;

/**
 * Created by higgs on 01.04.15.
 */
public class Runner {
    public static void main(String[] args) {

        Parser codeParser = new CodeParser();
        Parser wordParser = new WordParser();
        Parser sentenceParser = new SentenceParser(wordParser);
        Parser paragraphParser = new ParagraphParser(sentenceParser);
        Parser subThemeParser = new SubThemeParser(paragraphParser);
        Parser themeParser = new ThemeParser(subThemeParser);

        TextObject textObject = new TextObject();
        themeParser.setTextObject(textObject);

        paragraphParser.setCodeParser(codeParser);

        String text = TextFileAccessor.readFromFile("src/text.txt");

        themeParser.parse(text);

        String textFromObject = textObject.getRoot().print();

        TextFileAccessor.writeToFile("src/outp.txt", textFromObject);

    }

}
