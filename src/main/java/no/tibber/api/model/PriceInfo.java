package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class PriceInfo implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public Price current;

    public PriceInfo() {
    }

    public Price getCurrent() {
        return current;
    }

    public void setCurrent(Price current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "PriceInfo [current=" + current + "]";
    }

}
