package model;

public class Test {

    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "EC001","KN","823456789V","Colombo");
        Employee emp2 = new Employee("E002", "EC002","PM","923456789V","Kadawatha");

        boolean result1 = emp1.equals(emp2);
        System.out.println("EMP1 Equals EMP2: "+result1);

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("==========================");

        emp2.setEmpId("E001");
        emp2.setEmpCode("EC001");
        boolean result2 = emp1.equals(emp2);
        System.out.println("EMP1 Equals EMP2: "+result2);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
