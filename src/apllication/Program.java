package apllication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller obj1 = new Seller(21, "BOB", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj1);
	}
}