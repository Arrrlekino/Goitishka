package ua.alla.module9;

/**
 * Created by Arlekino on 1/29/2016.
 */
public class MusInstrument {
    private String name;
    private String color;
    private double price;

    public MusInstrument(final String name, final String color, final double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public String getColor(){
        return color;
    }

    public double getPrice() {
        return price;
    }
}
