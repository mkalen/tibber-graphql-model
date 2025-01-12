package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public enum EnergyResolution implements Serializable {

    HOURLY,
    DAILY,
    WEEKLY,
    MONTHLY,
    ANNUAL;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
