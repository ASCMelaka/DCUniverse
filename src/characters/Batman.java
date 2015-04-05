package characters;

import java.util.Random;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public class Batman extends Heroes {

    private int damage;

    public Batman(){
        super("Batman");
        life = 100;
        System.out.println("Batman arrived!");
    }
    
    private int Stun(){
        System.out.println("You're stunned");
        return 20;
    }
    private int punch(){
        System.out.println("Batman used punch!");
        return 10;
    }

    private int kick(){
        System.out.println("Batman used kick!");
        return 20;
    }

    private int throwBatarang(){
        System.out.println("Batman threw Batarang!");
        return 30;
    }

    @Override
    public int fight() {
        Random randomNumber = new Random();

        switch(randomNumber.nextInt(3))
        {
            case 0:

                damage = punch();

                break;
            case 1:
                damage = kick();
                break;
            case 2:
                damage = throwBatarang();
                break;


        }
        System.out.println("damage : " + damage);
        return damage;
    }
}


