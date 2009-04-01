package org.openregistry.core.domain;

import java.io.Serializable;

/**
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public interface Department extends Serializable {

    Long getId();

    Type getDepartmentType();

    String getLocalCode();

    String getName();

    Campus getCampus();

    Department getParentDepartment();
}
