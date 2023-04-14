package labzadaci.AnimalSnake;

public class Snake extends Animal{

    private boolean large;

    private boolean venomous;

    public Snake(boolean vegetarian, double speed,boolean large, boolean venomous) {
        super(vegetarian, speed);
        this.large = large;
        this.venomous = venomous;
    }

    public String isDangerous(){
         if (large && venomous) return "very dangerous";
         else if (large || venomous) return "dangerous";
         else return "not dangerous";
    }

    public boolean isFast(){
        return getSpeed() >= 10;
    }

    @Override
    public String toString(){
        return ("This type of snake is " + isDangerous() + " and " + (isFast() ? "fast" : "not fast") + ".");
    }
}
