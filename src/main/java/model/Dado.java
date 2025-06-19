package model;
import java.util.Random;
public class Dado {
    private int caraSuperior;

    public Dado() {
        this.caraSuperior = 1;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }

    public void setCaraSuperior(int caraSuperior) {
        this.caraSuperior = caraSuperior;
    }
}
