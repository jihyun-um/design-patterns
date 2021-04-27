package com.jihyunum.patterns.behavioral.state.fan;

import com.jihyunum.patterns.behavioral.state.fan.states.OffState;
import com.jihyunum.patterns.behavioral.state.fan.states.State;

public class Fan {
    private State state;

    public Fan() {
        this.state = new OffState(this); // default state
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
