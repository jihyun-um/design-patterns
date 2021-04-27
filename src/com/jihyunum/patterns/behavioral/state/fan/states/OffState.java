package com.jihyunum.patterns.behavioral.state.fan.states;

import com.jihyunum.patterns.behavioral.state.fan.Fan;

public class OffState extends State {
    public OffState(Fan fan) {
        super(fan);
    }

    @Override
    public String switchOff() {
        return "Locked";
    }

    @Override
    public String switchToLow() {
        fan.setState(new LowState(fan));
        return "Switching to low...";
    }

    @Override
    public String switchToHigh() {
        return "Locked";
    }

    @Override
    public String toString() {
        return "Fan is off";
    }
}
