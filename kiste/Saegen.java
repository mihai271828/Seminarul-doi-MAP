package kiste;

public class Saegen implements Sache{
    public double weight;

    public Saegen(double weight) {
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
        return "Saegen{" +
                "weight=" + weight +
                '}';
    }
}
