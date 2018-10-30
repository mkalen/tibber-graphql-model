package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class ContactInfo implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public String email;
    public String mobile;

    public ContactInfo() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
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
        ContactInfo other = (ContactInfo) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (mobile == null) {
            if (other.mobile != null)
                return false;
        } else if (!mobile.equals(other.mobile))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ContactInfo [email=" + email + ", mobile=" + mobile + "]";
    }

}
