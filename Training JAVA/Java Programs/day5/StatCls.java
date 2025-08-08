package day5;

public class StatCls {
	static int count = 0;

	static class Counter {
		void increment() {
			count++;
		}

		static void displayCount() {
			System.out.println("Count is: " + count);
		}
	}

	public static void main(String[] args) {
		// Create instances of static nested class
		StatCls.Counter c1 = new StatCls.Counter();
		StatCls.Counter c2 = new StatCls.Counter();

		c1.increment();
		c2.increment();
		c1.increment();

		// Call static method
		StatCls.Counter.displayCount();
	}

}
