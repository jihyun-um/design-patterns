package com.jihyunum.patterns.behavioral.strategy.formatter;

import com.jihyunum.patterns.behavioral.strategy.strategies.CaseStrategy;

public class AutoFormatter {
    private CaseStrategy caseStrategy;

    public void setCaseStrategy(CaseStrategy caseStrategy) {
        this.caseStrategy = caseStrategy;
    }

    public String convertCase(String str) {
        return caseStrategy.convert(str);
    }
}
