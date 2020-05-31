
package com.paycraft.tom.network.initilize_db;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FareInfoNet {

    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("fareDescription")
    @Expose
    private String fareDescription;
    @SerializedName("fareTableId")
    @Expose
    private Integer fareTableId;
    @SerializedName("fareTableName")
    @Expose
    private String fareTableName;
    @SerializedName("fareversions")
    @Expose
    private List<FareversionNet> fareversionNets = null;
    @SerializedName("metroId")
    @Expose
    private Integer metroId;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;

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

    public String getFareTableName() {
        return fareTableName;
    }

    public void setFareTableName(String fareTableName) {
        this.fareTableName = fareTableName;
    }

    public List<FareversionNet> getFareversionNets() {
        return fareversionNets;
    }

    public void setFareversionNets(List<FareversionNet> fareversionNets) {
        this.fareversionNets = fareversionNets;
    }

    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
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

}
