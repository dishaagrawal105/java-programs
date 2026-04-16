public class EmployeeProcedural {
    
    public static void main(String[] args) {
        int[] salaries = {35000, 55000, 47000, 43000};
        int maxSalary = salaries[0];

        for (int salary : salaries) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        System.out.println("Highest Salary : " + maxSalary);
    
}

}
