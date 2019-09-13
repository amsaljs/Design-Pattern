package decorator;

public class VegetableFood implements Food {
    @Override
    public String prepareFood() {
        return "Vegetable Food";
    }

    @Override
    public double foodPrice() {
        return 10.2;
    }
}
