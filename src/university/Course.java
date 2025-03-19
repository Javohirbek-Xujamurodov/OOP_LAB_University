package university;

public class Course {
    private int code;
    private String title;
    private String teacherName;

    private Student[] students;

    private int studentCount = 0;

    public Course(int code,String title,String teacherName){
        this.code = code;
        this.title = title;
        this.teacherName = teacherName;
        students = new Student[100];
    }

    public int getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public void register(Student student){
        students[studentCount++] = student;
        student.addCourse(this);
    }

    public String listAttendees(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < studentCount;i++){
            Student student = students[i];
            sb.append(student.toString()).append('\n');
        }
        return sb.toString();
    }

    public String toString(){
        return code + " " + title + " " + teacherName;
    }
}