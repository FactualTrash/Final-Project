/*D Stephenson
 * January 20th, 2020
 * A class made for tracking the players food
 */
package islandgame;

/**
 *
 * @author steph
 */
public class Food {

    int food;

    public int getFood() {
        return food;
    }

    public void setFood(int a) {
        food = a;
    }

    public void addFood(int a) {
        food += a;
    }

    public void removeFood(int a) {
        food -= a;
    }

    public String toString() {
        String message = "You have " + food + " servings of food!";
        return message;
    }
}
