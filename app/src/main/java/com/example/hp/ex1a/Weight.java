package com.example.hp.ex1a;

/**
 * Created by HP on 1/23/2018.
 */

public class Weight {
    public double MilliToKilo(double milli)
    {
        return (milli/1000000);
    }
    public double MilliToGram(double milli){return (milli/1000);}
    public double KiloToMilli(double Kilo)
    {
        return (Kilo*1000000);
    }
    public double KiloToGram(double Kilo)
    {
        return (Kilo*1000);
    }
    public double GramToKilo(double Gram)
    {
        return (Gram/1000);
    }
    public double GramToMili(double Gram){return(Gram*1000);}

}
