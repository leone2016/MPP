package lession12.lecture.annotation;

@BugReport(assignedTo = "Jane", severity = 1)
public class BadCode {
    public int add(int a, int b) {
        return a + b;
    }

}