package org.openregistry.core.domain.jpa;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(JpaIdentifierTypeImpl.class)
public abstract class JpaIdentifierTypeImpl_ {

	public static volatile SingularAttribute<JpaIdentifierTypeImpl, Long> id;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, String> name;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, String> format;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, Boolean> privateIdentifier;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, Boolean> modifiable;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, Boolean> deleted;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, Boolean> notifiable;
	public static volatile SingularAttribute<JpaIdentifierTypeImpl, String> description;

}

