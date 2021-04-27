package com.jihyunum.patterns.behavioral.state.fan.states;

import com.jihyunum.patterns.behavioral.state.fan.Fan;

public class LowState extends State {
    public LowState(Fan fan) {
        super(fan);
    }

    @Override
    public String switchOff() {
        return "Locked";
    }

    @Override
    public String switchToLow() {
        return "Locked";
    }

    @Override
    public String switchToHigh() {
        fan.setState(new HighState(fan));
        return "Switching to high...";
    }

    @Override
    public String toString() {
        return "Fan is on at low speed";
    }
}
