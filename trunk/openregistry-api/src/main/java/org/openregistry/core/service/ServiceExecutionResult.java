package org.openregistry.core.service;

import org.openregistry.core.service.reconciliation.ReconciliationResult;

import java.util.Date;
import java.util.List;

/**
 * A container encapsulating results of any number of different Open Registry public service API invocations.
 * Such results are validation errors if any, time stamp of the service invocation, service name being executed.
 *
 * @since 1.0
 */
public interface ServiceExecutionResult {

    /**
     * Get an instant in time when a particular service, represented by this result, has been executed
     * @return Date representing a service execution date and time
     */
    Date getExecutionDate();

    /**
     * Get a symbolic name for an executed service represented by this result
     * @return a string token representing a symbolic name of a service that has been executed
     */
    String getServiceName();

    /**
     * Determines whether the action succeeded or not.  If it did not, then either validation errors or reconciliation
     * object should be filled in.
     * @return true if it succeeded, false otherwise.
     */
    boolean succeeded();

    /**
     * The original object we were working with.
     *
     * @return the original object.  This CANNOT be null.
     */
    Object getTargetObject();

    /**
     * The list of field or object level validations.
     *
     * @return the list of validations.  CANNOT be null.  CAN be empty.
     */
    List<ValidationError> getValidationErrors();

    /**
     * The result of any reconciliation process.
     * @return the result of any reconciliation.  CAN be NULL.
     */
    ReconciliationResult getReconciliationResult();
}
