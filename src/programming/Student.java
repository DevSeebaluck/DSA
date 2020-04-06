/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.util.Date;
/**
 *
 * @author seebaluck
 */
public class Student {
    private String studentID;
    private String name;
    private int numberOfSubjects;
    private int marksForEachSubject;
    private Date dateOfEnrolment;
    private String studentcategory;
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getname(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }
    
    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public int getMarksForEachSubject() {
        return marksForEachSubject;
    }

    public void setMarksForEachSubject(int marksForEachSubject) {
        this.marksForEachSubject = marksForEachSubject;
    }

    public Date getDateOfEnrolment() {
        return dateOfEnrolment;
    }

    public void setDateOfEnrolment(Date dateOfEnrolment) {
        this.dateOfEnrolment = dateOfEnrolment;
    }

    public String getStudentcategory() {
        return studentcategory;
    }

    public void setStudentcategory(String studentcategory) {
        this.studentcategory = studentcategory;
    }

}
