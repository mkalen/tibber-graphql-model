package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class HomeConsumptionEdge implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public String cursor;
    public Consumption node;

    public HomeConsumptionEdge() {
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Consumption getNode() {
        return node;
    }

    public void setNode(Consumption node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "HomeConsumptionEdge [cursor=" + cursor + ", node=" + node + "]";
    }

}
