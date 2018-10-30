package no.tibber.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum AccountType implements Serializable {

    @JsonProperty("customer")
    CUSTOMER;

    private static final long serialVersionUID = 1L;

}
