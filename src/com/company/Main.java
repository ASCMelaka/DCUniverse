package com.company;

import characters.*;
import events.Battle;
import javafx.scene.control.RadioButton;

import java.util.Random;

public class Main {

    public static void main(String args []) {
        Heroes batman = new Batman();
        Villains thejoker = new TheJoker();

        Battle battle = new Battle(batman, thejoker);
        battle.getVictor();

    }

}
