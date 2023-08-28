package src.main.java; //

public class HelloWorld {

	static String instanceVariable = "instance variable from HelloWorld class";

	public static final String INI_FINAL = "asd;lfkjas;ldkjf";

	public static void main(String[] args) {
		Topic2 topic2 = new Topic2();
		Topic3 topic3 = new Topic3();

		Topic5 topic5 = new Topic5();
		System.out.println(topic5.contohStringBuffer("Java ", "Backend"));

		String[] banyakKata = {"aku","kamu","dia"};
		System.out.println(topic5.contohStringJoiner(banyakKata));

		topic5.contohDateTime();
		topic5.contohMath();
		topic5.read("src/main/resources/cobacsv.csv");
		topic5.write("src/main/resources/gaada.txt");
	}


}