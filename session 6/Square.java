package session6;

import java.io.Serializable;
public class Square implements Serializable
{
    private double length;
    public Square(double length){ this.length = length; }
    public void setLength(double length){ this.length = length; }
    public double getLength(){ return length; }
    public Double getArea(){ return length * length; }
    public String toString()
    {
        return String.join(" ", "Length:", String.valueOf(length), " Area:", String.valueOf(getArea()));
    }
}