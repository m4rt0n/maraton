package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MaratonInfo {
	private Duration swim;
	private Duration breakOne;
	private Duration cycle;
	private Duration breakTwo;
	private Duration run;

	public Duration getSwim() {
		return swim;
	}

	public void setSwim(Duration swim) {
		this.swim = swim;
	}

	public Duration getBreakOne() {
		return breakOne;
	}

	public void setBreakOne(Duration breakOne) {
		this.breakOne = breakOne;
	}

	public Duration getCycle() {
		return cycle;
	}

	public void setCycle(Duration cycle) {
		this.cycle = cycle;
	}

	public Duration getBreakTwo() {
		return breakTwo;
	}

	public void setBreakTwo(Duration breakTwo) {
		this.breakTwo = breakTwo;
	}

	public Duration getRun() {
		return run;
	}

	public void setRun(Duration run) {
		this.run = run;
	}

	public Duration getTotal() {
		Duration total = Duration.ZERO;
		List<Duration> dList = new ArrayList<>();
		dList.add(getSwim());
		dList.add(getBreakOne());
		dList.add(getCycle());
		dList.add(getBreakTwo());
		dList.add(getBreakTwo());

		for (int i = 0; i < dList.size(); i++) {
			total = total.plus(dList.get(i));
		}
		return total;
	}

}
