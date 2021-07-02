package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;


public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Klinik Natura Wahida");

        Company.Employee employee = company.new Employee();
        employee.setName("Amriati");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        System.out.println();

        Company oto = new Company();
        oto.setName("Otomotif");

        Company.Employee otoManager = oto.new Employee();
        otoManager.setName("Rangga");

        System.out.println(otoManager.getName());
        System.out.println(otoManager.getCompany());

    }
}
