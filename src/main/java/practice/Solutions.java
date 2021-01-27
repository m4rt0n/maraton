package practice;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Solutions implements ISolutions {

	private IRepo iRepo;

	public Solutions(IRepo iRepo) {
		this.iRepo = iRepo;
	}

	public List<Person> pList = iRepo.getAll();

	public int getNumberOfPeople() {
		return pList.size();
	}

	public int getNumberOfMembersByCategory(String category) {
		return (int) pList.stream().filter(p -> p.getPersonalData().getAge() == category).count();
	}

	public float getAverageAge() {
		return (float) pList.stream().mapToInt(p -> ((Calendar.YEAR) - (p.getPersonalData().getBirth()))).sum();
	}

	public List<Person> getPeopleByCategory(String category) {
		return pList.stream().filter(p -> p.getPersonalData().getAge() == category).collect(Collectors.toList());
	}

	public Person getWinnerBySex(char sex) {
		return pList.stream().filter(p -> p.getPersonalData().getSex() == sex)
				.max((p, pp) -> p.getMaratonInfo().getTotal().compareTo(pp.getMaratonInfo().getTotal())).get();
	}

}
