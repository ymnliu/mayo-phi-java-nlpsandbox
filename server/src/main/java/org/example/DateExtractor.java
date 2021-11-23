package org.example;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.model.TextDateAnnotation;

public class DateExtractor {

    private static SUTimeExtractor extractor;

    public DateExtractor() {
        extractor = new SUTimeExtractor();
    }


    public List<TextDateAnnotation> findDatesFromString(String sentence) {

        List<TextDateAnnotation> annotations = new ArrayList<>();

        List<Temporal> temporals = extractor.annotateText(sentence, "file");
        for (Temporal temporal : temporals) {
            annotations.add(new TextDateAnnotation()
                    .start(temporal.getBegin())
                    .length(temporal.getEnd() - temporal.getBegin())
                    .text(temporal.getMention())
                    .dateFormat("MM-DD-YYYY")
                    .confidence(95.5f));
        }

        return annotations;
    }

}
