package priprema.Bank;

public class BankReceivingSystem implements ReceivingSystem {
    private int redHitnih;
    private int red;
    private int ukupni;
    private boolean occupied;

    public BankReceivingSystem() {
        redHitnih = 0;
        red = 0;
        ukupni = 0;
        occupied = false;
    }

    @Override
    public void customerArrived(boolean urgent) {
        if (urgent) redHitnih++;
        else red++;
        ukupni++;
        calculateEmployeeStatus();
    }

    @Override
    public void customerLeft(boolean urgent) {
        if (urgent) redHitnih--;
        else red--;
        calculateEmployeeStatus();
    }

    @Override
    public void calculateEmployeeStatus() {
        occupied = (getNonUrgentListSize() > 0 || getUrgentListSize() > 0);
    }

    @Override
    public int getUrgentListSize() {
        return redHitnih;
    }

    @Override
    public int getNonUrgentListSize() {
        return red;
    }

    @Override
    public boolean isEmployeeOccupied() {
        return occupied;
    }

    @Override
    public int getNumberOfArrivedCustomers() {
        return ukupni;
    }
}
