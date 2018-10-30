package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum HeatingSource implements Serializable {

    AIR2AIR_HEATPUMP,
    ELECTRICITY,
    GROUND,
    DISTRICT_HEATING,
    ELECTRIC_BOILER,
    AIR2WATER_HEATPUMP,
    OTHER;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
