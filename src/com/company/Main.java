package com.company;

import characters.*;
import events.Battle;

import java.util.Random;

public class Main {

    public static void main(String args []) {
        Heroes robin = new Robin();
        Villains thejoker = new TheJoker();

        Battle battle = new Battle(robin, thejoker);
        battle.getVictor();

    }


}










