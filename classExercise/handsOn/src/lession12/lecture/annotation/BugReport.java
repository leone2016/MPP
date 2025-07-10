package lession12.lecture.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)//for classes, interfaces, enums
public @interface BugReport {
    String assignedTo() default "unassigned";
    int severity() default 1; // 1: low, 2: medium, 3: high
}
