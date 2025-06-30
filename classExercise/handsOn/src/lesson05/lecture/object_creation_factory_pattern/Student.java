package lesson05.lecture.object_creation_factory_pattern;

/**
 * final means that this class cannot be subclassed. (NO inheritance)
 */
public final class Student {
    private String name;
    private GradeReport report;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    void setGradeReport(GradeReport report) {
        this.report = report;
    }
    public GradeReport getGradeReport() {
        return report;
    }
}
