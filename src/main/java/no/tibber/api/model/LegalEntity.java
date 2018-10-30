package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class LegalEntity implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public String id;
    @GraphQLProperty(name = "isCompany")
    public boolean company;
    public String organizationNo;
    public String firstName;
    public String middleName;
    public String lastName;
    public String language;
    public ContactInfo contactInfo;
    public Address address;

    public LegalEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCompany() {
        return company;
    }

    public void setCompany(boolean company) {
        this.company = company;
    }

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + (company ? 1231 : 1237);
        result = prime * result + ((contactInfo == null) ? 0 : contactInfo.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
        result = prime * result + ((organizationNo == null) ? 0 : organizationNo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LegalEntity other = (LegalEntity) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (company != other.company)
            return false;
        if (contactInfo == null) {
            if (other.contactInfo != null)
                return false;
        } else if (!contactInfo.equals(other.contactInfo))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (language == null) {
            if (other.language != null)
                return false;
        } else if (!language.equals(other.language))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (middleName == null) {
            if (other.middleName != null)
                return false;
        } else if (!middleName.equals(other.middleName))
            return false;
        if (organizationNo == null) {
            if (other.organizationNo != null)
                return false;
        } else if (!organizationNo.equals(other.organizationNo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "LegalEntity [id=" + id + ", company=" + company + ", organizationNo=" + organizationNo + ", firstName="
                + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", language=" + language
                + ", contactInfo=" + contactInfo + ", address=" + address + "]";
    }

}
