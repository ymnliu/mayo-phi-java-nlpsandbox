package org.example;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.time.TimeExpression;
import edu.stanford.nlp.util.CoreMap;

import java.util.List;

public class Temporal{
    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    private int begin, end, id;
    private String val, mention, fileName;

    public Temporal(int begin, int end, String val, String mention){
        this.begin = begin;
        this.end = end;
        this.val = val;
        this.mention = mention;
    }

    public Temporal(CoreMap cm, String fileName){
        List<CoreLabel> tokens = cm.get(CoreAnnotations.TokensAnnotation.class);
        begin = tokens.get(0).get(CoreAnnotations.CharacterOffsetBeginAnnotation.class);
        end = tokens.get(tokens.size() - 1).get(CoreAnnotations.CharacterOffsetEndAnnotation.class);
        val = cm.get(TimeExpression.Annotation.class).getTemporal().toString();
        mention = cm.toString();
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
