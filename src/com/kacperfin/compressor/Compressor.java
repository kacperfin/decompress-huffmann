package com.kacperfin.compressor;

public class Compressor {

    public static int compress(String input_name) throws Exception {
        String[] command = {"bash", "compress-script.sh", input_name};
        ProcessBuilder pb = new ProcessBuilder(command);
        Process process = pb.start();
        return process.waitFor(); //0 = no errors, compressed correctly
    }
}
