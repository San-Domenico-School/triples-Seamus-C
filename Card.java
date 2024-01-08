import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public boolean getSelected()
    {
        return isSelected;
    }
    public void setSelected(boolean selected)
    {
        isSelected = selected;
    }
}

