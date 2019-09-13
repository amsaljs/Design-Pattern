package decorator;

public class IndonesianFood extends FoodDecorator {

    IndonesianFood(Food food) {
        super (food);
    }

    public String prepareFood(){

        return food.prepareFood () + friedRice ();
    }
    private String friedRice(){

        return " With Fried Rice";
    }
    public double foodPrice(){

        return food.foodPrice ()+12.0;
    }
}
