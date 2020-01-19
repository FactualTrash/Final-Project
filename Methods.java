/*
 * B. Hoard, R. Wolforth
 * Jan. 19 2020
 * and open the template in the editor.
 */
package islandgame;

public class Methods {
 
 int logicalSize = 0;
 int maxDay = 23;
 int minDay = 20;
 int rangeDay = maxDay - minDay + 1;
        
	
            int totalDay = (int)(Math.random() * rangeDay + minDay);

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

