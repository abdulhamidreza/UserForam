
package com.paycraft.tom.network.initilize_db;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineNet {

    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("lineDescription")
    @Expose
    private String lineDescription;
    @SerializedName("lineId")
    @Expose
    private long lineId;
    @SerializedName("lineName")
    @Expose
    private String lineName;
    @SerializedName("lineTypeId")
    @Expose
    private long lineTypeId;
    @SerializedName("metroId")
    @Expose
    private long metroId;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("stationCount")
    @Expose
    private int stationCount;
    @SerializedName("stations")
    @Expose
    private List<StationNet> stationNets = null;

    public LineNet(long lineId, String lineName, long lineTypeId, String shortName, String lineDescription, int stationCount, long metroId,
                boolean isActive, String createdBy,
                String modifiedBy, String creationDate, String modificationDate) {
        super();
        this.lineId = lineId;
        this.lineName = lineName;
        this.lineTypeId = lineTypeId;
        this.shortName = shortName;
        this.lineDescription = lineDescription;
        this.stationCount = stationCount;
        this.metroId = metroId;
        this.isActive = isActive;
        this.stationNets = null;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


    public void setId(long id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public long getId() {
        return id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public long getLineId() {
        return lineId;
    }

    public long getLineTypeId() {
        return lineTypeId;
    }

    public long getMetroId() {
        return metroId;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public int getStationCount() {
        return stationCount;
    }

    public List<StationNet> getStationNets() {
        return stationNets;
    }

    public void setLineId(long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }


    public void setLineTypeId(long lineTypeId) {
        this.lineTypeId = lineTypeId;
    }


    public void setMetroId(long metroId) {
        this.metroId = metroId;
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


    public void setStationCount(int stationCount) {
        this.stationCount = stationCount;
    }


    public void setStationNets(List<StationNet> stationNets) {
        this.stationNets = stationNets;
    }

}
