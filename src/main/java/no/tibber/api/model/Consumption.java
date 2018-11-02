package no.tibber.api.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
@Entity
@Table(name="consumption")
public class Consumption implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 2L;

    @Id
    @Column(name ="\"from\"")
    public OffsetDateTime from;

    @Id
    @Column(name ="\"to\"")
    public OffsetDateTime to;

    @Column(name = "unit_price")
    public Float unitPrice;

    @Column(name = "unit_price_vat")
    public Float unitPriceVAT;

    public Float consumption;

    @Enumerated(EnumType.ORDINAL)
    @Column(name ="consumption_unit_id", columnDefinition = "INT2")
    public ConsumptionUnit consumptionUnit;

    @Column(name = "total_cost")
    public Float totalCost;

    @Column(name = "unit_cost")
    public Float unitCost;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "currency_id", columnDefinition = "INT2")
    public Currency currency;

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

    public ConsumptionUnit getConsumptionUnit() {
        return consumptionUnit;
    }

    public void setConsumptionUnit(ConsumptionUnit consumptionUnit) {
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Consumption [from=" + from + ", to=" + to + ", unitPrice=" + unitPrice + ", unitPriceVAT="
                + unitPriceVAT + ", consumption=" + consumption + ", consumptionUnit=" + consumptionUnit
                + ", totalCost=" + totalCost + ", unitCost=" + unitCost + ", currency=" + currency + "]";
    }

}
