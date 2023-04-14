package labzadaci.UBook;

public class Main {

    public static void main(String[] args) {
        UBook cs = new UBook();
        cs.add("000",2);
        System.out.println(cs);
        cs.add("001",3);
        System.out.println(cs);
        cs.add("002",4);
        System.out.println(cs);
        cs.remove("001",5);
        System.out.println(cs);

    }
}
