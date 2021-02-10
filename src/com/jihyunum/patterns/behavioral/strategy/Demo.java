package com.jihyunum.patterns.behavioral.strategy;

import com.jihyunum.patterns.behavioral.strategy.formatter.AutoFormatter;
import com.jihyunum.patterns.behavioral.strategy.strategies.CamelCaseStrategy;
import com.jihyunum.patterns.behavioral.strategy.strategies.PascalCaseStrategy;
import com.jihyunum.patterns.behavioral.strategy.strategies.SnakeCaseStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Do you want to auto format a string? Enter the string here: ");
        String str = reader.readLine();

        System.out.println("Which case do you want to use?" +
                "\nP - PascalCase" +
                "\nC - camelCase" +
                "\nS - snake_case");
        String caseStrategy = reader.readLine();

        AutoFormatter autoFormatter = new AutoFormatter();
        switch (caseStrategy.toUpperCase()) {
            case "P":
                autoFormatter.setCaseStrategy(new PascalCaseStrategy());
                break;
            case "C":
                autoFormatter.setCaseStrategy(new CamelCaseStrategy());
                break;
            case "S":
                autoFormatter.setCaseStrategy(new SnakeCaseStrategy());
                break;
        }

        String formattedStr = autoFormatter.convertCase(str);
        System.out.println("Here's your converted string: " + formattedStr);
    }
}
