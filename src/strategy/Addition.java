package strategy;

public class Addition implements Strategy {
    @Override
    public float calculation(float num1, float num2) {
        return num1+num2;
    }
}
