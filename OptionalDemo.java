package examples.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {

		
		Customer cust = new Customer(555, "shashi", null, Arrays.asList("23333","565676"));
		Customer cust2 = new Customer(555, "shashi", "sk@aaa.com", Arrays.asList("23333","565676"));
		
		Optional<String> email = Optional.ofNullable(cust.getEmail());
		if(email.isPresent())
		System.out.println(email.get());
		
		//OR  ..i.e if value is not present/null, then if you wish to return some default value then use below
		//Note: orElse can be used to give default value or to throw CustomizedException
		System.out.println(email.orElse("default@aaa.com"));
	//	System.out.println(email.orElseThrow(() -> new IllegalArgumentException("email not present")));
		
		System.out.println(email.map(String::toUpperCase).orElseGet(() -> "default email...."));
		
		getCustomerByEmail("pqr");
		
		//If value is present, then use get(), to get the value
		Optional<String> email2 = Optional.ofNullable(cust2.getEmail());
		System.out.println(email2.get());
		
		Optional<String> email3 = Optional.ofNullable(cust2.getEmail());
		System.out.println(email3);
		
		System.out.println(email2.map(String::toUpperCase).orElseGet(() -> "default email...."));
	}

	
	public static Customer getCustomerByEmail(String email) {
		List<Customer> allCustomers = DummyDatabase.getAllCustomers();
		//Below throws exception if email not present
	//	Customer customer = allCustomers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().get();
		
		//Below gives empty customer object, if email not present
		Customer customer2 = allCustomers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().orElse(new Customer());
		
	//	Customer customer3 = allCustomers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().orElseThrow(()-> new IllegalArgumentException("No such email present"));
		return customer2;
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