package characters;

/**
 * Created by navenprasad25 on 03/04/2015.
 */
public abstract class Characters {
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



}


