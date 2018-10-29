package no.tibber.api.model;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class LegalEntity {

    public String id;
    @GraphQLProperty(name = "isCompany")
    public boolean company;
    public String organizationNo;
    public String firstName;
    public String middleName;
    public String lastName;
    public String language;
    /*
    contactInfo {
      email
      mobile
    }
    */
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LegalEntity [id=" + id + ", company=" + company + ", organizationNo=" + organizationNo + ", firstName="
                + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", language=" + language
                + ", address=" + address + "]";
    }

}
