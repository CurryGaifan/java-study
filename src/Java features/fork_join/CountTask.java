package fork_join;

import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {

	private int threshold = 2;
	int start;
	int end;

	public CountTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		if (end - start > threshold - 1) {
			int middle = start + (start - end) / 2;
			CountTask countTask1 = new CountTask(start, middle);
			CountTask countTask2 = new CountTask(middle + 1, end);
			countTask1.fork();
			countTask2.fork();
			return countTask1.join() + countTask2.join();
		} else {
			int sum = 0;
			for (int i = start; i <= end; i++)
				sum += i;
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println(new CountTask(10, 50).compute());
	}

}
