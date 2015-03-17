package fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import org.perf4j.StopWatch;


/**
 * 
 * @ClassName: Fibonacci
 * @Description: 为什么效果反而不如单线程好？ 
 * @Author:yanfeixiang
 * @date 2014年9月28日
 * @Version:1.0
 */
public class Fibonacci extends RecursiveTask<Long> {
	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = -3926843297736248696L;
	final int n;

	Fibonacci(int n) {
		this.n = n;
	}

	private long compute(int small) {
		final long[] results = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
		return results[small];
	}

	public Long compute() {
		if (n <= 10) {
			return compute(n);
		}
		Fibonacci f1 = new Fibonacci(n - 1);
		Fibonacci f2 = new Fibonacci(n - 2);
		// System.out.println("fork new thread for " + (n - 1));
		f1.fork();
		// System.out.println("fork new thread for " + (n - 2));
		f2.fork();
		return f1.join() + f2.join();
	}

	public Long go(int i) {
		if (i <= 10) {
			return compute(i);
		} else {
			return go(i - 1) + go(i - 2);
		}
	}

	public static void main(String[] args) {
		final int N = 30;
		StopWatch stopWatch = new StopWatch();
		Fibonacci fib = new Fibonacci(N);
		ForkJoinPool pool = new ForkJoinPool();
		long result = pool.invoke(fib);

		System.out.println(result);
		stopWatch.stop();
		System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
		System.out.println("Elapsed Time: " + stopWatch.getStartTime());

		stopWatch.start();
		System.out.println(fib.go(N));
		System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
		System.out.println("Elapsed Time: " + stopWatch.getStartTime());

	}
}
