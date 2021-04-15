package examples;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		//Supplier takes NO input but provides only output
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());
		
		Supplier<String> supplierForRandomNum = () ->{
			String otp = "";
			for(int i=0;i<6;i++) {
				otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(supplierForRandomNum.get());
	}

}
