package lesson05.lecture.factorymethods6.studreport;

//Immutable relative to its package studreport
final class StudentAndReportImpl implements IStudentAndReport {
	private Student student;
	private GradeReport report;
	StudentAndReportImpl(Student s, GradeReport g) {
		student = s;
		report = g;
	}
	public Student getStudent() {
		return student;
	}
	public GradeReport getReport() {
		return report;
	}
}
