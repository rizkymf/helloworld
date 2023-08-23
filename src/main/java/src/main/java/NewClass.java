package src.main.java;

public class NewClass {

    String testGlobal = "ini percobaan dalam kelas";

    public void kelasBaru() {
        String testCoba = "ini percobaan dalam method";
        System.out.println(src.main.java.HelloWorld.instanceVariable);
    }

    public static String instanceMethod() {
        return "Hello ";
    }

    public static String instanceMethod(String msg) {
        return "Hello ";
    }
}
