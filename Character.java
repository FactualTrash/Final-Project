/*
 * Character Class
 * Jan. 19th 2020
 */
package islandgame;


/**
 *
 * @author R. Wolforth
 */
public class Character {
    private String name;
    private int coins;
    private int food;
    private int water;
    private boolean isHungry;
    private boolean isThirsty;

//constructor
    public Character(String n, int c, int f, int w){
        name = n;
        coins = c;
        food = f;
        water = w;
        isHungry = true;
        isThirsty = true;
    }
    
     public void eat() {
        System.out.println("You eat some food");
        food--;
        isHungry = false;
    }
     
    public void drink() {
        System.out.println("You drink some water");
        isThirsty = false;
    }
    
    public void hunt() {
        System.out.println("You hunt some small game");
        food = food + (int)(Math.random()*5+1);
    }
    public void fillWater() {
        System.out.println("You fill your water stores");
        water = 4;
    }
    
    //accessors and mutators
    public String getName() {
        return name;
    }

    public int getCoins() {
        return coins;
    }

    public double getFood() {
        return food;
    }

    public boolean isHungry() {
        return isHungry;
    }
    public boolean isThisty() {
        return isThirsty;
    } 
    
    public String toString() {
        String message = "Character: "
                + "\nName: " + name
                + "\nCoins: " + coins
                + "\nFood: " + food
                + "\nWater: " + water
                + "\nHungry? " + isHungry
                + "\nThirsty? " + isThirsty;
        return message;
    }
}