package kiste;

public class Scheren implements Sache {
    public double weight;
    public Scheren(double weight) {
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
        return "Scheren{" +
                "weight=" + weight +
                '}';
    }
}
