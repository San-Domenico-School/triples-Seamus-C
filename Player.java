import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * the player that interact with card and pick up triples
 * 
 * @author Seamus
 * @version 26/1/24
 */
public class Player extends Actor
{
    private Dealer dealer;
    
    private Card[] cardSelected;
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardIndex;
    
    private boolean threeCardsHaveBeenSelected;
    
    public Player(Dealer dealer)
    {
        this.dealer = dealer;
        
        cardSelected = new Card[3];
        
        cardsOnBoard = new ArrayList<Card>();
        selectedCardIndex =  new ArrayList<Integer>();
    }
    
    public void act()
    {
        selectCards();
        
        threeCardsHaveBeenSelected = setCardsSelected();
        if(threeCardsHaveBeenSelected)
        {
            dealer.setCardsSelected(cardsOnBoard, selectedCardIndex, cardSelected);
            dealer.checkIfTriple();
            resetCardsSelected();
        }
    }
    
    public void addedToWorld(World world)
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class);
    }
    
    private void selectCards()
    {
        for(int i = 0; i < cardsOnBoard.size(); i++)
        {
            Card currentCard = cardsOnBoard.get(i);
            
            if(Greenfoot.mouseClicked(cardsOnBoard.get(i)))
            {
                if(currentCard.getIsSelected())
                {
                    currentCard.setIsSelected(false);
                    currentCard.setImage(currentCard.getCardImage());
                    
                    selectedCardIndex.remove(selectedCardIndex.indexOf(i));
                }
                else 
                {
                    currentCard.setIsSelected(true);
                    currentCard.setImage(currentCard.getSelectedCardImage());
                    
                    selectedCardIndex.add(i);
                }
            }
        }
    }
    
    private void resetCardsSelected()
    {
        for (int i = 0; i < cardsOnBoard.size(); i++)
        {
            //needs to be changed
            Card currentCard = cardsOnBoard.get(i);
            
            currentCard.setImage(currentCard.getCardImage());
            currentCard.setIsSelected(false);
        }
        selectedCardIndex.clear();
    }
    
    private boolean setCardsSelected()
    {
        if(selectedCardIndex.size() >= 3)
        {
            for (int i =0; i < selectedCardIndex.size(); i++)
            {
                cardSelected[i] = cardsOnBoard.get(selectedCardIndex.get(i));
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
