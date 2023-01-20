package projectrahulshetty;

public class ReversedString {

	public void reversedString() {
		String name = "DIPU";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}
