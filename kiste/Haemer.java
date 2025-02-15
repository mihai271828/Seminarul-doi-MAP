package kiste;

public class Haemer implements Sache{
    public double weight;

    public Haemer(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public boolean canCut(){
        return false;
    }

    @Override
    public String toString() {
        return "Haemer{" +
                "weight=" + weight +
                '}';
    }
}
