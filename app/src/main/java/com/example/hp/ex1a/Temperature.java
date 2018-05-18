package com.example.hp.ex1a;

/**
 * Created by HP on 1/23/2018.
 */

public class Temperature {
    public double FerToKelvin(double fer)
    {
        return ((fer+459.67)*5/9);
    }

    public double KelvinToFer(double kelvin)
    {
        return ((kelvin*9/5)-459.67);
    }

    public double CelsiTokelvin(double Celsi)
    {
        return (Celsi+273.15);
    }

    public double KelvinToCelsi(double Kelvin)
    {
        return (Kelvin-273.15);}

    public double FarToCel(double fer){

        return((fer-32)*5/9);

    }
    public double CelToFar(double cel){
        return ((cel*9/5)+32);
    }



}
