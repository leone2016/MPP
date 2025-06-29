package lesson5.lecture.object_creation_factory_pattern.ext;

import lesson5.lecture.object_creation_factory_pattern.IStudentGradeReport;
import lesson5.lecture.object_creation_factory_pattern.StudentGradeReportFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IStudentGradeReport> gradeReports = new ArrayList<>();

        IStudentGradeReport report = StudentGradeReportFactory.createStudentGradeReport("John Doe", "B+");
        gradeReports.add(report);

        report = StudentGradeReportFactory.createStudentGradeReport("Leonardo Medina", "A+");
        gradeReports.add(report);

        report = StudentGradeReportFactory.createStudentGradeReport("Jim", "A");
        gradeReports.add(report);


        gradeReports.sort(
                (s1, s2)->
                        s1.getGradeReport().getGrade().compareTo(s2.getGradeReport().getGrade())
        );
      /*  gradeReports.sort(new Comparator<IStudentGradeReport>() {
            List<String> grades = List.of("A+", "A", "B+", "B", "C", "D", "F");
            @Override
            public int compare(IStudentGradeReport o1, IStudentGradeReport o2) {
                int index1 = grades.indexOf(o1.getGradeReport().getGrade());
                int index2 = grades.indexOf(o2.getGradeReport().getGrade());
                return Integer.compare(index1, index2);
            }
        });*/

        gradeReports.sort((o1, o2) -> {
            List<String> grades = List.of("A+", "A", "B+", "B", "C", "D", "F");
            int index1 = grades.indexOf(o1.getGradeReport().getGrade());
            int index2 = grades.indexOf(o2.getGradeReport().getGrade());
            return Integer.compare(index1, index2);
        });


        for (IStudentGradeReport gradeReport : gradeReports) {
            System.out.println(gradeReport.getStudent().getName() + " - " + gradeReport.getGradeReport().getGrade());
        }

    }
}
