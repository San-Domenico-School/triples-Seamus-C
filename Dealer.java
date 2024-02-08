import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * get card and put them on the game board 
 * 
 * @author Seamus
 * @version 18/1/24
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
        if(triplesRemaining == 0)
        {
            Greenfoot.stop();
        }
    }
    
    public void checkIfTriple()
    {
        Card card0 = cardsSelected[0];
        Card card1 = cardsSelected[1];
        Card card2 = cardsSelected[2];
        
        //add veriable being checked and mod 3 == 0 
        boolean cardSides = (card0.getNumberOfShapes() + card1.getNumberOfShapes() + card2.getNumberOfShapes()) % 3 == 0;
        boolean cardShading = (card0.getShading() + card1.getShading() + card2.getShading()) % 3 == 0;
        boolean cardColor = (card0.getColor().ordinal() + card1.getColor().ordinal() + card2.getColor().ordinal()) % 3 == 0;
        boolean cardShape = (card0.getShape().ordinal() + card1.getShape().ordinal() + card2.getShape().ordinal()) % 3 == 0;
    
        if(cardSides && cardShading && cardColor && cardShape)
        {
            actionIfTriple();
        }
        else
        {
            Animations.wobble(cardsSelected);
        }
    }
    
    public void actionIfTriple()
    {
        Animations.slideAndTurn(cardsSelected);
        
        for(Card card : cardsSelected)
        {
            int x = card.getX();
            int y = card.getY();
            
            getWorld().removeObject(card);
            cardsOnBoard.remove(card);

            Card cardAdded = deck.getTopCard();
            if(!(cardAdded == null))
            {
                cardsOnBoard.add(cardAdded);
                getWorld().addObject(cardAdded, x, y);
            }
        }
        
        triplesRemaining--;
        Scorekeeper.updateScore();
        setUI();
        endGame();
    }
    
    public void setCardsSelected(ArrayList <Card> cards, ArrayList <Integer> ints, Card[] cardArray)
    {
        cardsOnBoard = cards;
        selectedCardsIndex = ints;
        cardsSelected = cardArray;
    }
}
