/*
 * B. Hoard, R. Wolforth
 * Jan. 19 2020
 * and open the template in the editor.
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

if(job == 1){
 int max = 3;
        int min = 1;
        int range = max - min;
  
        // generate random numbers within 1 to 10
            int rand = (int)(Math.random() * range) + min;

if(rand == 1) {

lblOutput.setText("the bear has successfully been killed! +5 meat");
day++;
}

else {

lblOutput.setText("the bear has mauled you and you’re bleeding internally and externally. You have died.");
day++;
}

if (job == 0){
 int maxHunter = 2;
        int minHunter = 1;
        int rangeHunter = 2; 		//maxHunter - minHunter
  
        // generate random numbers within 1 to 5
        
            int randHunter = (int)(Math.random() * rangeHunter);
        
if(randHunter == 1){

lblOutput.setText("the bear has successfully been killed! +5 meat");
day++;
}
}

else{

lblOutput.setText("the bear has mauled you and you’re bleeding internally and externally. You have died.");
}

        }
}
}

