package by.epam.training.task02.run;

import by.epam.training.task02.entity.CompositeTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.logic.parser.*;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;
import by.epam.training.task02.util.textfileutil.TextFileAccessor;

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
        subThemeParser.setNextParser(codeExampleParser);
        codeExampleParser.setNextParser(paragraphParser);
        paragraphParser.setNextParser(sentenceParser);
        sentenceParser.setNextParser(wordParser);
    }

    public static void main(String[] args) {

        String text = TextFileAccessor.readFromFile("src/text.txt");
        TextObject textObject = new TextObject();
        Runner runner = new Runner();
        runner.themeParser.setTextObject(textObject);
        runner.themeParser.parse(text);

        for (TextComponent component : textObject.getRoot().getChilds()) {
            System.out.println(component);
        }

//////////////////////////////////////////////////////////////////////////////////////////
//    	List<String> matches;
//
//
//        String result;
//
//        matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
//
//        result = text.substring(text.indexOf(matches.get(0)) + matches.get(0).length(), text.indexOf(matches.get(1)));
//
//        System.out.println(result);
//        System.out.println();
//        System.out.println();
//
//        text = text.substring(text.indexOf(matches.get(1)) + matches.get(1).length(), text.length());
//
//        System.out.println(text);


        ////////////////////////////////////////////////////////////////////////////////

//        TextObject textObject = new TextObject();
//
//        TextComponent parent;
//        TextComponent component = null;
//        List<String> matches;
//        String currText;
//        String textForNextParser;
//        int zeroIndex = 0;
//
//        text = RegexTools.removeFirstRegexMatch(RegexConstants.THEME_REGEX, text);
//
//        if (RegexTools.matches(RegexConstants.SUB_THEME_REGEX, text)) {
//            parent = textObject.getRoot();
//            matches = RegexTools.findByRegex(RegexConstants.SUB_THEME_REGEX, text);
//            currText = text;
//
//            for (String match : matches) {
//                if (currText.indexOf(match) == 0) {
//                	component = new CompositeTextElement(match);
//                	parent.addTextComponent(component);
//                	currText = RegexTools.removeFirstRegexMatch(RegexConstants.SUB_THEME_REGEX, currText);
//                    System.out.println("index zero start\n\n");
//                    System.out.println(currText + "\n\n");
//                    System.out.println("index zero end\n\n");
//                    continue;
//                }
//                textForNextParser = currText.substring(zeroIndex, currText.indexOf(match));
//                System.out.println(textForNextParser);
//                System.out.println();
//                System.out.println();
////                this.getNextParser().parse(textForNextParser, component);
//                component = new CompositeTextElement(match);
//                parent.addTextComponent(component);
//                currText = currText.substring((currText.indexOf(match) + match.length()), currText.length());
//
//            }
//
////          this.getNextParser().parse(textForNextParser, component);
//            //send curr text to next parser
//            System.out.println(currText);
//
//        }


        ///////////////////////////////////////////////////////////////////////
        
        
        
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


//////////////////////////////////////////////////////////////////////

        //create chain and give it textObject as parameter


//        TextFileAccessor.writeToFile("src/outp.txt", subNumber);


    }

}
