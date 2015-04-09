package by.epam.training.task02.run;

import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.logic.parser.*;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;
import by.epam.training.task02.util.textfileutil.TextFileAccessor;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by higgs on 01.04.15.
 */
public class Runner {

    private Parser themeParser;

    public Runner() {
        this.themeParser = ThemeParser.getInstance();
        Parser subThemeParser = SubThemeParser.getInstance();
        Parser paragraphParser = ParagraphParser.getInstance();
        Parser codeExampleParser = CodeExampleParser.getInstance();
        Parser sentenceParser = SentenceParser.getInstance();
        Parser wordParser = WordParser.getInstance();

        themeParser.setNextParser(subThemeParser);
        subThemeParser.setNextParser(paragraphParser);
        paragraphParser.setNextParser(codeExampleParser);
        codeExampleParser.setNextParser(sentenceParser);
        sentenceParser.setNextParser(wordParser);
    }

    public static void main(String[] args) {

        String str = TextFileAccessor.readFromFile("src/text.txt");
        String result;

//        Runner runner = new Runner();
//
//        TextObject textObject = new TextObject();
//
//        runner.themeParser.setTextObject(textObject);
//
//        runner.themeParser.parse(str);


//        List<String> matches = new ArrayList<>();
//
//        str = RegexTools.removeRegexMatch(RegexConstants.THEME_REGEX, str);
//
//        matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, str);


//        result = str.substring(0, str.indexOf(matches.get(1)));

//        System.out.println(result);




        //create chain and give it textObject as parameter


//        TextFileAccessor.writeToFile("src/outp.txt", subNumber);


    }

}
