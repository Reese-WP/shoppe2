package entity;

public class Entity { //entity is something with position
    public int x;
    public int y;
    
    //entity constuction, just x and y position stored 
    public Entity(int x, int y) 
    {
        this.x=x;
        this.y=y;
    }
    
    //setters
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    
    //getters
    public int getX(){return this.x;}
    public int getY(){return this.y;}
}