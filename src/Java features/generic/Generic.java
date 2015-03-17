package generic;

public class Generic<T extends Number> {

	public void display(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		new Generic<Float>().display(0.1f);
		new Generic<Integer>().display(1);
	}
}
