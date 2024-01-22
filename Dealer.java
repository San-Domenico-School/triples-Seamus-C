import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Dealer here.
 * 
 * @author Seamus
 * @version 1/18/24
 */
public class Dealer extends Actor
{
    private Deck deck;
    
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    
    private int numCardsInDeck;
    private int triplesRemaining;
    
    public Dealer(int numCardsCreated)
    {
      numCardsInDeck = numCardsCreated;
      triplesRemaining = numCardsCreated / 3;
      
      deck = new Deck(numCardsInDeck);
      //Assign to deck a newly instantiated deck of size numCardsInDeck. needs to be done later
      
      cardsSelected = new Card[3];

    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI(); //said to put UpdateUI here but that does not exist
    }
    
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav");
        
        for(int i = 0; i < 3; i++)
        {
            for(int u = 0; u < 4; u++)
            {
                getWorld().addObject(deck.getTopCard(), i * 140 + 75, u * 100 + 80);
            }
        }
    }
    
    public void setUI()
    {
        getWorld().showText(" " + deck.getNumCardsInDeck(), 300, 470);
        
        getWorld().showText("" + Scorekeeper.getScore(), 300, 505);
    }
    
    public void endGame()
    {
        
    }
    
    public void checkIfTriple()
    {
        
    }
    
    public void actionIfTriple()
    {
        
    }
    
    public void setCardsSelected(ArrayList <Card> cards, ArrayList <Integer> ints, Card[] cardArray)
    {
        
    }
}
