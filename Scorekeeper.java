/**
 * Write a description of class Scorekeeper here.
 * 
 * @author Seamus
 * @version 11/1/24
 */
public class Scorekeeper  
{
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int input)
    {
        deckSize = input;
    }
    public static void updateScore()
    {
        score++;
    }
    public static int getScore()
    {
        return score;
    }
}
