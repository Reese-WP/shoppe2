package entity;

public class Player extends Mob{ //there is only one instance of the player class
    
    public String playerClass; //player class but not class because it's a keyword
    
    int xp;
    
    public Player(int dx, int dy, int hp){
        super(dx, dy, hp);
        int xp = 0;
    }
    //sets the players class using a switch case
    public static void setPlayerClass(int option){
        switch(option){
            case 1:
                //code
                break;
            case 2:
                //code
                break;
            case 3:
                //code
                break;
            case 4:
                //code
                break;
            case 5:
                //code
                break;
            case 6:
                //code
                break;
            
        }
    }
    
    /*
        -- stats --
        atk - damage on hit
        def - damage reduction
        dodge - chace for attacks to miss you
        accuracy - chance for player to hit
        mana - amount of magic 
        magic - magic power (magic damage/effect mod & whatn spells unlocked)
        -- classes --
        https://docs.google.com/spreadsheets/d/1-BlKLNK4nOAZ0t7iQS6uDyyJOWuoPES3AcyZVA1HxIU/edit?gid=0#gid=0
        
    
    */
}