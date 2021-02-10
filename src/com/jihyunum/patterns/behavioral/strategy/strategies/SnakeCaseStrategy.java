package com.jihyunum.patterns.behavioral.strategy.strategies;

public class SnakeCaseStrategy implements CaseStrategy {
    @Override
    public String convert(String str) {
        String[] words = str.split("\\s+");
        StringBuilder convertedStr = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            convertedStr.append(word.toLowerCase());
            if (i < words.length - 1) {
                convertedStr.append("_");
            }
        }
        return convertedStr.toString();
    }
}
