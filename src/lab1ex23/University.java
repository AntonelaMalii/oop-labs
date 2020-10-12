package lab1ex23;

import java.util.Scanner;

public class University {
    private String name;
    private int foundationYear;
    private Student[] student;


    Scanner scanner1 = new Scanner(System.in);


    public void createUniversity() {
        System.out.println("Enter the name of the university:");
        this.name = scanner1.nextLine();
        System.out.println("Enter the year of foundation of the university:");
        this.foundationYear = scanner1.nextInt();

    }







}
