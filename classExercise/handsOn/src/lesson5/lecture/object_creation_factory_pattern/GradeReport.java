package lesson5.lecture.object_creation_factory_pattern;

public final class GradeReport {
    private String grade;
    private Student student;

    public GradeReport(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
    //No provide setter for grade, as it should not change after creation
    public void setStudent(Student student) {
        this.student = student;
    }
    public Student getStudent() {
        return student;
    }

}
