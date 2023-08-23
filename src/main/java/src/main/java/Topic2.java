package src.main.java;

import java.util.Arrays;
import java.util.Scanner;

public class Topic2 {

    String classVariable;

    public Topic2() {
        //		instanceVariable = "asdf";
//		ini buat ngeprint ke console
		System.out.println("Hello World");

		contohChar();
		contohAngka();
		contohBoolean();
		contohStringManipulation();
		contohNonPrimitive();

		methodVoid("Rizky");
//		// Integer > String
		contohConversion();
		contohInput();
//
//
//		String nama = "Rizzzky";
//		String variable = perkenalan(nama);
//		System.out.println(variable);
//
//		System.out.println(intro() + perkenalan(nama));

        System.out.println("==========================");
        System.out.println("TOPIC 3");
        String[] namaStudent = new String[25];
        Arrays.fill(namaStudent, "student");
        // student1,student2,student3,student4...student25
        String studentName[] = new String[25];
        String []studentName1 = new String[25];

        String[] studentName2 = {"Rizky", "Sabrina", "Rizki"};
        String studentName3 = "Rizky,Sabrina,Udin,Ucok,Uhuy";
        String[] studentName3Array = studentName3.split(",");
        System.out.println(studentName3Array[2]);

        // String 2d
        String[][] students = new String[5][5];

        System.out.println(studentName2[1]);
        studentName2[1] = "Fauzi";
        System.out.println(studentName2[1]);

        int[] angka = new int[5];
        System.out.println(namaStudent[5]);
        System.out.println(angka[3]);

        // ArrayIndexOutOfBounds karena akses index diluar batas
//		System.out.println(studentName2[3]);
//		System.out.println(studentName2[-1]);
    }

    public static void methodVoid(String nama) {
        String data = "data";
        System.out.println("Hello " + nama);
    }

    public static String intro() {
        return "Selamat datang di Binar BEJ-1! : ";
    }

    /**
     * Ini adalah method yang berisikan contoh contoh deklarasi variable
     * dengan angka yang memiliki tipe data primitive
     */
    public static void contohAngka() {
        // tipe data angka
        int kosong; // 0
        int angka = 10;
        angka = 11;
        long angkaLong = 10l;
        float angkaFloat = 1.5f;
        double angkaDouble = 2.5d;
    }

    public static void contohChar() {
        // tipe data huruf char
        char huruf = '1';
    }

    public static void contohBoolean() {
        // tipe data logic
        boolean bool = 10 > 5; //true
        boolean bool1; // false
    }

    public static void contohStringManipulation() {
        // String manipulation
        String string1 = "aku";
        String string2 = "kamu";

        String string3 = string1;
        String nama = "Rizzzzky";
        System.out.println(string1 + " " + string2);
    }

    public static void contohInput() {
        // Inisialisasi object scanner dengan nama input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kamu => ");
        String userInput = input.nextLine();
        methodVoid(userInput);

        input.close();
    }

    public static void contohNonPrimitive() {
        // non primitive data type
        Integer referenceInt = 10;
        referenceInt.byteValue();
    }

    public static void contohConversion() {
        Integer contoh = 10;
        String contohJadiString = String.valueOf(contoh);
    }

    public void contohNonStatic() {
        classVariable = "ini adalah contoh non static";
        System.out.println(classVariable + intro());
    }

}
