package no.tibber.api.model;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class Address {

    public String address1;
    public String address2;
    public String address3;
    public String postalCode;
    public String city;
    @GraphQLProperty(name = "country")
    public String countryCode;
    public Double latitude;
    public Double longitude;

    public Address() {
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address [address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", postalCode="
                + postalCode + ", city=" + city + ", countryCode=" + countryCode + ", latitude=" + latitude
                + ", longitude=" + longitude + "]";
    }

}
