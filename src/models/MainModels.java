package models;

public class MainModels {
    public double calcConeVolume(double radius, double height){
        double volume = 1.0/3.0 * Math.pow(radius, 2) * Math.PI * height;
        return volume;
    }
}
