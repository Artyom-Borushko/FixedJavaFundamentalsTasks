package main.java.javaClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RunStudents {
    public static void main(String[] args) {
        Students[] eachStudent = new Students[8];
        eachStudent[0] = new Students(164300, "Borushko", "Artyom", "Borushko", new GregorianCalendar(1998, Calendar.SEPTEMBER,16), "Lenina 110A", 80295209206L, "law", 4, 6);
        eachStudent[1] = new Students(164321, "Minovich", "Iliya", "Andreevich", new GregorianCalendar(1998,Calendar.OCTOBER,21), "Promishlennaya 121", 80332225221L, "law", 4, 6);
        eachStudent[2] = new Students(164322, "Rozanov", "Danila", "Vasilievich", new GregorianCalendar(1975,Calendar.JANUARY,24), "Promishlennaya 121", 80332225221L, "geo", 3, 5);
        eachStudent[3] = new Students(164323, "Vasiliev", "Vasya", "Andreevich", new GregorianCalendar(2000,Calendar.JUNE,18), "Promishlennaya 121", 80332225221L, "fir", 1, 4);
        eachStudent[4] = new Students(164324, "Kyznecov", "Petya", "Timofeevich", new GregorianCalendar(1996,Calendar.MARCH,22), "Promishlennaya 121", 80332225221L, "geo", 2, 3);
        eachStudent[5] = new Students(164325, "Petrov", "Kirill", "Gavrilovich", new GregorianCalendar(1992, Calendar.DECEMBER,03), "Promishlennaya 121", 80332225221L, "fir", 3, 2);
        eachStudent[6] = new Students(164325, "Smolikov", "Dmitruy", "Petrovich", new GregorianCalendar(1990,Calendar.NOVEMBER,10), "Promishlennaya 121", 80332225221L, "fsc", 2, 1);
        eachStudent[7] = new Students(164327, "Kotikov", "Eugene", "Viktorovich", new GregorianCalendar(1988,Calendar.JULY,14), "Promishlennaya 121", 80332225221L, "fsc", 1, 7);
        GregorianCalendar specifiedDate = new GregorianCalendar(1990, 10, 5);
        specifiedDate.get(Calendar.YEAR);


        System.out.println("List of students of a given faculty: " + "\n");
        for (int i = 0; i < eachStudent.length; i++) {
            eachStudent[i].faculty("law");
        }

        System.out.println("\n" + "List of students for each faculty: " + "\n");
        for (int i = 0; i < eachStudent.length; i++) {
            eachStudent[i].listOfStudentsForEachFacultyAndCourse("law", 4);
        }

        System.out.println("\n" + "list of students who were born after a specified year" + "\n");
        for (int i = 0; i < eachStudent.length; i++) {
            eachStudent[i].dateComparator(specifiedDate);
        }

        System.out.println("\n" + "list of study groups you've specified" + "\n");
        for (int i = 0; i < eachStudent.length; i++) {
            eachStudent[i].groupList("LaW", 4, 6);
        }
    }
}


