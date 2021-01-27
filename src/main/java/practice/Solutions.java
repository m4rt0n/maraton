package practice;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Solutions implements ISolutions {
	private List<Person> personList;

	public Solutions(List<Person> personList) {
		this.personList = personList;
	}

	// 2 number of people
	public int getNumberOfPeople() {
		return personList.size();
	}

	// 3 number of 'elit junior'
	public int getNumberOfMembersByCategory(String category) {
		return (int) personList.stream().filter(p -> p.getPersonalData().getAge() == category).count();
	}

	// 4 average age
	public float getAverageAge() {
		return (float) personList.stream().mapToInt(p -> ((Calendar.YEAR) - (p.getPersonalData().getBirth()))).sum();
	}

	// 5 get start number of people by age
	public List<Person> getNumberByCategory(String age) {
		return personList.stream().filter(p -> p.getPersonalData().getAge() == age).collect(Collectors.toList());
	}

	// 6 get female winner (sum of times)
	public Person getWinnerBySex(char sex) {
		return personList.stream().filter(p -> p.getPersonalData().getSex() == sex)
				.max((p, pp) -> p.getMaratonInfo().getTotal().compareTo(pp.getMaratonInfo().getTotal())).get();
	}

}
