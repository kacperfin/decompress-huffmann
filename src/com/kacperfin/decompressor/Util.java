package com.kacperfin.decompressor;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Util {
    public static int hufDictionaryToTxt(String input_name, String output_name) throws Exception {
        FileInputStream read = new FileInputStream(new File("files/"+input_name));
        FileWriter write = new FileWriter(new File("files/"+output_name));

        int b;

        while(((b = read.read()) != -1) && (b != 0))
        {
            write.write(b);
        }

        while((b = read.read()) != -1)
        {
            System.out.println(b);
        }

        write.close();
        read.close();

        return 0;
    }

    public static int hufDictionaryTxtToArrayList(String input_name, ArrayList<String> codes) throws Exception {

        Scanner scanner = new Scanner(new File("files/"+input_name));
        System.out.println(scanner.nextLine());
        int ascii=-3;
        String code="EMPTY";

        for(int i=0; i<513; i++)
        {
            codes.add(null);
        }

        while(scanner.hasNext())
        {
            if(ascii==-3)
            {
                ascii = Integer.parseInt(scanner.next());
            }
            else if(code.equals("EMPTY"))
            {
                code = scanner.next();
            }
            else
            {
                if(ascii!=-1)
                {
                    codes.set(ascii, code);
                }
                else
                {
                    codes.set(512, code);
                }
                ascii = -3;
                code = "EMPTY";
            }
        }
        if(ascii!=-1)
        {
            codes.set(ascii, code);
        }
        else
        {
            codes.set(512, code);
        }

        return 0;
    }

    public static int printCodes(ArrayList<String> codes)
    {
        for(int i=0; i<513; i++)
        {
            System.out.println(i + " " + codes.get(i));
        }

        return 0;
    }

    public static int decode(String input_name, String output_name, ArrayList<String> codes) throws Exception
    {
        FileInputStream read = new FileInputStream(new File("files/"+input_name));
        FileWriter write = new FileWriter(new File("files/"+output_name));
        String current_code="";
        int b;

        while(((b = read.read()) != -1) && (b != 0))
        {
            ;
        }

        while((b = read.read()) != -1)
        {
            System.out.println(b);
        }

        return 0;
    }
}
