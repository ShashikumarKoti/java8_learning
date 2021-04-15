package examples;

public class ConstructorReferenceDemo1 {

	//We should use Constructor reference when interface method returns an Object<T>
	
	public static void main(String[] args) {

		ISample iSample = Sample::new;
		//Sample sampleObj1 = iSample.getSample();
		Sample sampleObj2 = iSample.getSample2(5);
		
	}

}


interface ISample {
	
	//public Sample getSample();
	
	public Sample getSample2(int i);
}

class Sample {
	
	private int i;
	Sample() {
		System.out.println("Sample class Constructor executed");
	}
	
	Sample(int i) {
		this.i = i;
		System.out.println("Sample class One arg Constructor executed " + i);
	}
}