/**
 * Scorekeeper class to track game score and time.
 * 
 * @author Ivan
 * @version Jan 30, 2024
 */
public class Scorekeeper {
    private static int deckSize; 
    private static int score;  
    private static long startTime = System.currentTimeMillis();  

   
    public static void setDeckSize(int size) {
        if (size > 0) {
            deckSize = size;
        } else {
            
            System.err.println("Invalid deck size: " + size);
        }
    }

   
    public static void updateScore() {
        int timePassed = (int) ((System.currentTimeMillis() - startTime) / 1000);  // Time passed in seconds
        int points = deckSize - timePassed;  
        
        if (points > 0) {
            score += points;  
        }
        
        startTime = System.currentTimeMillis(); 
    }

    
    public static int getScore() {
        return score;
    }
}