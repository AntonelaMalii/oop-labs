package lab1ex23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);

        float media;
        float suma=0.0f;

        University univer[] = new University[3];
        for(int i = 0; i < 3; i++) {
            float s=0.0f;
            int c=0;
            float m;

            //Creating 3 separate universities
            univer[i] = new University();
            System.out.println("Input for university " + (i + 1));
            univer[i].createUniversity();
            System.out.println("Enter the nr of students in this university");
            int n=scanner2.nextInt();

            Student student[]=new Student[n];
            for(int j=0;j<n;j++){
                student[j]=new Student();
                System.out.println("Input for student "+(j+1));
                student[j].createStudent();
                s=s+student[j].getMark();
                c++;
            }
            m=s/c;
            System.out.println("Media universitatii este "+m);
            suma=suma+s;

        }
         media= suma/3;
        System.out.println("Media pe toate cele 3 universitati :"+media);


        }




}


