package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		List<Customer> allCustomers = DummyDatabase.getAllCustomers();
		
		//Here we are converting List<Customers> to get List<String> while getting emails. This is why we have used  map. This is called
		//Data transformation  ...One to One mapping(one customer will have one email id)
		List<String> emails = allCustomers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		//Below scenario gives list of list of string as we are fetching phone numbers(which is list again). Hence map cannot be used 
		//here. Instead flatMap should be used.
		List<List<String>> collect = allCustomers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(collect);
		
		//Usage of flatMap when we have list of list.(One to Many mapping ....since once customer can have many phone numbers)
		List<String> phoneNmbers = allCustomers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNmbers);
	}

}


class Customer {
	
	private int id;
	private String name;
	private String email;
	private List<String> phoneNumbers;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}


class DummyDatabase {
	
	public static List<Customer> getAllCustomers() {
		return Stream.of(
				new Customer(101, "john", "john@aaa.com", Arrays.asList("11111","22222")),
				new Customer(102, "smith", "smith@aaa.com", Arrays.asList("33333","44444")),
				new Customer(103, "keith", "keith@aaa.com", Arrays.asList("55555","66666")),
				new Customer(104, "michael", "michael@aaa.com", Arrays.asList("77777","88888"))
				).collect(Collectors.toList());
	}
}