package lab6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Person {

    private String Title;
    private String givenName;
    private String middleName;
    private String familyName;
    protected FullName name;
    private Date birthDate;
    private Gender gender;
    private String homeAddress;
    private String Phone;


    protected class FullName{
        String name = familyName + middleName + givenName;

    }

    enum Gender{
        M,F
    }
    ArrayList<Hospital> hospitals;

}
