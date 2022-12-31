public class MyClass {
	public static void main(String[] args) {
		// this prints normally
		System.out.print("This is the day the Lord has made!\n");
		
		// this prints in upper case
		System.out.print("This is the day the Lord has made!\n".toUpperCase());

		// this prints in lower case
		System.out.print("This is the day the Lord has made!\n".toLowerCase());

		// this prints two strings
		System.out.format("%s%s","Hello ","there.\n");

		// this adds a tab
		System.out.print("\tHave a good day!\n");

		// this left justifies two strings
		System.out.format("%-30s%-30s", "Have a good day!", "What is up!");
		System.out.print("\n");
		System.out.format("%-30s%-30s", "Howdy Partner!", "Got Some Chow!");
		System.out.print("\n");

		// this right justifies
		System.out.format("%30s","Have a good day!\n");

		// this stores strings and then prints them
		String s,t;

		s = "This is one string.";
		t = "This is another string.";
		System.out.println(s + " " + t);

		// this converts the strings to lower case and then prints them
		s = s.toLowerCase();
		t = t.toUpperCase();
		System.out.println(s + " " + t);

	}
}
