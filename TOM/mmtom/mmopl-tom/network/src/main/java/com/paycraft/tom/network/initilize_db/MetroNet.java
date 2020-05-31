
package com.paycraft.tom.network.initilize_db;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetroNet {

    @SerializedName("companyId")
    @Expose
    private Integer companyId;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("fareInfos")
    @Expose
    private List<FareInfoNet> fareInfoNets = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("imagePath")
    @Expose
    private String imagePath;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("lines")
    @Expose
    private List<LineNet> lineNets = null;
    @SerializedName("metroDescription")
    @Expose
    private String metroDescription;
    @SerializedName("metroId")
    @Expose
    private Integer metroId;
    @SerializedName("metroName")
    @Expose
    private String metroName;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("passTypes")
    @Expose
    private List<PassType> passTypes = null;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("stations")

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

    public List<FareInfoNet> getFareInfoNets() {
        return fareInfoNets;
    }

    public void setFareInfoNets(List<FareInfoNet> fareInfoNets) {
        this.fareInfoNets = fareInfoNets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<LineNet> getLineNets() {
        return lineNets;
    }

    public void setLineNets(List<LineNet> lineNets) {
        this.lineNets = lineNets;
    }

    public String getMetroDescription() {
        return metroDescription;
    }

    public void setMetroDescription(String metroDescription) {
        this.metroDescription = metroDescription;
    }

    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
    }

    public String getMetroName() {
        return metroName;
    }

    public void setMetroName(String metroName) {
        this.metroName = metroName;
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

    public List<PassType> getPassTypes() {
        return passTypes;
    }

    public void setPassTypes(List<PassType> passTypes) {
        this.passTypes = passTypes;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
