import greenfoot.*;
import java.util.ArrayList;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Deck 
{
    /*private Card[] unshuffledDeck;
    
    public Deck(int numOfCardsCreated)
    {
        unshuffledDeck = new Card[numOfCardsCreated + 1];
        populateunshuffledDeckWithCards(numOfCardsCreated);
    }
    
    
    public Card getRandomCard()
    {
        return unshuffledDeck[(int) (Math.random() * unshuffledDeck.length)];
    }*/
    
    
    
    
    private Card[] unshuffledDeck;
    private ArrayList<Card> shuffledDeck;
    
    public Deck(int numOfCardsInDeck)
    {
        numOfCardsInDeck = limitNumCardsInDeck(numOfCardsInDeck);  // limits size to 27 or 81        
        unshuffledDeck = new Card[numOfCardsInDeck + 1];           // playing cards plus blank card
        shuffledDeck = new ArrayList<>();                          // Instantiates ArrayList with no elements
        populateUnshuffledDeckWithCards(numOfCardsInDeck);         // Initializes Unshuffled Deck
        createShuffledDeck();                                      // Initializes shuffled deck excluding blank card
    }
    
    //getNumCardsInDeck keeps track of how many unused cards remain in the deck.
    protected int getNumCardsInDeck()
    {
        return shuffledDeck.size();
    }
    
    //getTopCard returns the top card of the deck as the cards are dealt.
    protected Card getTopCard()
    {
        Card topCard = shuffledDeck.get(0);
        shuffledDeck.remove(0);
        return topCard;
    }
    //getShuffledCard returns a card at a specific location in the deck.
    protected Card getShuffledCard(int selectedCard)
    {
        return shuffledDeck.get(selectedCard);
    }
    //getShuffledDeck returns the entire shuffled deck.
    protected ArrayList getShuffledDeck()
    {
        return shuffledDeck;
    }
    //limitNumCardsInDeck forces the number of cards in the unshuffled deck to either be 27 (3 set of 3 characteristics of triples) or 81(3 set of 4 characteristics of triples). 
    protected int limitNumCardsInDeck(int input)
    {
        return input <= 27 ? 27 : 81;
    }
    
    //createShuffledDeck shuffles the unshuffled deck to form the shuffled deck.  Removes blank card.
    private void createShuffledDeck()
    {
        for(int i = 1; i < unshuffledDeck.length; i++)
        {
            shuffledDeck.add((int) (Math.random() * shuffledDeck.size()), unshuffledDeck[i]);
        }
    }
    
    
    // adds all the cards to the unshuffled deck.   
    private void populateUnshuffledDeckWithCards(int numOfCardsInDeck)        
    {
        unshuffledDeck[0] = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR,0,0,
                new GreenfootImage("Triplets_0/blank_0_0_0.png"), 
                new GreenfootImage("Triplets_0/blank_0_0_0.png"));
        unshuffledDeck[1] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/circle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_1_0_selected.png"));
        unshuffledDeck[2] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/circle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_2_0_selected.png"));
        unshuffledDeck[3] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/circle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_3_0_selected.png"));
        unshuffledDeck[4] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/circle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_1_0_selected.png"));
        unshuffledDeck[5] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/circle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_2_0_selected.png"));
        unshuffledDeck[6] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/circle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_3_0_selected.png"));
        unshuffledDeck[7] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/circle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_1_0_selected.png"));
        unshuffledDeck[8] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/circle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_2_0_selected.png"));
        unshuffledDeck[9] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/circle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_3_0_selected.png"));
         unshuffledDeck[10] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/square_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_1_0_selected.png"));
        unshuffledDeck[11] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/square_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_2_0_selected.png"));
        unshuffledDeck[12] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/square_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_3_0_selected.png"));
        unshuffledDeck[13] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/square_green_1_0.png"), 
                new GreenfootImage("Triplets_0/square_green_1_0_selected.png"));
        unshuffledDeck[14] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/square_green_2_0.png"), 
                new GreenfootImage("Triplets_0/square_green_2_0_selected.png"));
        unshuffledDeck[15] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/square_green_3_0.png"), 
                new GreenfootImage("Triplets_0/square_green_3_0_selected.png"));
        unshuffledDeck[16] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/square_red_1_0.png"), 
                new GreenfootImage("Triplets_0/square_red_1_0_selected.png"));
        unshuffledDeck[17] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/square_red_2_0.png"), 
                new GreenfootImage("Triplets_0/square_red_2_0_selected.png"));
        unshuffledDeck[18] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/square_red_3_0.png"), 
                new GreenfootImage("Triplets_0/square_red_3_0_selected.png"));
        unshuffledDeck[19] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/triangle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_1_0_selected.png"));
        unshuffledDeck[20] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/triangle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_2_0_selected.png"));
        unshuffledDeck[21] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/triangle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_3_0_selected.png"));
        unshuffledDeck[22] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/triangle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_1_0_selected.png"));
        unshuffledDeck[23] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/triangle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_2_0_selected.png"));
        unshuffledDeck[24] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/triangle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_3_0_selected.png"));
        unshuffledDeck[25] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/triangle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_1_0_selected.png"));
        unshuffledDeck[26] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/triangle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_2_0_selected.png"));
        unshuffledDeck[27] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/triangle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_3_0_selected.png"));
        if(numOfCardsInDeck > 27)
        {
            unshuffledDeck[28] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/circle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_1_1_selected.png"));
            unshuffledDeck[29] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/circle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_2_1_selected.png"));
            unshuffledDeck[30] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/circle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_3_1_selected.png"));
            unshuffledDeck[31] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/circle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_1_1_selected.png"));
            unshuffledDeck[32] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/circle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_2_1_selected.png"));
            unshuffledDeck[33] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/circle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_3_1_selected.png"));
            unshuffledDeck[34] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/circle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_1_1_selected.png"));
            unshuffledDeck[35] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/circle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_2_1_selected.png"));
            unshuffledDeck[36] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/circle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_3_1_selected.png"));
             unshuffledDeck[37] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/square_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_1_1_selected.png"));
            unshuffledDeck[38] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/square_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_2_1_selected.png"));
            unshuffledDeck[39] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/square_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_3_1_selected.png"));
            unshuffledDeck[40] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/square_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_1_1_selected.png"));
            unshuffledDeck[41] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/square_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_2_1_selected.png"));
            unshuffledDeck[42] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/square_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_3_1_selected.png"));
            unshuffledDeck[43] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/square_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_1_1_selected.png"));
            unshuffledDeck[44] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/square_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_2_1_selected.png"));
            unshuffledDeck[45] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/square_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_3_1_selected.png"));
            unshuffledDeck[46] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/triangle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_1_1_selected.png"));
            unshuffledDeck[47] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/triangle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_2_1_selected.png"));
            unshuffledDeck[48] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/triangle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_3_1_selected.png"));
            unshuffledDeck[49] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/triangle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_1_1_selected.png"));
            unshuffledDeck[50] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/triangle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_2_1_selected.png"));
            unshuffledDeck[51] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/triangle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_3_1_selected.png"));
            unshuffledDeck[52] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/triangle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_1_1_selected.png"));
            unshuffledDeck[53] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/triangle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_2_1_selected.png"));
            unshuffledDeck[54] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/triangle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_3_1_selected.png"));
            if(numOfCardsInDeck > 54)
            {
                unshuffledDeck[55] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/circle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_1_2_selected.png"));
                unshuffledDeck[56] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/circle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_2_2_selected.png"));
                unshuffledDeck[57] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/circle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_3_2_selected.png"));
                unshuffledDeck[58] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/circle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_1_2_selected.png"));
                unshuffledDeck[59] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/circle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_2_2_selected.png"));
                unshuffledDeck[60] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/circle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_3_2_selected.png"));
                unshuffledDeck[61] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/circle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_1_2_selected.png"));
                unshuffledDeck[62] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/circle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_2_2_selected.png"));
                unshuffledDeck[63] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/circle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_3_2_selected.png"));
                 unshuffledDeck[64] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/square_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_1_2_selected.png"));
                unshuffledDeck[65] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/square_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_2_2_selected.png"));
                unshuffledDeck[66] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/square_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_3_2_selected.png"));
                unshuffledDeck[67] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/square_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_1_2_selected.png"));
                unshuffledDeck[68] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/square_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_2_2_selected.png"));
                unshuffledDeck[69] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/square_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_3_2_selected.png"));
                unshuffledDeck[70] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/square_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_1_2_selected.png"));
                unshuffledDeck[71] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/square_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_2_2_selected.png"));
                unshuffledDeck[72] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/square_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_3_2_selected.png"));
                unshuffledDeck[73] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/triangle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_1_2_selected.png"));
                unshuffledDeck[74] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/triangle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_2_2_selected.png"));
                unshuffledDeck[75] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/triangle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_3_2_selected.png"));
                unshuffledDeck[76] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/triangle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_1_2_selected.png"));
                unshuffledDeck[77] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/triangle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_2_2_selected.png"));
                unshuffledDeck[78] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/triangle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_3_2_selected.png"));
                unshuffledDeck[79] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/triangle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_1_2_selected.png"));
                unshuffledDeck[80] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/triangle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_2_2_selected.png"));
                unshuffledDeck[81] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/triangle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_3_2_selected.png"));
                }
          }
    }
    
    //**************  END OF COMMENT BLOCK  ***************/
}
