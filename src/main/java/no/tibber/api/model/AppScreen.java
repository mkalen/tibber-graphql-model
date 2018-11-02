package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public enum AppScreen implements Serializable {

    HOME,
    REPORTS,
    CONSUMPTION,
    COMPARISON,
    DISAGGREGATION,
    HOME_PROFILE,
    CUSTOMER_PROFILE,
    METER_READING,
    NOTIFICATIONS,
    INVOICES;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
