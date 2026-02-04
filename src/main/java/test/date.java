package test;
import java.util.Scanner;
import java.time.LocalDate;
public class date {

    static boolean checkLeapUsingSplit(String input) {

        String[] parts = input.split("-");
        int year = Integer.parseInt(parts[2]);

        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0)
                        || (year % 400 == 0);

        return isLeapYear;
    }
}
//import java.time.format.DateTimeFormatter;
//
//public class date {
////
//
//    // Method 1: Using substring / year logic
//    static boolean checkLeapUsingString(String yearString) {
//        int year = Integer.parseInt(yearString);
//
//        boolean isLeapYear =
//                (year % 4 == 0 && year % 100 != 0)
//                        || (year % 400 == 0);
//
//        return isLeapYear;
//    }
//
//    // Method 2: Using LocalDate (as in your image)
//    static boolean checkLeapUsingLocalDate(String input) {
//
//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        LocalDate date = LocalDate.parse(input, formatter);
//
//        boolean isLeapYear = date.isLeapYear();
//
//        return isLeapYear;
//    }
//}

