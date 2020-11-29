package core_java.Lab_Solutions.Lab9;

public class Numberformatexception {

	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("kjhkjhjhjkhjkhk");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		}
	}
}