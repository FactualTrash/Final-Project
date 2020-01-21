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
    //private int coins;
    private int food;
    private int water;
    private boolean isHungry;
    private boolean isThirsty;
    private boolean shelter = false;

//constructor
    public Character(String n, int f, int w){
        name = n;
        //coins = c;
        food = f;
        water = w;
        isHungry = true;
        isThirsty = true;
    }
    
    public String buildShelter(){
        int houseFail = 1;
        int houseSuccess = 2;
        int houseChoice = (int)(Math.random() * houseSuccess + houseFail);
        
        if(houseChoice == houseFail){
        shelter = false;  
        return "your house is in shambles and cannot fit a small dog, you do not have shelter. you are likely to freeze in the night.";
        
        }
        
        else{
        shelter = true;
        return "you have sucessfully made a shelter for the night!";
        }
    }	
    
    public String huntBear(int job, int day){
        String successMessage = "The bear has successfully been killed! +5 meat";
        String deathMessage = "The bear has mauled you and you’re bleeding internally and externally." + "\n" +  "You have died.";
        
        if(job == 1){                                            
  
        // generate random numbers 1 to 8
            int rand = (int)(Math.random() * 4) + 1; 

            if(rand == 1) {
                return successMessage;
            }

        else {
            return deathMessage;
        }
            
        }
        
        else if (job == 0){
            int maxHunter = 2;
            int minHunter = 1;
            int rangeHunter = maxHunter-minHunter;
  
        // generate random numbers within 1 to 5
            int randHunter = (int)(Math.random() * rangeHunter);
        
            if(randHunter == 1){
                return successMessage;
            }
        
            else{
                return deathMessage;
            }
        }
        return null;
    }
    public void hunt() {
        System.out.println("You hunt some small game");
        food = food + (int)(Math.random()*5+1);
    }
    public void fillWater() {
        System.out.println("You fill your water stores");
        water = 4;
    }
    public boolean checkShelter(){
        return shelter;
    }
    public int sleep(int d){
        int newDay = d++;
        return newDay;
    }
    
    //accessors and mutators
    public String getName() {
        return name;
    }
    /*public int getCoins() {
        return coins;
    }*/
    public int getFood() {
        return food;
    }
    public int getWater() {
        return water;
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
                //+ "\nCoins: " + coins
                + "\nFood: " + food
                + "\nWater: " + water
                + "\nHungry? " + isHungry
                + "\nThirsty? " + isThirsty;
        return message;
    }
}