package com.example;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    @Size(min=6 , max=25)
    @NotBlank(message = "NAme should not be empty")

    private String employeeName;

    @Phone
    //pattern works only for the Strings. so changed from long to string .
    @Pattern(regexp = "[0-9()-\\.]*",message = "Mobile no should contain only integers.")
    private String mobileNo;
    @Past
    private Date dob;

    private List<String> skills = new ArrayList<>();

    @Valid
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Employee(String employeeName, String mobileNo, Date dob, List<String> skills, Address address) {
        this.employeeName = employeeName;
        this.mobileNo = mobileNo;
        this.dob = dob;
        this.skills = skills;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
