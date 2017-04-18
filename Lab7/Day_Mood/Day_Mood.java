package Day_Mood;

public class Day_Mood {
	public static enum Day {
		Monday, Tuesday, Thursday, Wednesday, Friday, Saturday, Sunday, ERROR;
	}

	public enum Mood {
		SOSO, SAD, HAPPY;
	}

	private Day day;
	private Mood md;

	public Day_Mood(Day days) {
		day = days;
	}

	public void MoodOfDay() {
//		System.out.println(day);
		switch (day) {
		case Monday:
		case Friday:
			md = Mood.SAD;
			break;
		case Tuesday:
		case Wednesday:
		case Thursday:
			md = Mood.SOSO;
			break;
		case Saturday:
		case Sunday:
			md = Mood.HAPPY;
			break;
		case ERROR:
			System.out.println("INPUT AN INTEGER BETWEEN ONE AND SEVEN STANDS FOR THE DAY IN A WEEK");
			break;
		}
		System.out.println(md);

	}

}
