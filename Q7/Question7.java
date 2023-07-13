package Q7;

import java.time.LocalDate;
import java.time.Period;

public class Question7 {
	public static void main(String[] args) {
		String[] date = args[0].split(",");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);

		LocalDate dob = LocalDate.of(year, month, day);
		LocalDate currDate = LocalDate.now();
		Period period = Period.between(dob, currDate);
		System.out.println("Age is " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days.\n");

		while (year != currDate.getYear() + 1) {
			dob = LocalDate.of(year, month, day);
			System.out.println("Year: " + year + ", Day of the week: " + dob.getDayOfWeek().toString());
			year++;
		}

	}
}
