public class Driver {
	public static void main(String[]args) {
		String str = "Redemption Arc!";
		int v = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				v++;
			}
		}
		System.out.println(str);
		System.out.println(v);
	}
}
