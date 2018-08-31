package io;

import java.io.*;

/**
 * @author ning
 * @create 2018-08-31 9:04
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("D:\\workspace\\java\\thinking-in-java\\src\\io\\BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ":" + s);
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
