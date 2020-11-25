package lab6;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    private String id;
    private FullName name;
    private Gender gender;
    private Date birthDate;
    private Integer age;
    private Date accepted;
    private String sickness;
    private String[] prescription;
    private String[] allergies;
    private String[] specialReqs;
    ArrayList<OperationsStaff> operationsStaff;

}
