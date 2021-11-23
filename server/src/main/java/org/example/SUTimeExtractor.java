package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.time.*;
import edu.stanford.nlp.util.CoreMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SUTimeExtractor {
    static Logger logger = LoggerFactory.getLogger(SUTimeExtractor.class);
    BufferedWriter writer;
    static AnnotationPipeline pipeline;

    public SUTimeExtractor() {
        Properties props = new Properties();
        pipeline = new AnnotationPipeline();
        pipeline.addAnnotator(new TokenizerAnnotator(false));
        pipeline.addAnnotator(new WordsToSentencesAnnotator(false));
        pipeline.addAnnotator(new POSTaggerAnnotator(false));
        pipeline.addAnnotator(new TimeAnnotator("sutime", props));

    }

    public static List annotateText(String text2annot, String fileName){
        Annotation annotation = new Annotation(text2annot);
//        annotation.set(CoreAnnotations.DocDateAnnotation.class, "2013-07-14");
        pipeline.annotate(annotation);

        List<CoreMap> timexAnnsAll = annotation.get(TimeAnnotations.TimexAnnotations.class);

        List<Temporal> temporals = new ArrayList<>();
        timexAnnsAll.forEach(cm ->
                temporals.add(new Temporal(cm, fileName))
        );

        return temporals;
    }
}