package kiste;

public class Naegel implements Sache{
    public double weight;

    public Naegel(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public boolean canCut(){
        return true;
    }

    @Override
    public String toString() {
        return "Naegel{" +
                "weight=" + weight +
                '}';
    }
}
