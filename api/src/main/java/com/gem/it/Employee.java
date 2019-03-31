package com.gem.it;

import com.gem.it.traits.HasIdentity;
import com.gem.it.traits.Named;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Megaraj on 20-03-2019.
 */

@Entity
@Table(name = "it_employee")
public class Employee implements HasIdentity, Named {

    private final String id;
    private final String name;
    private final String designation;
    private final long dateOfJoining;
    private final long salary;

    public Employee(final String id, final String name, final String designation, final long dateOfJoining, final long salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public long getDateOfJoining() {
        return dateOfJoining;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", salary=" + salary +
                '}';
    }
}
