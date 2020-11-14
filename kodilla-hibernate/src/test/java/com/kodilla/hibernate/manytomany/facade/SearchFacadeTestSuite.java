package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFindCompanies() {
        //given
        Company company1 = new Company("Company1");
        Company company2 = new Company("Company2");
        Company company3 = new Company("Company3");

        //when
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        List<Company> companies = searchFacade.findCompanies("pan");

        //then
        Assert.assertEquals(3, companies.size());
    }

    @Test
    public void testFindEmployee() {
        //given
        Employee employee1 = new Employee("Name1", "Lastname1");
        Employee employee2 = new Employee("Name2", "Lastname2");
        Employee employee3 = new Employee("Name3", "Lastname3");


        //when
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        List<Employee> employees = searchFacade.findEmployee("ame");

        //then
        Assert.assertEquals(3, employees.size());
    }

}