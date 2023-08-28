
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 


class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getrollnumber() == rollNumber);
    }
     public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getrollnumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name; " + student.getname());
            System.out.println("Rollnumber; " + student.getrollnumber());
             System.out.println("Grade; " + student.getGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) 
        {
            System.out.print("1. Add Student\n");
            System.out.print("2. Remove Student\n");
            System.out.print("3. Search Student\n");
            System.out.print("4. Display All Students\n");
            System.out.print("5. Exit\n");
            System.out.print("Select your type: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    scanner.nextLine(); 
                    
                    System.out.print("Rollnumber: ");
                    int rollNumber = scanner.nextInt();
                    
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    
                    Student newStudent = new Student(name, rollNumber, grade);
                    
                    sms.addStudent(newStudent);
                    break;
                    
                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int rollNumToRemove = scanner.nextInt();
                    sms.removeStudent(rollNumToRemove);
                    break;
                    
                case 3:
                    System.out.print("Enter Roll Number  to search: ");
                    int rollNumToSearch = scanner.nextInt();
                    
                    Student searchedStudent = sms.searchStudent(rollNumToSearch);
                    if (searchedStudent != null) {
                        System.out.println("Student found: " + searchedStudent);
                           
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;
                    
                case 4:
                    sms.displayAllStudents();
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
 }
