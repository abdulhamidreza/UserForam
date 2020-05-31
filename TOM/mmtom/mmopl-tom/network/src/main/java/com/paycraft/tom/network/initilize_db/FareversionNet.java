
package com.paycraft.tom.network.initilize_db;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FareversionNet {

    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("fareDescription")
    @Expose
    private String fareDescription;
    @SerializedName("fareTableId")
    @Expose
    private Integer fareTableId;
    @SerializedName("fareVersion")
    @Expose
    private String fareVersion;
    @SerializedName("fareVersionId")
    @Expose
    private Integer fareVersionId;
    @SerializedName("fares")
    @Expose
    private List<Fare> fares = null;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("startDate")
    @Expose
    private String startDate;

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

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFareDescription() {
        return fareDescription;
    }

    public void setFareDescription(String fareDescription) {
        this.fareDescription = fareDescription;
    }

    public Integer getFareTableId() {
        return fareTableId;
    }

    public void setFareTableId(Integer fareTableId) {
        this.fareTableId = fareTableId;
    }

    public String getFareVersion() {
        return fareVersion;
    }

    public void setFareVersion(String fareVersion) {
        this.fareVersion = fareVersion;
    }

    public Integer getFareVersionId() {
        return fareVersionId;
    }

    public void setFareVersionId(Integer fareVersionId) {
        this.fareVersionId = fareVersionId;
    }

    public List<Fare> getFares() {
        return fares;
    }

    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
