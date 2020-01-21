/*
 * B. Hoard, R. Wolforth, D. Stephenson
 * Jan. 19 2020
 */
package islandgame;

public class Methods {
 
	boolean HasShelter;
 int logicalSize = 0;
 int maxDay = 23;
 int minDay = 20;
 int rangeDay = maxDay - minDay + 1;
        
	
            int totalDay = (int)(Math.random() * rangeDay + minDay);

public void buildShelter{
int houseFail = 1;
int houseSuccess 2;
int houseChoice = (int)(Math.random() * houseFail + houseSuccess);
if(houseChoice == houseFail){
lblOutput.setText("your house is in shambles and cannot fit a small dog, you do not have shelter. you are likely to freeze in the night.");
}
else{
lblOutput.setText("you have sucessfully made a shelter for the night!");
}
}	
	public void huntBear(int job, int day){
String successMessage = "The bear has successfully been killed! +5 meat"
String deathMessage = "The bear has mauled you and you’re bleeding internally and externally." "\n" "You have died.";
if(job == 1){
 int max = 3;
        int min = 1;//Why declare extra variables here when you don't need to?
        int range = max - min;//And do extra processing that seems irrelevant
  
        // generate random numbers within 1 to 10//Is it not 1 to 2?
            int rand = (int)(Math.random() * range) + min;//How,range is 2 and min is 1 so its a random number within 1 to 2

if(rand == 1) {

lblOutput.setText(successMessage);//Increased effeciency and decreased proccessing by making all statements into few strings
day++;
}

else {

lblOutput.setText(deathMessage);//Changed it to be on a different line for a dramatic effect
day++;
}

if (job == 0){
 int maxHunter = 2;
        int minHunter = 1;
        int rangeHunter = 2; 		//maxHunter - minHunter
  
        // generate random numbers within 1 to 5
        
            int randHunter = (int)(Math.random() * rangeHunter);
        
if(randHunter == 1){

lblOutput.setText(successMessage);
day++;
}
}

else{

lblOutput.setText(deathMessage);
}

        }
}
}	
	public addInventory(item a,int quantity ){
		a = quantity + getAmount; 
	}
	public void openInventory{
		
	}
