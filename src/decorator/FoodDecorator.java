package decorator;

class FoodDecorator implements Food{
    Food food;

    FoodDecorator(Food food) {

        this.food = food;
    }
    public String prepareFood(){
        return food.prepareFood ();
    }

    public double foodPrice() {
        return food.foodPrice ();
    }

}
