package org.openregistry.core.domain.jpa;

import org.openregistry.core.domain.internal.Entity;
import org.openregistry.core.domain.Person;
import org.openregistry.core.domain.Role;
import org.openregistry.core.domain.PersonIdentifiers;

import java.util.Collection;

/**
 * Person entity mapped to a persistence store with JPA annotations.
 *
 * @since 1.0
 *        TODO: add all the properties, dependencies and map to OR DB with JPA annotations
 */
public class JpaPerson extends Entity implements Person {

    public String getFirstName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getLastName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getMiddleName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getFullName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<Role> getRoles() {
        return null;
    }

     public void addRole(Role role) {

    }

    public PersonIdentifiers getIdentifiers() {
        return null;
    }
}
