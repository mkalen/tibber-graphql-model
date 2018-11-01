package no.tibber.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public enum Status implements Serializable {

    @JsonProperty("running")
    RUNNING;

    private static final long serialVersionUID = 1L;

}
