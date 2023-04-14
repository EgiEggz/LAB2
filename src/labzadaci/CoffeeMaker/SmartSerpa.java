package labzadaci.CoffeeMaker;

public class SmartSerpa implements CoffeeMaker{
    private int coffee;
    private int water;
    private int pot;
    private boolean heated;

    public SmartSerpa() {
        water = 0;
        coffee = 0;
        pot = 0;
        heated = false;
    }

    @Override
    public void addWater(int water) {
        this.water+=water;
        heated = false;
    }

    @Override
    public void heatWater() {
        heated = true;
    }

    @Override
    public void addCoffee(int coffeeSpoonNumber) {

        if (isWaterHeated())coffee+=coffeeSpoonNumber;

    }

    @Override
    public int pourCoffee(int requestedCupsNumber) {
        int noOfCups = 0;
        if (isWaterHeated()){
            for (int i = 0; i < requestedCupsNumber; i++) {
                coffee -= 2;
                water -= 1;
                if ((water >=0) && (coffee >= 0) ) noOfCups++;
                else {
                    water = 0;
                    coffee = 0;
                }
            }
        }
        return noOfCups;
    }

    @Override
    public int getWaterAmount() {
        return water;
    }

    @Override
    public int getCoffeeSize() {
        return coffee;
    }

    @Override
    public boolean isWaterHeated() {
        return heated;
    }
}
