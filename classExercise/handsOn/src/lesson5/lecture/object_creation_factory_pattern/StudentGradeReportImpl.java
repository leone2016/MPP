package lesson5.lecture.object_creation_factory_pattern;

public class StudentGradeReportImpl implements IStudentGradeReport {
    private GradeReport report;
    private Student student;

    StudentGradeReportImpl(Student student, GradeReport report) {
        this.student = student;
        this.report = report;
    }


    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public GradeReport getGradeReport() {
        return report;
    }
}
