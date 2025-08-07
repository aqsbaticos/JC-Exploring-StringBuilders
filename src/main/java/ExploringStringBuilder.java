public class ExploringStringBuilder {

	public static void main(String[] args) {
		appendContent();
		insertContent();
		deleteContent();
		replaceSection();
		methodChaining();
		sin();
		convertStringBuilderToString();
	}

	//	Exercise 1: Appending Content
	static void appendContent() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", Cadets!");
		System.out.println(sb);
	}

	//	Exercise 2: Inserting Content at a Position
	static void insertContent() {
		StringBuilder sb = new StringBuilder("Java is great!");
		sb.insert(8, "really ");
		System.out.println(sb);
	}

	//	Exercise 3: Deleting Content
	static void deleteContent() {
		StringBuilder sb = new StringBuilder("This is a test sentence.");

		sb.delete(8, 16);
		System.out.println("After delete(8, 16): " + sb);

		sb.deleteCharAt(4);
		System.out.println("After deleteCharAt(4): " + sb);
	}

	//	Exercise 4: Replacing a Section
	static void replaceSection() {
		StringBuilder sb = new StringBuilder("I like programming in Python.");
		sb.replace(24, 30, "Java");
		System.out.println(sb);
	}

	//	Exercise 5: Method Chaining
	static void methodChaining() {
		StringBuilder sb = new StringBuilder("Start");
		sb.append("...").insert(0, "Ready, Set, ").delete(12,15);
		System.out.println(sb);
	}

	//	Exercise 6: Substrings, Index Of and Non-Existing Words
	static void sin() {
		StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");

		String sub = sb.substring(16, 19);
		System.out.println("Substring: " + sub);

		int indexOfFox = sb.indexOf("fox");
		System.out.println("Index of 'fox': " + indexOfFox);

		int indexOfCat = sb.indexOf("cat");
		System.out.println("Index of 'cat': " + indexOfCat);
	}

	//	Exercise 7: Converting StringBuilder to String
	static void convertStringBuilderToString() {
		StringBuilder sb = new StringBuilder("Status: ");
		sb.append("Pending");

		String finalStatus = sb.toString();

		sb.append(" - Approved");

		System.out.println("StringBuilder: " + sb);
		System.out.println("Final String: " + finalStatus);
	}

}