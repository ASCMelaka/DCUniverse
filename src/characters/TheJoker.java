package characters;

import java.util.Random;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public class TheJoker extends Villains{
    private int damage;


    public TheJoker(){
        super("The Joker");
        life = 100;
        System.out.println("HAHAHAHAHAH... I am... " + getName() );
    }

    private int shoot(){
        System.out.println("The Joker used SHOOT!!!");
        return 50;
    }

    private int laugh(){
        System.out.println("The Joker just laughed...");
        return 0;
    }




    @Override
    public int fight() {

        Random random = new Random();
        switch (random.nextInt(4)){
            case 1:
                damage = shoot();
                break;
            default:
                damage = laugh();
                break;

        }
        System.out.println("damage : " + damage);
        return damage;

    }
}
