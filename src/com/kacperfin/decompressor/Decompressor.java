package com.kacperfin.decompressor;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Decompressor {
    public static int decompress(String input_name, String output_name) throws Exception {

        Util.hufDictionaryToTxt(input_name, "_dictionary.txt");
        ArrayList<String> codes = new ArrayList<String>(513);
        Util.hufDictionaryTxtToArrayList("_dictionary.txt", codes);
        //Util.printCodes(codes);
        Util.decode(input_name, output_name, codes);
        //read .huf file from beginning to null character, and do nothing with it
        //read each byte and write it to txt file as 0s and 1s
        //read this new 0/1 file recursively to encode it

        return 0; //0 = no errors, decompressed correctly
    }
}
