public class Main {
    public static void main(String[] args) {
        String[] genesisTransactions = {"satoshi sent iva 10 bitcoin", "gak finney sent 10 bitcoins to iva"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] secondBlockTransaction = {"ivan sent Anthony 125 bitcoin", "satoshi sent 10 bitcoin to starbuck"};
        Block secondBlock = new Block(genesisBlock.getBlockHash(), secondBlockTransaction);

        

        System.out.println(genesisBlock.getBlockHash());
    }
}