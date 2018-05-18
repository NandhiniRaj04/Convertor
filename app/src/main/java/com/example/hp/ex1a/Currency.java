 package com.example.hp.ex1a;

/**
 * Created by HP on 1/21/2018.
 */

public class Currency {

    public float euro_usd(double cur){
        float us= (float) (cur * 1.21);
        return us;

    }

    public double euro_rupee(double cur)
    {
        double rupee= cur * 77.14;
        return rupee;
    }
    public  double euro_baht(double cur)
    {
        double baht= cur * 38.77;
        return baht;
    }
    public double us2euro(double e) {
        double res = e * 0.83;
        return res;
    }
    public double us2bp(double h) {
        double c = h * 0.74;
        return c;
    }
    public double us2ir(double b) {
        double a = b * 63.44;
        return a;
    }

    public double us2ad(double c) {
        double d = c * 1.28;
        return d;
    }
    public double ir2euro(double bp) {
        double ad = bp *60.013;
        return ad;
    }
    public double ir2usd(double bp) {
        double ad = bp *0.95;
        return ad;
    }
    public double ir2baht(double bp){
    double ad = bp *0.5;
    return  ad;}
    public double baht2ir(double bp){
        double ad=bp*2.003;
        return ad;
    }
    public double baht2euro(double bp) {
double ad=bp*2.0;
return  ad;
    }
    public double baht2usd(double bp){
        double ad=bp*2.5;
        return ad;
    }
    }


