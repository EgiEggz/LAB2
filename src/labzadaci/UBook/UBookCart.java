package labzadaci.UBook;

public interface UBookCart {
    void add(String ISBN, int quantity);

    void remove(String ISBN, int quantity);

    float getCost();
}