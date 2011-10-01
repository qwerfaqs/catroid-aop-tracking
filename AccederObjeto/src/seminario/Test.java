package seminario;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CurrentObject co1 = new CurrentObject();
		CurrentObject co2 = new CurrentObject();

		co1.Method("co1", "xxx");
		co1.Function();

		co2.Method("co2", "yyy");
		co2.Function();

		co1.Method("co1", "xxz");
		co1.Function();

	}

}
