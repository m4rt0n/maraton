package practice;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		IRepo ir = new Repo();
		Solutions s = new Solutions(ir);
		Scanner sc = new Scanner(System.in);

		System.out.println("number of people: " + s.getNumberOfPeople());
		System.out.println("enter category to see number of people: ");

		String categoryForNumberOfPeople = sc.next();
		System.out.println(
				"number of people in this category: " + s.getNumberOfMembersByCategory(categoryForNumberOfPeople));

		System.out.println("average age of people: " + s.getAverageAge());

		System.out.println("enter the category to see the names of people");
		String categoryForPeopleList = sc.next();
		s.getPeopleByCategory(categoryForPeopleList).forEach(e -> System.out.println(e.getPersonalData().getName()));

		System.out.println("enter sex to see winner");
		String sex = sc.next();
		System.out.println("the winner is: " + s.getWinnerBySex(sex.charAt(0)).getPersonalData().getName());

	}

}
