package dev.rama27.emailApp.model;

import java.util.regex.Pattern;

public class FilterRule {
    private String ruleName;
    private FilterField field;
    private String pattern;
    private Pattern compiledPattern;
    private String targetFolder;
    private FilterAction action;

    public enum FilterField{
        FROM, SUBJECT,BODY,TO,CC,DATE,SIZE
    }
    public enum FilterAction {
        MOVE,MARK_READ,MARK_IMPORTANT,DELETE,FORWARD
    }

    public FilterRule(String ruleName, FilterField field, String pattern, Pattern compiledPattern, String targetFolder, FilterAction action) {
        this.ruleName = ruleName;
        this.field = field;
        this.pattern = pattern;
        this.compiledPattern = compiledPattern;
        this.targetFolder = targetFolder;
        this.action = action;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public FilterField getField() {
        return field;
    }

    public void setField(FilterField field) {
        this.field = field;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Pattern getCompiledPattern() {
        return compiledPattern;
    }

    public void setCompiledPattern(Pattern compiledPattern) {
        this.compiledPattern = compiledPattern;
    }

    public String getTargetFolder() {
        return targetFolder;
    }

    public void setTargetFolder(String targetFolder) {
        this.targetFolder = targetFolder;
    }

    public FilterAction getAction() {
        return action;
    }

    public void setAction(FilterAction action) {
        this.action = action;
    }

    public boolean matches(String text){
        return compiledPattern.matcher(text).find();
    }
}
