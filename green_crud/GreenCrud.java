public class GreenCrud {
	/**
	* The minimum acceptable initialSize of calPopulation.
	*/
	public static final int initialSize_min = 1;
	/**
	* The maximum acceptable initialSize of calPopulation.
	*/
	public static final int initialSize_max = 10000;
	/**
	* The minimum acceptable days of calPopulation 
	*/
	public static final int days_min = 1;
	/**
	* The maximum acceptable days of calPopulation.
	*/
	public static final int days_max = 100;

	/**
	* An integer, which determines the size of the fibonacci_ with days_max. 
	*/
	private static int fibonacciSize_ = days_max / 5 + 1;

	/**
	* An integer array which stores fibonacciSize_ Fibonacci numbers.
	*/
	private static int[] fibonacci_ = new int[fibonacciSize_];

	/**
	* A boolean, which indicates if fibonacci_ has been initialized.
	*/
	private static boolean fibonacciInitialed_ = false;

	/**
	* @param initialSize The size of the green crud starts at.
	* @param days The green crud population after days days.
	* @return An integer, which is the size of the green crud population after days days, starting at an initial size of initialSize.
	*/
	public tatic int calPopulation(int initialSize, int days) {
		if (fibonacciInitialed_ == false) {
			fibonacci_[0] = 1;
			fibonacci_[1] = 1;

			for (int i = 2; i != fibonacciSize_; ++i) {
				fibonacci_[i] = fibonacci_[i - 1] + fibonacci_[i - 2];
			}

			fibonacciInitialed_ = true;
		}

		return initialSize * fibonacci_[days / 5];
	}
}