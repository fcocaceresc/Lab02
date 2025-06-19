package model;
import java.util.Random;
public class Dado {
    public static int main(String[] args) {
        Random tirada = new Random();
        return tirada.nextInt(6) + 1;
    }
}
//