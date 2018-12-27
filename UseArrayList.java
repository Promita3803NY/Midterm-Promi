package datastructure;

import databases.ConnectToSqlDB;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("This");
		list.add("Exam");
		list.add("is");
		list.add("Hard");
		list.get(1);
		list.remove(2);

		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for (String a : list)
		{
			System.out.println("Listed Names are -:" + a);
		}

		ConnectToSqlDB arr = new ConnectToSqlDB ();

		//arr.insertDataFromArrayListToSqlTable(list, "ArrayList", "AL Methods");

	}

}


