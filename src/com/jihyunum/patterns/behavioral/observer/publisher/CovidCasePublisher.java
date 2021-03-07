package com.jihyunum.patterns.behavioral.observer.publisher;

public class CovidCasePublisher {
    public CovidCaseManager covidCaseManager;

    public CovidCasePublisher() {
        covidCaseManager = new CovidCaseManager(new String[] {"South Korea", "UK", "US"});
    }

    public void updateNumberOfCases(String country, int numberOfCases) {
        covidCaseManager.notify(country, numberOfCases);
    }
}
