package by.epam.training.task02.run;

import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.logic.LogicException;
import by.epam.training.task02.logic.parser.*;
import by.epam.training.task02.util.textfileutil.TextFileAccessor;

import org.apache.log4j.Logger;

/**
 * Created by higgs on 01.04.15.
 */
public class Runner {
    private static Logger log = Logger.getLogger(Runner.class);

    public static void main(String[] args) {

        String text = TextFileAccessor.readFromFile("src/resources/text.txt");

        Parser codeParser = new CodeParser();
        Parser wordParser = new WordParser();
        Parser sentenceParser = new SentenceParser(wordParser);
        Parser paragraphParser = new ParagraphParser(sentenceParser);
        Parser subThemeParser = new SubThemeParser(paragraphParser);
        Parser themeParser = new ThemeParser(subThemeParser);

        TextObject textObject = new TextObject();

        themeParser.setTextObject(textObject);
        paragraphParser.setCodeParser(codeParser);

        try {
            themeParser.parse(text);
        } catch(LogicException e) {
            e.printStackTrace();
            log.error("ERROR WHEN PARSING TEXT", e);
        }

        String textFromObject = textObject.getRoot().print();
        TextFileAccessor.writeToFile("src/resources/outp.txt", textFromObject);
    }

}
