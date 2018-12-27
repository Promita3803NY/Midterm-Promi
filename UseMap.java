package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityOfBD = new ArrayList<>();
		cityOfBD.add("Sylhet");
		cityOfBD.add("Comilla");
		cityOfBD.add("Barisal");
		cityOfBD.add("Mymensing");
		cityOfBD.add("Dhaka");

		List<String> cityOfUSA = new ArrayList<>();
		cityOfUSA.add("New York");
		cityOfUSA.add("New Jersey");
		cityOfUSA.add("Texas");
		cityOfUSA.add("Virginia");
		cityOfUSA.add("Florida");


		List<String> cityOfUk = new ArrayList<>();
		cityOfUk.add("London");
		cityOfUk.add("Bristol");
		cityOfUk.add("Liverpool");
		cityOfUk.add("York");
		cityOfUk.add("Manchester");


		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("BD",cityOfBD);
		list.put("UK", cityOfUk);
		list.put("USA",cityOfUSA);

		System.out.println(list);

		//System.out.println(" ");

		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}
		System.out.println(" ");

		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
