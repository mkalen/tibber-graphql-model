package no.tibber.api.model;

import java.io.Serializable;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class MeteringPointData implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public String consumptionEan;
    public String gridCompany;
    public String productionEan;
    public String energyTaxType;
    public String vatType;
    public Integer estimatedAnnualConsumption;

    public MeteringPointData() {
    }

    public String getConsumptionEan() {
        return consumptionEan;
    }

    public void setConsumptionEan(String consumptionEan) {
        this.consumptionEan = consumptionEan;
    }

    public String getGridCompany() {
        return gridCompany;
    }

    public void setGridCompany(String gridCompany) {
        this.gridCompany = gridCompany;
    }

    public String getProductionEan() {
        return productionEan;
    }

    public void setProductionEan(String productionEan) {
        this.productionEan = productionEan;
    }

    public String getEnergyTaxType() {
        return energyTaxType;
    }

    public void setEnergyTaxType(String energyTaxType) {
        this.energyTaxType = energyTaxType;
    }

    public String getVatType() {
        return vatType;
    }

    public void setVatType(String vatType) {
        this.vatType = vatType;
    }

    public Integer getEstimatedAnnualConsumption() {
        return estimatedAnnualConsumption;
    }

    public void setEstimatedAnnualConsumption(Integer estimatedAnnualConsumption) {
        this.estimatedAnnualConsumption = estimatedAnnualConsumption;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((consumptionEan == null) ? 0 : consumptionEan.hashCode());
        result = prime * result + ((energyTaxType == null) ? 0 : energyTaxType.hashCode());
        result = prime * result + ((estimatedAnnualConsumption == null) ? 0 : estimatedAnnualConsumption.hashCode());
        result = prime * result + ((gridCompany == null) ? 0 : gridCompany.hashCode());
        result = prime * result + ((productionEan == null) ? 0 : productionEan.hashCode());
        result = prime * result + ((vatType == null) ? 0 : vatType.hashCode());
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
        MeteringPointData other = (MeteringPointData) obj;
        if (consumptionEan == null) {
            if (other.consumptionEan != null)
                return false;
        } else if (!consumptionEan.equals(other.consumptionEan))
            return false;
        if (energyTaxType == null) {
            if (other.energyTaxType != null)
                return false;
        } else if (!energyTaxType.equals(other.energyTaxType))
            return false;
        if (estimatedAnnualConsumption == null) {
            if (other.estimatedAnnualConsumption != null)
                return false;
        } else if (!estimatedAnnualConsumption.equals(other.estimatedAnnualConsumption))
            return false;
        if (gridCompany == null) {
            if (other.gridCompany != null)
                return false;
        } else if (!gridCompany.equals(other.gridCompany))
            return false;
        if (productionEan == null) {
            if (other.productionEan != null)
                return false;
        } else if (!productionEan.equals(other.productionEan))
            return false;
        if (vatType == null) {
            if (other.vatType != null)
                return false;
        } else if (!vatType.equals(other.vatType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MeteringPointData [consumptionEan=" + consumptionEan + ", gridCompany=" + gridCompany
                + ", productionEan=" + productionEan + ", energyTaxType=" + energyTaxType + ", vatType=" + vatType
                + ", estimatedAnnualConsumption=" + estimatedAnnualConsumption + "]";
    }

}
