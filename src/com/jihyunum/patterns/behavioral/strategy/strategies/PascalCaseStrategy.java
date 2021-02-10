package com.jihyunum.patterns.behavioral.strategy.strategies;

public class PascalCaseStrategy implements CaseStrategy {
    @Override
    public String convert(String str) {
        String[] words = str.split("\\s+");
        StringBuilder convertedStr = new StringBuilder();
        for (String word : words) {
            String convertedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            convertedStr.append(convertedWord);
        }
        return convertedStr.toString();
    }
}
