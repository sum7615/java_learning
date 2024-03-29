package co.suman;

import java.util.HashMap;
import java.util.Map;

import co.suman.people.Address;
import co.suman.people.Person;

public class UsingHashMap {

	public static void main(String[] args) {
		Map<Person, Address> map = new HashMap<Person,Address>();
		map.put(new Person("Suman", "Paul"), new Address("Amtali","Agartala","Tripura"));
		map.put(new Person("Rabindra", "Paul"), new Address("R.K Pallli","Agartala","Tripura"));
		map.put(new Person("Anjana", "Paul"), new Address("T.U","Agartala","Tripura"));
				System.out.println(map.size());
				System.out.println("Total Map =>>>>>>>"+map);
		for(Person p: map.keySet()) {
		System.out.println(p);
		System.out.println("---->"+map.get(p));
		}
		
	}
}
