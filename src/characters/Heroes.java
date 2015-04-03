package characters;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public abstract class Heroes extends Characters{
    protected int life;

    Heroes(String name){
        super(name);
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
