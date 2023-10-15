public class Main {

    public static void main (String[] args) {
        System.out.println("Количество сотрудиков:");
       /*
       printAllEmploee() - получить список всех сотрудников
       findEmploee(String fullName) - поиск сотрудников по Ф.И.О
       findSalary(int salary) - поиск сотрудника по зарплате
       findMaxSalary() - поиск максимальной зарплаты всех сотрудников
       findMinSalary() - поиск минимальной зарплаты всех сотрудников
       int amountOfCosts() - сумма затрат на всех сотрудников
       averageSalary() - средняя зарплата
       salaryIndexation(int indexationPercentage) - индексация ЗП у всех сотрудников
       findDepartmentEmployees(int department) - получить сотрудников в отделе
       findMaxSalaryInDepartment(int department) - поиск максимальной ЗП в отделе
       findMinSalaryInDepartment(int department) - поиск минимальной ЗП в отделе
       amountOfCostsInDepartment(int department) - сумма затрат на ЗП в отделе
       averageSalaryDepartment(int department) - средняя ЗП в отделе
       salaryIndexationInDepartment(int indexationPercentage, int department) - индексация ЗП в отделе, где int indexationPercentage
       процент прибавки, int department - номер отдела.
       salaryRangeIsSmaller(int salary) - поиск сотрудников с зарплатой меньше числа salary
       salaryRangeIsLarger(int salary) - поиск сотрудников с зарплатой больше числа salary
        */

        EmployeeBook employeeBook = EmployeeBook.getEmployeeBook();
        System.out.println(employeeBook.getCountId());
        System.out.println("");
        System.out.println("Информация из книги сотрудников:");
        employeeBook.printAllEmploee();
        System.out.println("Информация по сотруднику(отдел/ЗП):");
        employeeBook.findEmploee("Сергеев Сергей Сергеевич");
        System.out.println("");
        System.out.println("Вывести максимальную и минимальную ЗП в месяц:");
        employeeBook.findSalary(employeeBook.findMaxSalary());
        employeeBook.findSalary(employeeBook.findMinSalary());
        System.out.println("");
        System.out.println("Сумма затрат на ЗП в месяц: "+ employeeBook.amountOfCosts());
        System.out.println("Средняя зарплата: "+ employeeBook.averageSalary());
        System.out.println("Максимальная и минимальная ЗП по отделу:");
        employeeBook.findMaxSalaryInDepartment(2);
        employeeBook.findMinSalaryInDepartment(2);
        System.out.println("");
        System.out.println("Сумма затрат на ЗП по отделу "+ employeeBook.amountOfCostsInDepartment(3));
        System.out.println("Средняя зарплата по отделу: "+ employeeBook.averageSalaryDepartment(5));
        System.out.println("");
        System.out.println("Индексация ЗП по отделу:");
        employeeBook.salaryIndexationInDepartment(9, 2);
        System.out.println("");
        employeeBook.salaryIndexation(3);
        employeeBook.printAllEmploee();
        System.out.println("");
        employeeBook.findDepartmentEmployees(2);
        System.out.println("");
        employeeBook.salaryRangeIsSmaller(70_000);
        System.out.println("");
        employeeBook.salaryRangeIsLarger(70_000);
    }
}
