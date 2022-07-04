package group1.classwork.lesson15.box;

public class Shipment extends BoxWeight{
    double cost;

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }
}
