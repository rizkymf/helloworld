package src.main.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

public class Topic5 {

    public String contohStringBuffer(String kata1, String kata2) {
        StringBuffer gabunganString = new StringBuffer();
        gabunganString.append(kata1).append(kata2);
        return gabunganString.toString();
    }

    public String contohStringJoiner(String[] banyakKata) {
        StringJoiner stringJoiner = new StringJoiner("-", "0000", "======");
        for(int i = 0; i < banyakKata.length; i++) {
            stringJoiner.add(banyakKata[i]);
        }
        return stringJoiner.toString();
    }

    public void contohDateTime() {
        Date date = new Date();
        // yyyy-MM-dd
        // yyyy-dd-MM
        // dd-MM-yyyy
        // MM-dd-yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        sdf.format(date);
        System.out.println(sdf.format(date));

        Date first = new Date(0L);
        System.out.println(first);
    }

    public static void contohMath() {
        System.out.println(Math.sqrt(16));
    }

    public void read(String originFile) {
        try {
            // java akan membuka file, klo tdk ada java akan create
            File file = new File(originFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] tempArr;
            while((line = bufferedReader.readLine()) != null) {
                tempArr = line.split(",");
                for (int i = 0; i < tempArr.length; i++) {
                    System.out.print(tempArr[i] + " ");
                }
                System.out.println();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String targetFile) {
        try {
            // java akan membuka file, klo tdk ada java akan create
            File file = new File(targetFile);
            if(file.createNewFile()) {
                System.out.println("file has been created");
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("uhuyy\n");
            bw.write("coyy");
            bw.newLine();
            bw.write("testt");
            bw.flush();
            bw.close();
            System.out.println("penulisan ke file rebes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
