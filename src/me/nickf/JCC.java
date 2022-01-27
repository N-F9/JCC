package me.nickf;

public class JCC {
	public static String RESET = "\u001b[0m";

	private static String base(int modifier, String value) {
		return "\u001B[" + modifier + "m" + value + RESET;
	}

	public static String bold(String str) {
		return base(1, str);
	}

	public static String dim(String str) {
		return base(2, str);
	}

	public static String italicize(String str) {
		return base(3, str);
	}

	public static String underline(String str) {
		return base(4, str);
	}

	public static String black(String str) {
		return base(30, str);
	}

	public static String red(String str) {
		return base(31, str);
	}

	public static String green(String str) {
		return base(32, str);
	}

	public static String yellow(String str) {
		return base(33, str);
	}

	public static String blue(String str) {
		return base(34, str);
	}

	public static String purple(String str) {
		return base(35, str);
	}

	public static String cyan(String str) {
		return base(36, str);
	}

	public static String white(String str) {
		return base(37, str);
	}

	public static String blackBackground(String str) {
		return base(40, str);
	}

	public static String redBackground(String str) {
		return base(41, str);
	}

	public static String greenBackground(String str) {
		return base(42, str);
	}

	public static String yellowBackground(String str) {
		return base(43, str);
	}

	public static String blueBackground(String str) {
		return base(44, str);
	}

	public static String purpleBackground(String str) {
		return base(45, str);
	}

	public static String cyanBackground(String str) {
		return base(46, str);
	}

	public static String whiteBackground(String str) {
		return base(47, str);
	}

	public static void main(String[] args) {
		System.out.println(JCC.bold("Hello, World!"));
	}
}
