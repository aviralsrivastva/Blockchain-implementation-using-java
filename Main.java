package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    ArrayList<Block> blockchain = new ArrayList<>();




    public static void main(String[] args) {
	// write your code here

        String[] genesistransc = {"sent 1035002 bitcoins", "recvd 10 bitcoins"};
        String[] block1={"sent 10023 bticoins", "recvd 20 bitcoins"};
        String[] block2={"sent 30023 bticoins", "recvd 40 bitcoins"};

        Block gensisblock = new Block(0,genesistransc);

        Block block12 = new Block(gensisblock.getBlockHash(),block1);

        Block block3 = new Block(block12.getBlockHash(),block2);

        System.out.println("hashcode of genesis block");
        System.out.println(gensisblock.getBlockHash());
        System.out.println("hashcode of block1");
        System.out.println(block12.getBlockHash());
        System.out.println("hashcode of block2");
        System.out.println(block3.getBlockHash());


        /*
        String list1[] = {"a","b","c"};
        String list2[] = {"a","b","c"};


        System.out.println(Arrays.hashCode(list1));

        System.out.println(Arrays.hashCode(list2));

            */


        //Hash = digital signature
        //Each block will have have
            // 1, list of transactions
            // 2. Previous hash




    }
}
