package lesson5.lecture.object_creation_factory_pattern;

public class StudentGradeReportFactory {
    public static IStudentGradeReport createStudentGradeReport(String studentName, String grade) {
        Student student = new Student(studentName);
        GradeReport gradeReport = new GradeReport(grade);
        //set the bidirectional relationship between Student and GradeReport
        student.setGradeReport(gradeReport);
        gradeReport.setStudent(student);

       return new StudentGradeReportImpl(student, gradeReport);
    }
}
