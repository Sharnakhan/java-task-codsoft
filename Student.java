public class Student {
    private String name;
    private int rollnumber;
    private String grade;

    public  Student (String name, int rollnumber, String grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }
    public String getname(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getrollnumber() {
        return rollnumber;
    }
    public void setRollNumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    //override
    public String toString(){
        return "Roll Number: " + rollnumber + ", Name: " + name + ",Grade: " + grade;
    }
}
