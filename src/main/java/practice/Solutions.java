package practice;

import java.util.List;
import java.util.stream.Collectors;

public class Solutions {
	private List<Person> personList;

	public Solutions(List<Person> personList) {
		this.personList = personList;
	}

	// 2 number of people
	public int getNumberOfPeople() {
		return personList.size();
	}

	// 3 number of 'elit junior'
	public int getNumberOfElitJunior() {
		return (int) personList.stream().filter(p -> p.getPersonalData().getAge() == "elit junior").count();
	}

	// 4 average age
	public float getAverageAge() {
		return (float) personList.stream().mapToInt(p -> 2021 - (p.getPersonalData().getBirth())).sum();
	}

	// 5 get start number of people by age
	public List<Person> getNumberByCategory(String age) {
		return personList.stream().filter(p -> p.getPersonalData().getAge() == age).collect(Collectors.toList());
	}

	// 6 get female winner (sum of times)
	public Person getFemaleWinner() {

		return personList.stream().filter(p -> p.getPersonalData().getSex() == "f")
				.max((p, pp) -> p.getMaratonInfo().getTotal().compareTo(pp.getMaratonInfo().getTotal())).get();
	}

}
