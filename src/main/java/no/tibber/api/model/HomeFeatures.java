package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class HomeFeatures implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public boolean realTimeConsumptionEnabled;

    public HomeFeatures() {
    }

    public boolean isRealTimeConsumptionEnabled() {
        return realTimeConsumptionEnabled;
    }

    public void setRealTimeConsumptionEnabled(boolean realTimeConsumptionEnabled) {
        this.realTimeConsumptionEnabled = realTimeConsumptionEnabled;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (realTimeConsumptionEnabled ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HomeFeatures other = (HomeFeatures) obj;
        if (realTimeConsumptionEnabled != other.realTimeConsumptionEnabled)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "HomeFeatures [realTimeConsumptionEnabled=" + realTimeConsumptionEnabled + "]";
    }

}
