package practice;

import java.util.List;

public interface ISolutions {

	public int getNumberOfPeople();

	public int getNumberOfMembersByCategory(String category);

	public float getAverageAge();

	public List<Person> getNumberByCategory(String age);

	public Person getWinnerBySex(char sex);
}
