package priprema.blockchain;

import java.util.Arrays;

public class Blockchain {
    private final Block[] blocks;
    private int size;

    public Blockchain(int maxBlocks) {
        this.size = 0;
        blocks = new Block[maxBlocks];
    }

    public int add(Block newBlock) {
        if (size == 0) {
            blocks[size] = newBlock;
            blocks[size].setPrevHash(new byte[]{0});
            size++;
            return 0;
        }
        blocks[size] = newBlock;
        blocks[size].setPrevHash(blocks[size - 1].hash(blocks[size - 1].getPrevHash()));
        size++;
        return size - 1;
    }

    public Boolean isAltered(int blockIndex, byte[] expectedHash) {
        for (int i = 1; i <= blockIndex; i++) {
            if (!Arrays.equals(blocks[i].getPrevHash(), blocks[i - 1].hash(blocks[i - 1].getPrevHash()))) return true;
        }
        return !Arrays.equals(blocks[blockIndex].hash(blocks[blockIndex].getPrevHash()), expectedHash);
    }

    public Block get(int index) {
        return blocks[index];
    }
}
