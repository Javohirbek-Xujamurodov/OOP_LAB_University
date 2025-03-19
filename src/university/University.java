package university;

public class University {
    private String name;
    private String rectorFirstName;
    private String rectorLastName;
    private Student[] students;
    private Course[] courses;

    private  int idStudentCounter = 10000;
    private	 int idCourseCounter = 10;

    public University(String name){
        this.name = name;
        students = new Student[1000];
        courses = new Course[50];
    }

    public String getName(){
        return name;
    }

    public void setRector(String first, String last){
        this.rectorFirstName = first;
        this.rectorLastName = last;
    }

    public String getRector(){
        return rectorFirstName + " " + rectorLastName ;
    }

    public int enroll(String first, String last){
        Student student = new Student(idStudentCounter,first,last);
        students[idStudentCounter - 10000] = student;
        idStudentCounter++;
        return student.getId();
    }

    public String student(int id){
        Student student = students[id - 10000];
        return student.toString();
    }

    public int activate(String title, String teacher){
        Course course = new Course(idCourseCounter,title,teacher);
        courses[idCourseCounter - 10] = course;
        idCourseCounter++;
        return course.getCode();
    }

    public String course(int code){
        Course course = courses[code - 10];
        return course.toString();
    }

    public void register(int studentID, int courseCode){
        Student student = students[studentID - 10000];
        Course course = courses[courseCode - 10];
        course.register(student);
    }

    public String listAttendees(int courseCode){
        Course course = courses[courseCode - 10];
        return course.listAttendees();
    }

    public String studyPlan(int studentID){
        Student student = students[studentID - 10000];
        return student.studyPlan();
    }
}