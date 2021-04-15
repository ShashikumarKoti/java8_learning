package examples;

public class MethodReferenceInstanceDemo1 {

	public static void main(String[] args) {


		MethodReferenceInstanceDemo1 mrid = new MethodReferenceInstanceDemo1();
			Runnable r = mrid::m1;
			Thread t = new Thread(r);
			t.start();
			
			for(int i=0;i<10;i++) {
				System.out.println("Main thread");
				}
		}

		//Instance method
		private void m1() {
			for(int i=0;i<10;i++) {
			System.out.println("Child thread");
			}
		}

}
