import java.util.ArrayList;

public class Product {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<String>();
		list.add("book");
		list.add("pen");
		list.add("pencil");
		System.out.println(list);
		list.add("text");


		list.remove("pen");
		System.out.println(list);


	}

}