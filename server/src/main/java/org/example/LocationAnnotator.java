package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openapitools.model.TextLocationAnnotation;

public class LocationAnnotator {

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

    public LocationAnnotator(){
        patterns = new ArrayList<>();
        // TODO Add location patterns
    }

    public List<TextLocationAnnotation> annotate(String text){
        List<TextLocationAnnotation> annotations = new ArrayList<>();
        for (NamedPattern np: patterns) {
            // Now create matcher object.
            Matcher m = np.pattern.matcher(text);
            while (m.find()) {
                annotations.add(new TextLocationAnnotation()
                        .start(m.start(0))
                        .length(m.group(0).length())
                        .text(m.group(0))
                        .locationType(TextLocationAnnotation.LocationTypeEnum.OTHER)
                        .confidence(95.5f));
            }
        }
        return annotations;
    }
}
