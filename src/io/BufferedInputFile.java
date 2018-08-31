package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ning
 * @create 2018-08-27 9:48
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        // read input by line
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("D:\\workspace\\java\\thinking-in-java\\src\\io\\BufferedInputFile.java"));
    }
}
