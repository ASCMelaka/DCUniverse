package events;


import characters.Characters;
import characters.Heroes;
import characters.Villains;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public class Battle {

    private int damageByHero;
    private int damageByVillain;
    private Characters victor;

    public Battle(Heroes hero, Villains villain){
        startBattle(hero, villain);
    }

    public void startBattle(Heroes hero, Villains villain){
        while(hero.checkAlive() && villain.checkAlive()){

            damageByHero = hero.fight();
            damageByVillain = villain.fight();
            hero.takeDamage(damageByVillain);
            System.out.println(hero.getName() + " life : " + hero.getLife());
            villain.takeDamage(damageByHero);
            System.out.println(villain.getName() + " life : " + villain.getLife());
            System.out.println("");
            System.out.println("");

            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }

        }

        if(hero.checkAlive())
            victor = hero;

        else if (villain.checkAlive())
                victor = villain;
                
            else
                victor = null;
            
        


        System.out.println("Battle done!");
    }

    public Characters getVictor(){ 
        if (victor != null)
            System.out.println(victor.getName()+ " Won!"); else System.out.println("Draw!"); // Display the winner name or "Draw".
        return victor;
    }

}
