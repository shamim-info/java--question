package sarfrazsir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findMinMax {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
        list.add(4555);
        list.add(455);
        list.add(3445);
        list.add(4675);
        list.add(45565);
        list.add(435355);
        list.add(4545); 
        list.add(4125);
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
        System.out.println(list);
	}

	private static String findMin(List<Integer> list) {
		// TODO Auto-generated method stub
		return findMax(null);
	}

	private static String findMax(List<Integer> list) {
		// TODO Auto-generated method stub
		return null   ;
	}

}

