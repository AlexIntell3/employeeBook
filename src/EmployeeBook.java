public class EmployeeBook {
    private final Employee[] employees;
    private int countId;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, int salary) {
        if (countId >= employees.length) {
            throw new ArrayIndexOutOfBoundsException("Штат компании укомплектован");
    }
    Employee newEmployee = new Employee(fullName, department, salary);
    employees[countId++] = newEmployee;
}

    public void printAllEmploee() {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public void findEmploee(String fullName) {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getFullName().equals(fullName)) {
                System.out.println(employee.getFullName() + " / " + employee.getDepartment() + " / " + employee.getSalary());
            }
        }
    }

    public void findSalary(int salary) {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == salary) {
                System.out.println(employee.getFullName() + " / " + employee.getDepartment() + " / " + salary);
            }
        }
    }

    public int findMaxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public int findMinSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() <= minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public int amountOfCosts() {
        int summ = 0;
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            summ += employee.getSalary();
        }
        return summ;
    }

    public double averageSalary() {
        return (double) amountOfCosts() / employees.length;
    }

    public int getCountId() {
        return countId;
    }

    public void salaryIndexation(int indexationPercentage) {
        double percentage = 1 + ((double) indexationPercentage / 100);
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            employee.setSalary((int) (employee.getSalary() * percentage));
        }
    }

    public void findDepartmentEmployees(int department) {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " / " + employee.getSalary());
            }
        }
    }

    public void findMaxSalaryInDepartment(int department) {
        int max = 0;
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                if (employee.getSalary() >= max) {
                    max = employee.getSalary();
                }
            }
        }
        findSalary(max);
    }

    public void findMinSalaryInDepartment(int department) {
        int min = employees[0].getSalary();
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                if (employee.getSalary() <= min) {
                    min = employee.getSalary();
                }
            }
        }
        findSalary(min);
    }

    public int amountOfCostsInDepartment(int department) {
        int summ = 0;
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                summ += employee.getSalary();
            }
        }
        return summ;
    }

    private int countDepartment(int department) {
        int count = 0;
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                count++;
            }
        }
        return count;
    }

    public double averageSalaryDepartment(int department) {
        return (double) amountOfCostsInDepartment(department) / countDepartment(department);
    }

    public void salaryIndexationInDepartment(int indexationPercentage, int department) {
        double percentage = 1 + ((double) indexationPercentage / 100);
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percentage));
            }
        }
    }

    public void salaryRangeIsSmaller(int salary) {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (salary >= employee.getSalary()) {
                System.out.println(i + 1 + " Ф.И.О " + employee.getFullName() + " / " + employee.getSalary());
            }
        }
    }

    public void salaryRangeIsLarger(int salary) {
        for (int i = 0; i < countId; i++) {
            Employee employee = employees[i];
            if (salary < employee.getSalary()) {
                System.out.println(i + 1 + " Ф.И.О " + employee.getFullName() + " / " + employee.getSalary());
            }
        }
    }
    public static EmployeeBook getEmployeeBook() {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Алексеев Алексей Алексеевич", 1, 97_000);
        employeeBook.addEmployee("Петров Петр Петрович", 2, 78_000);
        employeeBook.addEmployee("Смирнова Марина Вительевна", 4, 79_000);
        employeeBook.addEmployee("Иванов Иван Иванович", 1, 65_000);
        employeeBook.addEmployee("Константинов Константин Константинович", 5, 95_000);
        employeeBook.addEmployee("Сергеев Сергей Сергеевич", 3, 75_000);
        employeeBook.addEmployee("Милютина Виктория Геннадьевна", 5, 100_000);
        employeeBook.addEmployee("Андреева Валентина Степановна", 4, 84_000);
        employeeBook.addEmployee("Сидоров Сидор Сидорович", 3, 54_000);
        employeeBook.addEmployee("Васильева Анна Сергеевна", 2, 85_000);
        return employeeBook;
    }
}