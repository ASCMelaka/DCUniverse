package characters;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public class Robin extends Heroes {

    private int damage;


    public Robin(){
        super("Robin");
        life = 80;
        System.out.println("...and here comes Robin, Boy Wonder!");
    }

    private int beatWithStick(){
        System.out.println("Robin hit with stick!!");
        return 20;
    }

    private int cry(){
        System.out.println("Robin decided to cry...");
        life = life + 10;
        return 0;
    }



    @Override
    public int fight() {
        if(life >= 80){
            damage = beatWithStick();
        }else{
            damage = cry();
        }
        System.out.println("damage : " + damage);
        return damage;
    }

}
