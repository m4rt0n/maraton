package practice;

public class Person {

	private PersonalData pd;
	private MaratonInfo mi;

	public Person(PersonalData pd, MaratonInfo mi) {
		this.pd = pd;
		this.mi = mi;
	}

	public PersonalData getPersonalData() {
		return pd;
	}

	public MaratonInfo getMaratonInfo() {
		return mi;
	}
}
