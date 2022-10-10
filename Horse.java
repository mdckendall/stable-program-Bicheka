public class Horse extends Stable{
    String name;
    double weight;
    boolean isTame;

    public Horse(String n, double w, boolean tame) {
        name = n;
        weight = w;
        isTame = tame;
    }

    //String name, double weight, boolean tame
    public String toString(){
        return ( "Name: "+this.name + "Weight: "+this.weight + "Tame: "+this.isTame);
    }
}
