package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment4 {

    public static void printRange(LocalDate rangeStart, LocalDate rangeEnd, DateTimeFormatter formatter) {
        System.out.println(rangeStart.format(formatter) + " " + rangeEnd.format(formatter));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();

        for(int testCase=0 ; testCase<noOfTestCases ;testCase++) {
            String strFirstSignUpDate = sc.next();
            String strCurrentDate = sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate firstSignUpDate = LocalDate.parse(strFirstSignUpDate,formatter);
            LocalDate currentDate = LocalDate.parse(strCurrentDate,formatter);
            LocalDate firstAnniversaryStartDate = firstSignUpDate.plusYears(1).minusDays(30);

            // Any date given as current date before first anniversary should print "No Range"
            if(currentDate.isBefore(firstAnniversaryStartDate)){
                System.out.println("No Range");
                continue;
            }
            LocalDate currentYearAnniversary = LocalDate.of(currentDate.getYear(),firstSignUpDate.getMonth(),firstSignUpDate.getDayOfMonth());
            LocalDate currentAnniversaryStartDate = currentYearAnniversary.minusDays(30);
            LocalDate currentAnniversaryEndDate = currentYearAnniversary.plusDays(30);
            LocalDate previousAnniversary = currentYearAnniversary.minusYears(1);
            LocalDate previousAnniversaryStartDate = previousAnniversary.minusDays(30);
            LocalDate previousAnniversaryEndDate = previousAnniversary.plusDays(30);

            // Check if the current date falls in current year's anniversary date ranges
            // else print the nearest anniversary date ranges
            if (currentDate.isEqual(currentAnniversaryStartDate) || currentDate.isAfter(currentAnniversaryStartDate)) {
                if (currentDate.isEqual(currentAnniversaryEndDate) || currentDate.isBefore(currentAnniversaryEndDate)) {
                    printRange(currentAnniversaryStartDate, currentDate, formatter);
                }
                else {
                    printRange(currentAnniversaryStartDate, currentAnniversaryEndDate, formatter);
                }
            }
            else {
                printRange(previousAnniversaryStartDate, previousAnniversaryEndDate, formatter);
            }


        }
    }
}