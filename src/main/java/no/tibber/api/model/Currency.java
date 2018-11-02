package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public enum Currency implements Serializable {

    NOK,
    SEK;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
