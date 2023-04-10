package priprema.blockchain;

// blok transakcija
public class Block {
    Hasher hasher;
    private byte[] prevHash; // hash prethodnog bloka u lancu blokova
    private final String[] transactions;
    private int size;

    public Block(int maxTransactions) {
        this.size = 0;
        transactions = new String[maxTransactions];
        hasher = new SHAHasher();
    }

    public Block(int maxTransactions, Hasher hasher) {
        this.size = maxTransactions;
        transactions = new String[size];
        this.hasher = hasher;
    }

    public byte[] hash(byte[] prevHash) {
        return new SHAHasher().hash(prevHash, this.transactions);
    }

    public byte[] getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(byte[] prevHash) {
        this.prevHash = prevHash;
    }

    public int add(String transaction) {
        transactions[size] = transaction;
        size++;
        return size - 1;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            transactions[i] = transactions[i + 1];
        }
        size--;
    }
}
