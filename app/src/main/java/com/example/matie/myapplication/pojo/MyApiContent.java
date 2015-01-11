
package com.example.matie.myapplication.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyApiContent {

    @Expose
    private String title;
    @Expose
    private String query;
    @SerializedName("for")
    @Expose
    private String _for;
    @Expose
    private Integer method;
    @SerializedName("prayer_method_name")
    @Expose
    private String prayerMethodName;
    @Expose
    private Integer daylight;
    @Expose
    private String timezone;
    @SerializedName("map_image")
    @Expose
    private String mapImage;
    @Expose
    private String sealevel;
    @SerializedName("today_weather")
    @Expose
    private TodayWeather todayWeather;
    @Expose
    private String link;
    @SerializedName("qibla_direction")
    @Expose
    private String qiblaDirection;
    @Expose
    private String latitude;
    @Expose
    private String longitude;
    @Expose
    private String address;
    @Expose
    private String city;
    @Expose
    private String state;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("status_valid")
    @Expose
    private Integer statusValid;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("status_description")
    @Expose
    private String statusDescription;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * 
     * @return
     *     The _for
     */
    public String getFor() {
        return _for;
    }

    /**
     * 
     * @param _for
     *     The for
     */
    public void setFor(String _for) {
        this._for = _for;
    }

    /**
     * 
     * @return
     *     The method
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     *     The method
     */
    public void setMethod(Integer method) {
        this.method = method;
    }

    /**
     * 
     * @return
     *     The prayerMethodName
     */
    public String getPrayerMethodName() {
        return prayerMethodName;
    }

    /**
     * 
     * @param prayerMethodName
     *     The prayer_method_name
     */
    public void setPrayerMethodName(String prayerMethodName) {
        this.prayerMethodName = prayerMethodName;
    }

    /**
     * 
     * @return
     *     The daylight
     */
    public Integer getDaylight() {
        return daylight;
    }

    /**
     * 
     * @param daylight
     *     The daylight
     */
    public void setDaylight(Integer daylight) {
        this.daylight = daylight;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * 
     * @return
     *     The mapImage
     */
    public String getMapImage() {
        return mapImage;
    }

    /**
     * 
     * @param mapImage
     *     The map_image
     */
    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    /**
     * 
     * @return
     *     The sealevel
     */
    public String getSealevel() {
        return sealevel;
    }

    /**
     * 
     * @param sealevel
     *     The sealevel
     */
    public void setSealevel(String sealevel) {
        this.sealevel = sealevel;
    }

    /**
     * 
     * @return
     *     The todayWeather
     */
    public TodayWeather getTodayWeather() {
        return todayWeather;
    }

    /**
     * 
     * @param todayWeather
     *     The today_weather
     */
    public void setTodayWeather(TodayWeather todayWeather) {
        this.todayWeather = todayWeather;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The qiblaDirection
     */
    public String getQiblaDirection() {
        return qiblaDirection;
    }

    /**
     * 
     * @param qiblaDirection
     *     The qibla_direction
     */
    public void setQiblaDirection(String qiblaDirection) {
        this.qiblaDirection = qiblaDirection;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The statusValid
     */
    public Integer getStatusValid() {
        return statusValid;
    }

    /**
     * 
     * @param statusValid
     *     The status_valid
     */
    public void setStatusValid(Integer statusValid) {
        this.statusValid = statusValid;
    }

    /**
     * 
     * @return
     *     The statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The status_code
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * 
     * @param statusDescription
     *     The status_description
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

}
