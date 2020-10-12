package lab1ex23;

import java.util.Scanner;

public class Student {
    private String name;
    private  int age;
    private  float mark;

    Scanner scanner = new Scanner(System.in);

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public float getMark(){
        return this.mark;
    }

    public void createStudent (){
        System.out.println("Enter the name of this student");
        this.name = scanner.nextLine();
        System.out.println("Enter the age of this student");
        this.age = scanner.nextInt();
        System.out.println("Enter the mark of this student");
        this.mark = scanner.nextFloat();
    }




}
