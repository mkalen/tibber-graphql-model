package no.tibber.api.model;

import java.io.Serializable;
import java.util.List;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class Home implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 2L;

    public String id; // TODO: UUID?
    public String timeZone;
    public String appNickname;
    public HomeAvatar appAvatar;
    public Integer size;
    public HomeType type;
    public Integer numberOfResidents;
    public HeatingSource primaryHeatingSource;
    public boolean hasVentilationSystem;
    public Address address;
    public LegalEntity owner;
    public MeteringPointData meteringPointData;
    public Subscription currentSubscription;
    public List<Subscription> subscriptions;
    //public HomeConsumptionConnection consumption;
    public HomeFeatures features;

    public Home() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getAppNickname() {
        return appNickname;
    }

    public void setAppNickname(String appNickname) {
        this.appNickname = appNickname;
    }

    public HomeAvatar getAppAvatar() {
        return appAvatar;
    }

    public void setAppAvatar(HomeAvatar appAvatar) {
        this.appAvatar = appAvatar;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public HomeType getType() {
        return type;
    }

    public void setType(HomeType type) {
        this.type = type;
    }

    public Integer getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(Integer numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }

    public HeatingSource getPrimaryHeatingSource() {
        return primaryHeatingSource;
    }

    public void setPrimaryHeatingSource(HeatingSource primaryHeatingSource) {
        this.primaryHeatingSource = primaryHeatingSource;
    }

    public boolean isHasVentilationSystem() {
        return hasVentilationSystem;
    }

    public void setHasVentilationSystem(boolean hasVentilationSystem) {
        this.hasVentilationSystem = hasVentilationSystem;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LegalEntity getOwner() {
        return owner;
    }

    public void setOwner(LegalEntity owner) {
        this.owner = owner;
    }

    public MeteringPointData getMeteringPointData() {
        return meteringPointData;
    }

    public void setMeteringPointData(MeteringPointData meteringPointData) {
        this.meteringPointData = meteringPointData;
    }

    public Subscription getCurrentSubscription() {
        return currentSubscription;
    }

    public void setCurrentSubscription(Subscription currentSubscription) {
        this.currentSubscription = currentSubscription;
    }

    public HomeFeatures getFeatures() {
        return features;
    }

    public void setFeatures(HomeFeatures features) {
        this.features = features;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Home other = (Home) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    @Override
    public String toString() {
        return "Home [id=" + id + ", timeZone=" + timeZone + ", appNickname=" + appNickname + ", appAvatar=" + appAvatar
                + ", size=" + size + ", type=" + type + ", numberOfResidents=" + numberOfResidents
                + ", primaryHeatingSource=" + primaryHeatingSource + ", hasVentilationSystem=" + hasVentilationSystem
                + ", address=" + address + ", owner=" + owner + ", meteringPointData=" + meteringPointData
                + ", currentSubscription=" + currentSubscription
                + ", features=" + features + "]";
    }

}
