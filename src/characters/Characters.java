package characters;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
 
 //Edited by Yk on 7/4/15
public abstract class Characters {
    protected int life;
    private String name;
    protected boolean alive;

    Characters(String theName){
        name = theName;
        alive = true;
    }

    public void killCharacter(){
        name = null;
        alive = false;
    }

    public String getName(){
        return name;
    }

    public boolean isAlive(){
        return alive;
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


