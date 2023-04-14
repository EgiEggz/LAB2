package labzadaci.AnimalSnake;

public class test {
    public static void main(String[] args) {
        Snake cobra = new Snake(false, 29, true, true);
        System.out.println(cobra.isDangerous());
        System.out.println(cobra.isFast());
        System.out.println(cobra.toString());
    }
}
