package lesson05.lecture.factorymethods6.studreport;

/** Typical use: Loading data from database into class model */
final public class StudentGradeReportFactory {
	private StudentGradeReportFactory(){}
	
	public static IStudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name);
		g.setStudent(st);
		st.setReport(g);
		return new StudentAndReportImpl(st, g);
	}
}
