package com.jihyunum.patterns.behavioral.state.fan.states;

import com.jihyunum.patterns.behavioral.state.fan.Fan;

public class HighState extends State {
    public HighState(Fan fan) {
        super(fan);
    }

    @Override
    public String switchOff() {
        fan.setState(new OffState(fan));
        return "Switching off...";
    }

    @Override
    public String switchToLow() {
        return "Locked";
    }

    @Override
    public String switchToHigh() {
        return "Locked";
    }

    @Override
    public String toString() {
        return "Fan is on at high speed";
    }
}
