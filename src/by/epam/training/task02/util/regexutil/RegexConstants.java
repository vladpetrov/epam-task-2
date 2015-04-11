package by.epam.training.task02.util.regexutil;

/**
 * Created by higgs on 01.04.15.
 */
public final class RegexConstants {

        private RegexConstants() {
        }

        public static final String
                THEME_REGEX = "(^(\\d\\.){1}[^\\d\\.].+\\s+)",   //[^\w\s.] - punctuation chars
                SUB_THEME_REGEX = "(^(\\d\\.){2}.+\\s+)",
                PARAGRAPH_REGEX = "(^([A-Z]).*[.:!?]+\\s+)",
                SENTENCE_REGEX = "\\p{Blank}*[A-Z][\\p{Blank}\\w\\p{Punct}&&[^.!?]]*[.:!?][\n]*",
                WORD_REGEX = "((\\b\\w+\\b)|(\n)|(\\p{Blank})|(\\p{Punct}))",
                BLANK_REGEX = "\\p{Blank}",                 //space or tab
                PUNCT_REGEX = "\\p{Punct}";                 //Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~


}