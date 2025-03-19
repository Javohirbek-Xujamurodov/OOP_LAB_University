package university;

public class Student {
    private int id;
    private String firtName;
    private String lastName;

    private Course[] courses;

    private int courseCount = 0;

    public Student(int id, String firtName, String lastName) {
        this.id = id;
        this.firtName = firtName;
        this.lastName = lastName;
        courses = new Course[25];
    }

    public int getId(){
        return id;
    }

    public String getFirtName(){
        return firtName;
    }

    public String getLastName(){
        return lastName;
    }

    public void addCourse(Course course){
        courses[courseCount++] = course;
    }

    public String studyPlan(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < courseCount;i++){
            Course course = courses[i];
            sb.append(course.toString()).append('\n');
        }
        return sb.toString();
    }

    public String toString(){
        return id + " " + firtName + " " + lastName;
    }
}