package com.example;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
    @Size(min=6 , max=25)
    @Pattern(regexp = "[^0-9]*]")
    private String employeeName;
    private Long mobileNo;
    @Past
    private Date dob;
    private List<String> skills = new ArrayList<>();
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Employee(String employeeName, Long mobileNo, Date dob, List<String> skills, Address address) {
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

    public Employee(String employeeName, Long mobileNo, Date dob, List<String> skills) {
        this.employeeName = employeeName;
        this.mobileNo = mobileNo;
        this.dob = dob;
        this.skills = skills;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
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
