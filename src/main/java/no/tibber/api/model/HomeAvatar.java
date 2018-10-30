package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public enum HomeAvatar implements Serializable {

    APARTMENT,
    ROWHOUSE,
    FLOORHOUSE1,
    FLOORHOUSE2,
    FLOORHOUSE3,
    COTTAGE,
    CASTLE;

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

}
