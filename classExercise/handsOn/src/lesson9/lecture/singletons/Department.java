package lesson9.lecture.singletons;

public enum Department {
    DEPARTMENT, HOUSE, OFFICE;
    public void displayDepartment() {
        System.out.println("Department ENUM: " + name());
    }
}

class MyDepartment{
     private static MyDepartment myDepartment ;

     public static MyDepartment getInstance(){
            if (myDepartment == null) {
                myDepartment = new MyDepartment();
            }
            return myDepartment;
     }

     public void displayMyDepartment() {
         System.out.println("My Department: "+ myDepartment);
     }
}

class TestSingleton {
    public static void main(String[] args) {
        MyDepartment instance1 = MyDepartment.getInstance();
        MyDepartment instance2 = MyDepartment.getInstance();

        System.out.println(instance1 == instance2); // Should print true, proving it's a singleton

        Department department = Department.HOUSE;
        department.displayDepartment();
    }
}