package no.tibber.api.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class Consumption implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public OffsetDateTime from;
    public OffsetDateTime to;
    public Float unitPrice;
    public Float unitPriceVAT;
    public Float consumption;
    public String consumptionUnit;
    public Float totalCost;
    public Float unitCost;
    public String currency;

    public Consumption() {
    }

    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getUnitPriceVAT() {
        return unitPriceVAT;
    }

    public void setUnitPriceVAT(Float unitPriceVAT) {
        this.unitPriceVAT = unitPriceVAT;
    }

    public Float getConsumption() {
        return consumption;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public String getConsumptionUnit() {
        return consumptionUnit;
    }

    public void setConsumptionUnit(String consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Consumption [from=" + from + ", to=" + to + ", unitPrice=" + unitPrice + ", unitPriceVAT="
                + unitPriceVAT + ", consumption=" + consumption + ", consumptionUnit=" + consumptionUnit
                + ", totalCost=" + totalCost + ", unitCost=" + unitCost + ", currency=" + currency + "]";
    }

}
