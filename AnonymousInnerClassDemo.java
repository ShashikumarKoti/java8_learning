package examples;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {

		
		Thread t1 = new Thread()
		{
			public void run() {
				System.out.println(Thread.currentThread().getName() + " in thread inner class");
			}
		};
				t1.start();
				System.out.println(Thread.currentThread().getName());
				
		Runnable r = new Runnable() 
		{
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " in runnable inner class");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}

}
