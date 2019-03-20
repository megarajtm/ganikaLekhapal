package com.gem.it;

import com.gem.it.traits.HasIdentity;
import com.gem.it.traits.Named;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Megaraj on 20-03-2019.
 */
@Entity
@Table(name = "it_owner")
public class Owner implements HasIdentity,Named {

    @Id
    private final String id;
    private final String name;
    private final int share;

    public Owner(final String id, final String name, final int share) {
        this.id = id;
        this.name = name;
        this.share = share;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    private int getShare() {
        return share;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", share=" + share +
                '}';
    }
}
