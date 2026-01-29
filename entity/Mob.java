package entity;

public class Mob extends Entity{ //mob is something with hp, atk, def, and lvl
    //pos
    
    public int hp, atk, def, lvl;

    public Mob(int dx, int dy, int hp){
        super(dx, dy);
        this.hp = hp;
    }
    
    //setters
    public void changeX(int x){this.x+=x;}
    public void changeY(int y){this.y+=y;}
    
    //setters
    public void setHp(int hp){this.hp=hp;}
    public void setAtk(int atk){this.atk=atk;}
    public void setDef(int def){this.def=atk;}
    public void setLvl(int lvl){this.lvl=lvl;}
    
    //getters
    public int getX(){return this.x;}
    public int getY(){return this.y;}
    
}