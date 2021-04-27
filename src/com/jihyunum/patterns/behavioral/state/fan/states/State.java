package com.jihyunum.patterns.behavioral.state.fan.states;

import com.jihyunum.patterns.behavioral.state.fan.Fan;

public abstract class State {
    Fan fan;

    State(Fan fan) {
        this.fan = fan;
    }

    public abstract String switchOff();
    public abstract String switchToLow();
    public abstract String switchToHigh();
}
