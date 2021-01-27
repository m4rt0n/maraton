package practice;

import java.util.List;

public interface ISolutions {

	public int getNumberOfPeople();

	public int getNumberOfMembersByCategory(String category);

	public float getAverageAge();

	public List<Person> getPeopleByCategory(String category);

	public Person getWinnerBySex(char sex);
}
