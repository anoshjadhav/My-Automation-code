package basicWebDriver;



public class Count {
	public static void main(String[] args) {
		long count = 0;
		try {
			for (long i = 0; ; i++) {
				count = i;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(count);
			System.out.println("time out");
		}
	}
}
