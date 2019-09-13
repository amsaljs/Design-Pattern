package strategy;

class Context {
    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    float execute(float num1, float num2){
        return strategy.calculation (num1,num2);
    }
}
