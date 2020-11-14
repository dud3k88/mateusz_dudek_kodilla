package com.kodilla.hibernate.manytomany;

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
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    public void testRetrieveEmployeLastName() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee markusLang = new Employee("Markus", "Lang");
        Employee bobDylan = new Employee("Bob", "Dylan");
        Employee lindaSmith = new Employee("Linda", "Smith");

        employeeDao.save(johnSmith);
        employeeDao.save(markusLang);
        employeeDao.save(bobDylan);
        employeeDao.save(lindaSmith);


        List<Employee> employeesWithLastNameIsSmith = employeeDao.retrieveEmployeesWithLastName("Smith");
        List<Employee> employeesWithLastNameIsLang = employeeDao.retrieveEmployeesWithLastName("Lang");


            Assert.assertEquals(3, employeesWithLastNameIsLang.size());
            Assert.assertEquals(2, employeesWithLastNameIsSmith.size());

            employeeDao.delete(johnSmith);
            employeeDao.delete(markusLang);
            employeeDao.delete(bobDylan);
            employeeDao.delete(lindaSmith);
    }

    @Test
    public void testRetrieveCompaniesWithFirstThreeChars() {
        Company softwareCompany = new Company("Software Company");
        Company bigBuilder = new Company("Big Builder");
        Company funnyMonkey = new Company("Funny Monkey");
        Company softwareService = new Company("Software Service");

        companyDao.save(softwareCompany);
        companyDao.save(bigBuilder);
        companyDao.save(funnyMonkey);
        companyDao.save(softwareService);

        List<Company> companiesStartingWithSof = companyDao.retrieveCompanyWithFirstThreeChars("Sof");
        List<Company> companiesStartingWithFun = companyDao.retrieveCompanyWithFirstThreeChars("Fun");

        Assert.assertEquals(2, companiesStartingWithSof.size());
        Assert.assertEquals(1, companiesStartingWithFun.size());

        companyDao.delete(softwareCompany);
        companyDao.delete(bigBuilder);
        companyDao.delete(funnyMonkey);
        companyDao.delete(softwareService);


    }
}