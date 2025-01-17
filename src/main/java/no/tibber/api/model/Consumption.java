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

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
@Entity
@Table(name="consumption")
public class Consumption implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 4L;

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
    public Unit consumptionUnit;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "currency_id", columnDefinition = "INT2")
    public Currency currency;

    @Column(name = "unit_cost")
    public Float cost;

    @Deprecated
    @Column(name = "total_cost")
    public Float totalCost;

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

    public Unit getConsumptionUnit() {
        return consumptionUnit;
    }

    public void setConsumptionUnit(Unit consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    @Deprecated
    public Float getTotalCost() {
        return totalCost;
    }

    @Deprecated
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
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
        Consumption other = (Consumption) obj;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Consumption [from=" + from + ", to=" + to + ", unitPrice=" + unitPrice + ", unitPriceVAT="
                + unitPriceVAT + ", consumption=" + consumption + ", consumptionUnit=" + consumptionUnit
                + ", totalCost=" + totalCost + ", cost=" + cost + ", currency=" + currency + "]";
    }

}
