package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openapitools.model.TextDateAnnotation;

public class DateAnnotator {

    class NamedPattern{
        public String name;
        public Pattern pattern;

        public NamedPattern(String name, Pattern pattern){
            this.name = name;
            this.pattern = pattern;
        }
    }

    class Span{
        int begin;
        int end;
        int length;

        public Span(int begin, int end){
            this.begin = begin;
            this.end = end;
            this.length = end - begin;
        }
    }

    static List<NamedPattern> patterns;

    public DateAnnotator() {
        patterns = new ArrayList<>();
        patterns.add(new NamedPattern("MM/DD/YYYY",
            Pattern.compile(
                "\\b([1-9]|0[1-9]|1[0-2])(/)([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])(/)(19[0-9][0-9]|20[0-9][0-9])")));

        patterns.add(new NamedPattern("DD.MM.YYYY",
            Pattern.compile(
                "\\b([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])(.)([1-9]|0[1-9]|1[0-2])(.)(19[0-9][0-9]|20[0-9][0-9])")));

        patterns.add(new NamedPattern("YYYY",
            Pattern.compile(
                "\\b([1-9][1-9][0-9][0-9]|2[0-9][0-9][0-9])")));

        patterns.add(new NamedPattern("MMMM",
            Pattern.compile("\\b(January|February|March|April|May|June|" +
                "July|August|September|October|November|" +
                "December)")));
    }

    public List<TextDateAnnotation> annotate(String text){
        List<TextDateAnnotation> annotations = new ArrayList<>();
        for (NamedPattern np: patterns) {
            // Now create matcher object.
            Matcher m = np.pattern.matcher(text);
            while (m.find()) {
                annotations.add(new TextDateAnnotation()
                        .start(m.start(0))
                        .length(m.group(0).length())
                        .text(m.group(0))
                        .dateFormat(np.name)
                        .confidence(95.5f));
            }
        }
        return annotations;
    }

    public static void main(String[] args) {
        DateAnnotator dateAnnotator = new DateAnnotator();
        String str1 = "Today is 10/26/2020, and yesterday is 10/25/2020. ";
        dateAnnotator.annotate(str1);

        String str2 = "Today is 26/11/2020. ";
        dateAnnotator.annotate(str2);
    }
}
