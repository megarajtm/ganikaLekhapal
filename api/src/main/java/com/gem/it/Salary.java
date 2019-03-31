package com.gem.it;

import com.gem.it.traits.HasIdentity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Megaraj on 21-03-2019.
 */
@Entity
public class Salary implements HasIdentity {

    @Id
    private final String id;
    private final String empName;

    public Salary(final String id, final String empName) {
        this.id = id;
        this.empName = empName;
    }

    public String getId() {
        return null;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id='" + id + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
