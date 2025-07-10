package lession12.lecture.annotation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Annotation!");

        if(BadCode.class.isAnnotationPresent(BugReport.class)) {
            BugReport bugReport = BadCode.class.getAnnotation(BugReport.class);
            System.out.println("Bug Report:");
            System.out.println("Assigned To: " + bugReport.assignedTo());
            System.out.println("Severity: " + bugReport.severity());
        } else {
            System.out.println("No Bug Report annotation NO present on BadCode class.");
        }
    }
}
