package no.tibber.api.model;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class Home {

    public String id;
    public String timeZone;
    public String appNickname;
    public HomeAvatar appAvatar;
    public int size;
    public HomeType type;
    public int numberOfResidents;
    public HeatingSource primaryHeatingSource;
    public boolean hasVentilationSystem;
    public Address address;
    public LegalEntity owner;
    // public MeteringPointData meteringPointData;
    // public Subscription currentSubscription;
    // public Subscription[] subscriptions;
    // public HomeConsumptionConnection consumption;
    // public HomeFeatures features;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HomeType getType() {
        return type;
    }

    public void setType(HomeType homeType) {
        this.type = homeType;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
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

    @Override
    public String toString() {
        return "Home [id=" + id + ", timeZone=" + timeZone + ", appNickname=" + appNickname + ", appAvatar=" + appAvatar
                + ", size=" + size + ", type=" + type + ", numberOfResidents=" + numberOfResidents
                + ", primaryHeatingSource=" + primaryHeatingSource + ", hasVentilationSystem=" + hasVentilationSystem
                + ", address=" + address + ", owner=" + owner + "]";
    }

}
