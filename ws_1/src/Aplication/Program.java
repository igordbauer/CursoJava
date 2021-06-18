package Aplication;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

	
		
		for (Integer x : list) {
			if (list.isEmpty() == false) {
				System.out.println("y");
			}
			else {
				System.out.println("n");
			}
		}
	}

}
