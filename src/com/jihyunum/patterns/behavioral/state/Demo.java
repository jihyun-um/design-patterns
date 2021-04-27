package com.jihyunum.patterns.behavioral.state;

import com.jihyunum.patterns.behavioral.state.fan.Fan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Fan fan = new Fan();
        System.out.println(fan.getState().toString());

        String fanState = "O";
        while (fanState.equalsIgnoreCase("O") || fanState.equalsIgnoreCase("L") || fanState.equalsIgnoreCase("H")) {
            System.out.println("\nEnter one of the following to change the state of the fan:" +
                    "\nO - Off" +
                    "\nL - Low" +
                    "\nH - High");
            fanState = reader.readLine();

            switch (fanState.toUpperCase()) {
                case "O":
                    System.out.println(fan.getState().switchOff());
                    break;
                case "L":
                    System.out.println(fan.getState().switchToLow());
                    break;
                case "H":
                    System.out.println(fan.getState().switchToHigh());
                    break;
            }
            System.out.println(fan.getState());
        }
    }
}
