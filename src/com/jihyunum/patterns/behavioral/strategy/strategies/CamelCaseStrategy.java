package com.jihyunum.patterns.behavioral.strategy.strategies;

public class CamelCaseStrategy implements CaseStrategy {
    @Override
    public String convert(String str) {
        String[] words = str.split("\\s+");
        StringBuilder convertedStr = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String convertedWord = (i == 0) ?
                    word.toLowerCase() :
                    word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            convertedStr.append(convertedWord);
        }
        return convertedStr.toString();
    }
}
