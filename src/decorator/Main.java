package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println (new IndonesianFood (new VegetableFood ()).prepareFood ());
        System.out.println (new IndonesianFood (new VegetableFood ()).foodPrice ());
    }
}
