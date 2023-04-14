package labzadaci.UBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UBook implements UBookCart{
    private double cost;
    private double single;
    private Map<String,Integer> hm = new HashMap<>();
    private Random rand = new Random();
    public UBook() {
        cost = 0;
    }

    @Override
    public void add(String ISBN, int quantity) {
        hm.put(ISBN,quantity);
        single = rand.nextFloat(100);
        cost+=single*quantity;
    }

    @Override
    public void remove(String ISBN, int quantity) {
        if (quantity<=hm.get(ISBN)) {
            hm.put(ISBN, hm.get(ISBN) - quantity);
            cost -= single * quantity;
        }
        else {
            cost -= hm.get(ISBN)*single;
            hm.put(ISBN, 0);
        }
    }

    @Override
    public float getCost() {
        return (float)(Math.round(cost*1000d)/1000d);
    }

    @Override
    public String toString() {
        return "UBook{" +
                "cost=" + getCost() +
                ", hm=" + hm;
    }
}
