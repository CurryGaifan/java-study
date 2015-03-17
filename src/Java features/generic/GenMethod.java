package generic;

public class GenMethod {

	public <T> void display(T t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		new GenMethod().display("asdf");
		new GenMethod().display(1);

	}
}
