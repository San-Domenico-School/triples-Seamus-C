import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author Seamus
 * @version 26/1/24
 */

public class Card extends Actor
{
    private boolean isSelected;
    
    private Shape shape;
    private Color color;
    private int numberOfShapes;
    private int shading;
    
    private GreenfootImage cardImage, selectedCardImage;
    
    public enum Shape
    {
        TRIANGLE, SQUARE, CIRCLE, NO_SHAPE
    }
    public enum Color
    {
        RED, GREEN, BLUE, NO_COLOR
    }
    
    public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage)
    {
        this.shape = shape;
        this.color = color;
        this.numberOfShapes = numberOfShapes;
        this.shading = shading;
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage;
        
        setImage(cardImage);
    }
    
    public Shape getShape()
    {
        return shape;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getNumberOfShapes()
    {
        return numberOfShapes;
    }
    
    public int getShading()
    {
        return shading;
    }
    
    public GreenfootImage getCardImage()
    {
        return cardImage;
    }
    
    public GreenfootImage getSelectedCardImage()
    {
        return selectedCardImage;
    }
    
    public boolean getIsSelected()
    {
        return isSelected;
    }
    
    public void setIsSelected(boolean selected)
    {
        isSelected = selected;
    }
}

