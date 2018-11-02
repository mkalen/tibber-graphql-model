package no.tibber.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum Status implements Serializable {

    @JsonProperty("running")
    RUNNING;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
