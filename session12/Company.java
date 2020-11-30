package session12;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> listOfEmployees;

    public Company(String[] names, String[] addresses, int[] empNos, double[] salaries) {
        listOfEmployees = new ArrayList<Employee>();

        for (int i = 0; i < names.length; i++) {
            listOfEmployees.add(new Employee(names[i], addresses[i], empNos[i], salaries[i]));
        }
    }
}
