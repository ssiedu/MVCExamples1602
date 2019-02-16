package mypkg;
public class Student {
    private int rollNo;
    private String name;
    private String address;
    private String course;
    private int sem;
    private String password;

    public Student(int rollNo, String name, String address, String course, int sem, String password) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.course = course;
        this.sem = sem;
        this.password = password;
    }

    
    public Student() {
    }
    
    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", course=" + course + ", sem=" + sem + '}';
    }
    
}
