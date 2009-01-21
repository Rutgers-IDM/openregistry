package org.openregistry.service;

import org.openregistry.core.service.PersonService;
import org.openregistry.core.service.ServiceExecutionResult;
import org.openregistry.core.domain.Person;
import org.openregistry.core.domain.Role;
import org.openregistry.core.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default implementation of the {@link PersonService}.
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
@Service
public class DefaultPersonServiceImpl implements PersonService {

    @Autowired(required=true)
    private PersonRepository personRepository;

    public Person findPersonById(final Long id) {
        return this.personRepository.findByInternalId(id);
    }

    public ServiceExecutionResult validateAndSaveRoleForPerson(final Person person, final Role role) {
        return null;  // TODO implement
    }
}
