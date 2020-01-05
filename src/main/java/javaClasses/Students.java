package main.java.javaClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Students {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private GregorianCalendar dateOfBirth;
    private String address;
    private long telephone;
    private String faculty;
    private int year;
    private int group;

    public Students(int id, String surname, String name, String middleName, GregorianCalendar dateOfBirth, String address, long telephone, String faculty, int year, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    public Students() {
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public long getTelephone() {
        return telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    public int getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "students{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth=" + dateOfBirth.get(Calendar.YEAR) + "." + dateOfBirth.get(Calendar.MONTH) + "." + dateOfBirth.get(Calendar.DAY_OF_MONTH) +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", faculty='" + faculty + '\'' +
                ", year=" + year +
                ", group=" + group +
                '}';
    }

    public void faculty(String faculty) {
        if (this.getFaculty().toUpperCase().equals(faculty.toUpperCase())) {
            System.out.println(toString());
        }
    }

    public void listOfStudentsForEachFacultyAndCourse(String faculty, int year) {
        if (this.getFaculty().toUpperCase().equals(faculty.toUpperCase()) && this.getYear() == year) {
            System.out.println(toString());
        }
    }

    public void dateComparator(GregorianCalendar specifiedDate) {
        if ((dateOfBirth.get(Calendar.YEAR)) > (specifiedDate.get(Calendar.YEAR))) {
            System.out.println(toString());
        }
    }

    public void groupList (String faculty, int year, int group) {
        if (this.getFaculty().toLowerCase().equals(faculty.toLowerCase()) && getYear() == year && getGroup() == group) {
            System.out.println(toString());
        }
    }
}