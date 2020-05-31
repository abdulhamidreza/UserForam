
package com.paycraft.tom.network.initilize_db;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationNet {

    @SerializedName("companyId")
    @Expose
    private Integer companyId;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("metroId")
    @Expose
    private Integer metroId;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("stationDescription")
    @Expose
    private String stationDescription;
    @SerializedName("stationId")
    @Expose
    private Integer stationId;
    @SerializedName("stationName")
    @Expose
    private String stationName;
    @SerializedName("stationOrder")
    @Expose
    private Integer stationOrder;
    @SerializedName("stnAddress")
    @Expose
    private String stnAddress;
    @SerializedName("stnLatitude")
    @Expose
    private double stnLatitude;
    @SerializedName("stnLongitude")
    @Expose
    private double stnLongitude;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStationDescription() {
        return stationDescription;
    }

    public void setStationDescription(String stationDescription) {
        this.stationDescription = stationDescription;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(Integer stationOrder) {
        this.stationOrder = stationOrder;
    }

    public String getStnAddress() {
        return stnAddress;
    }

    public void setStnAddress(String stnAddress) {
        this.stnAddress = stnAddress;
    }

    public double getStnLatitude() {
        return stnLatitude;
    }

    public void setStnLatitude(double stnLatitude) {
        this.stnLatitude = stnLatitude;
    }

    public double getStnLongitude() {
        return stnLongitude;
    }

    public void setStnLongitude(double stnLongitude) {
        this.stnLongitude = stnLongitude;
    }

}
