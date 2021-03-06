package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum PriceResolution implements Serializable {

    HOURLY,
    DAILY;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
