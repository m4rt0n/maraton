package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		String text = "text.txt";
		List<Person> personList = readFile(text);

	}

	public static List<Person> readFile(String text) {
		List<Person> pl = new ArrayList<>();
		try {
			File file = new File(text);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(";");
				pl.add(makePerson(data));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("not found");
			e.printStackTrace();
		}
		return pl;
	}

	public static Person makePerson(String[] array) {
		PersonalData pd = new PersonalData();
		MaratonInfo mi = new MaratonInfo();

		pd.setName(array[0]);
		pd.setAge(array[1]);
		pd.setNumber(Integer.parseInt(array[2]));
		pd.setSex(array[3]);
		pd.setAge(array[4]);
		mi.setSwim(LocalTime.parse(array[5]));
		mi.setBreakOne(LocalTime.parse(array[6]));
		mi.setCycle(LocalTime.parse(array[7]));
		mi.setBreakTwo(LocalTime.parse(array[8]));
		mi.setRun(LocalTime.parse(array[9]));

		return new Person(pd, mi);
	}
}
