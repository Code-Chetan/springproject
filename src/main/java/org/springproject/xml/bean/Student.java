package org.springproject.xml.bean;

public class Student {
    private int studentId;
    private String studentName;

    public Student() {
        this.studentId = 12;
        this.studentName = "Mahesh";
    }

    public  void getStdentDetails(){
        System.out.println(this.studentId);
        System.out.println(this.studentName);
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
