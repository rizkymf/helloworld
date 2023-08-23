package src.main.java;

public class Topic3 {

    public Topic3() {
        String stringPertama = "BEJ";
        String stringKedua = new String("BEJ");
        System.out.println("stringPertama : " + stringPertama);
        System.out.println("stringKedua : " + stringKedua);
        if(stringPertama == stringKedua) { // false
            System.out.println("String nya sama pake ==");
        } else {
            System.out.println("String berbeda klo pake ==");
        }

        if(stringPertama.equalsIgnoreCase(stringKedua)) { // true
            System.out.println("String nya sama dengan method equals");
        }

        String psn;
        int num1 = 10;
        if(num1 == 10 && num1 < 20 || num1!=5) {
            psn = "angka nya 10";
        } else {
            psn = "angkanya bukan 10";
        }

        psn = num1 == 10 && num1 < 20 || num1!=5 ? perkenalan(psn) : "bukan 10";

        int num2 = 25;
        if(num2 > 20) {
            System.out.println("banyak");
            if(num1 > 10) {
                System.out.println("if dalam if");
            }
        } else if(num2 > 10) {
            System.out.println("lumayan");
        } else if(num2 > 5) {
            System.out.println("cukup");
        } else {
            System.out.println("dikitt");
        }

        switch(num2) {
            case 25:
                System.out.println("Angkanya 25 nih");
                break;
            case 10:
                System.out.println("Angkanya 10 nih");
                break;
            default:
                break;
        }

        int k = 5;
        for(int i = 0; i < k; i++) {
            System.out.println("Sabrina Cantik Banget ke-"+i);
        }

        // Nested Loop
        for(int i = 0; i < 2; i++) {
            System.out.println("outer");
            for(int j = 0; j < 3; j++) {
                System.out.println("inner");
//				if(i==1 && j==1) return;
            }
        }

        num2 = 25;
        // while standar
        while(num2 < 20) {
            System.out.println("while standar");
        }

        boolean isActive = true;
        while(isActive) {
            // Code tertentu
            if(num2 == 25) {
                isActive = false;
            }
        }

        num2 = 25;
        // do while
        do {
            System.out.println("do while");
        } while(num2 < 20);

        System.out.println(recursion(1, 1, 5));
    }

    public static String perkenalan(String nama) {
        return "Halo perkenalkan nama saya " + nama;
    }

    // method ini ....
    public static int recursion(int angka, int iter, int stop) {
        angka+=iter;
        if(iter == stop) return angka;
        return recursion(angka, iter+1, stop);
    }
}
