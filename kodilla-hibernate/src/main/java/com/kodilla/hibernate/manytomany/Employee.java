package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.retrieveEmployeesWithLastName",
        query = "FROM Employee WHERE lastname = :LASTNAME"
        )

@Entity
@Table(name = "employee")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "employee_id", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(
            name = "Join_company_employee",
            joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "employee_ID")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "company_ID")}
    )

    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
