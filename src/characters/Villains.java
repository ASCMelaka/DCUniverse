package characters;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public abstract class Villains extends Characters {

    protected int life;

    Villains(String theName){
        super(theName);
    }

    public int getLife(){
        return  life;
    }

    public boolean checkAlive() {
        if(life <= 0)
            alive = false;
        return alive;
    }

    public void takeDamage(int damage){
        life = life - damage;
    }


    public abstract int fight();

}
