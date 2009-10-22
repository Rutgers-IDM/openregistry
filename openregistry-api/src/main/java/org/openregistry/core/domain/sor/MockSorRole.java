package org.openregistry.core.domain.sor;

import org.openregistry.core.domain.internal.*;
import org.openregistry.core.domain.*;

import java.util.*;

/*
 * Created by IntelliJ IDEA.
 * User: rosey
 * Date: Oct 15, 2009
 * Time: 1:47:09 PM
 */

public class MockSorRole extends Entity implements SorRole{

	private Long id;

	private String sorId;

	private String sourceSorIdentifier;


	private Type terminationReason;

	public MockSorRole(Long id) {
		this.id=id;
	}

	public Long getId() {
		return id;
	}

	public String getSorId() {
		return sorId;
	}

	public void setSorId(String id) {
		this.sorId = id;
	}

	public String getSourceSorIdentifier() {
		return sourceSorIdentifier;
	}

	public void setSourceSorIdentifier(String sorIdentifier) {
		this.sourceSorIdentifier = sorIdentifier;
	}

	public void expireNow(Type terminationReason) {
	}

	public void expire(Type terminationReason, Date expirationDate) {
	}

	public int getPercentage() {
		return 0;
	}

	public void setPercentage(int percentage) {
	}

	public Type getPersonStatus() {
		return null;
	}

	public void setPersonStatus(Type personStatus) {
	}

	public RoleInfo getRoleInfo() {
		return null;
	}

	public SorSponsor setSponsor() {
		return null;
	}

	public SorSponsor getSponsor() {
		return null;
	}

	public Type getTerminationReason() {
		return terminationReason;
	}

	public void setTerminationReason(Type reason) {
		this.terminationReason = reason;
	}

	public List<Address> getAddresses() {
		return null;
	}

	public Address addAddress() {
		return null;
	}

	public Address removeAddressById(Long id) {
		return null;
	}

	public Address getAddress(long id) {
		return null;
	}

	public List<Phone> getPhones() {
		return null;
	}

	public List<EmailAddress> getEmailAddresses() {
		return null;
	}

	public EmailAddress removeEmailAddressById(Long id) {
		return null;
	}

	public EmailAddress addEmailAddress() {
		return null;
	}

	public Phone addPhone() {
		return null;
	}

	public Phone removePhoneById(Long id) {
		return null;
	}

	public List<Url> getUrls() {
		return null;
	}

	public Url addUrl() {
		return null;
	}

	public Url removeURLById(Long id) {
		return null;
	}

	public List<Leave> getLeaves() {
		return null;
	}

	public String getTitle() {
		return null;
	}

	public OrganizationalUnit getOrganizationalUnit() {
		return null;
	}

	public Campus getCampus() {
		return null;
	}

	public Type getAffiliationType() {
		return null;
	}

	public String getCode() {
		return null;
	}

	public String getDisplayableName() {
		return null;
	}

	public String getLocalCode() {
		return null;
	}

	public void setStart(Date date) {
	}

	public void setEnd(Date date) {
	}

	public Date getStart() {
		return null;
	}

	public Date getEnd() {
		return null;
	}
}