
package com.paycraft.tom.network.initilize_db;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PassType {

    @SerializedName("balanceForward")
    @Expose
    private Boolean balanceForward;
    @SerializedName("cardId")
    @Expose
    private Integer cardId;
    @SerializedName("companyId")
    @Expose
    private Integer companyId;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("creationDate")
    @Expose
    private String creationDate;
    @SerializedName("dailyTripControl")
    @Expose
    private Boolean dailyTripControl;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("entryExitControl")
    @Expose
    private Boolean entryExitControl;
    @SerializedName("entryValidity")
    @Expose
    private Integer entryValidity;
    @SerializedName("fareMediaId")
    @Expose
    private Integer fareMediaId;
    @SerializedName("fareTableId")
    @Expose
    private Integer fareTableId;
    @SerializedName("fixedFare")
    @Expose
    private Boolean fixedFare;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("maxChipBalance")
    @Expose
    private Integer maxChipBalance;
    @SerializedName("maxDailyTrip")
    @Expose
    private Integer maxDailyTrip;
    @SerializedName("metroId")
    @Expose
    private Integer metroId;
    @SerializedName("minEntryValue")
    @Expose
    private Integer minEntryValue;
    @SerializedName("minLoadBalance")
    @Expose
    private Integer minLoadBalance;
    @SerializedName("minReloadBalance")
    @Expose
    private Integer minReloadBalance;
    @SerializedName("modificationDate")
    @Expose
    private String modificationDate;
    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;
    @SerializedName("numberOfTrips")
    @Expose
    private Integer numberOfTrips;
    @SerializedName("otherStationOverTime")
    @Expose
    private Integer otherStationOverTime;
    @SerializedName("otherStationOverTimeMaxPenalty")
    @Expose
    private Integer otherStationOverTimeMaxPenalty;
    @SerializedName("otherStationOvertimePenalty")
    @Expose
    private Integer otherStationOvertimePenalty;
    @SerializedName("overTravelPenalty")
    @Expose
    private Integer overTravelPenalty;
    @SerializedName("passDescription")
    @Expose
    private String passDescription;
    @SerializedName("passId")
    @Expose
    private Integer passId;
    @SerializedName("passName")
    @Expose
    private String passName;
    @SerializedName("passRefundCharge")
    @Expose
    private Integer passRefundCharge;
    @SerializedName("passRefundPermit")
    @Expose
    private Boolean passRefundPermit;
    @SerializedName("passTypeId")
    @Expose
    private Integer passTypeId;
    @SerializedName("reloadPermit")
    @Expose
    private Boolean reloadPermit;
    @SerializedName("sameStationNoFare")
    @Expose
    private Boolean sameStationNoFare;
    @SerializedName("sameStationOverTime")
    @Expose
    private Integer sameStationOverTime;
    @SerializedName("sameStationOverTimeMaxPenalty")
    @Expose
    private Integer sameStationOverTimeMaxPenalty;
    @SerializedName("sameStationOverTimePenalty")
    @Expose
    private Integer sameStationOverTimePenalty;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("stationBased")
    @Expose
    private Boolean stationBased;
    @SerializedName("stepReload")
    @Expose
    private Integer stepReload;
    @SerializedName("validityDays")
    @Expose
    private Integer validityDays;
    @SerializedName("zoneBased")
    @Expose
    private Boolean zoneBased;

    public Boolean getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Boolean balanceForward) {
        this.balanceForward = balanceForward;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

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

    public Boolean getDailyTripControl() {
        return dailyTripControl;
    }

    public void setDailyTripControl(Boolean dailyTripControl) {
        this.dailyTripControl = dailyTripControl;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getEntryExitControl() {
        return entryExitControl;
    }

    public void setEntryExitControl(Boolean entryExitControl) {
        this.entryExitControl = entryExitControl;
    }

    public Integer getEntryValidity() {
        return entryValidity;
    }

    public void setEntryValidity(Integer entryValidity) {
        this.entryValidity = entryValidity;
    }

    public Integer getFareMediaId() {
        return fareMediaId;
    }

    public void setFareMediaId(Integer fareMediaId) {
        this.fareMediaId = fareMediaId;
    }

    public Integer getFareTableId() {
        return fareTableId;
    }

    public void setFareTableId(Integer fareTableId) {
        this.fareTableId = fareTableId;
    }

    public Boolean getFixedFare() {
        return fixedFare;
    }

    public void setFixedFare(Boolean fixedFare) {
        this.fixedFare = fixedFare;
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

    public Integer getMaxChipBalance() {
        return maxChipBalance;
    }

    public void setMaxChipBalance(Integer maxChipBalance) {
        this.maxChipBalance = maxChipBalance;
    }

    public Integer getMaxDailyTrip() {
        return maxDailyTrip;
    }

    public void setMaxDailyTrip(Integer maxDailyTrip) {
        this.maxDailyTrip = maxDailyTrip;
    }

    public Integer getMetroId() {
        return metroId;
    }

    public void setMetroId(Integer metroId) {
        this.metroId = metroId;
    }

    public Integer getMinEntryValue() {
        return minEntryValue;
    }

    public void setMinEntryValue(Integer minEntryValue) {
        this.minEntryValue = minEntryValue;
    }

    public Integer getMinLoadBalance() {
        return minLoadBalance;
    }

    public void setMinLoadBalance(Integer minLoadBalance) {
        this.minLoadBalance = minLoadBalance;
    }

    public Integer getMinReloadBalance() {
        return minReloadBalance;
    }

    public void setMinReloadBalance(Integer minReloadBalance) {
        this.minReloadBalance = minReloadBalance;
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

    public Integer getNumberOfTrips() {
        return numberOfTrips;
    }

    public void setNumberOfTrips(Integer numberOfTrips) {
        this.numberOfTrips = numberOfTrips;
    }

    public Integer getOtherStationOverTime() {
        return otherStationOverTime;
    }

    public void setOtherStationOverTime(Integer otherStationOverTime) {
        this.otherStationOverTime = otherStationOverTime;
    }

    public Integer getOtherStationOverTimeMaxPenalty() {
        return otherStationOverTimeMaxPenalty;
    }

    public void setOtherStationOverTimeMaxPenalty(Integer otherStationOverTimeMaxPenalty) {
        this.otherStationOverTimeMaxPenalty = otherStationOverTimeMaxPenalty;
    }

    public Integer getOtherStationOvertimePenalty() {
        return otherStationOvertimePenalty;
    }

    public void setOtherStationOvertimePenalty(Integer otherStationOvertimePenalty) {
        this.otherStationOvertimePenalty = otherStationOvertimePenalty;
    }

    public Integer getOverTravelPenalty() {
        return overTravelPenalty;
    }

    public void setOverTravelPenalty(Integer overTravelPenalty) {
        this.overTravelPenalty = overTravelPenalty;
    }

    public String getPassDescription() {
        return passDescription;
    }

    public void setPassDescription(String passDescription) {
        this.passDescription = passDescription;
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public Integer getPassRefundCharge() {
        return passRefundCharge;
    }

    public void setPassRefundCharge(Integer passRefundCharge) {
        this.passRefundCharge = passRefundCharge;
    }

    public Boolean getPassRefundPermit() {
        return passRefundPermit;
    }

    public void setPassRefundPermit(Boolean passRefundPermit) {
        this.passRefundPermit = passRefundPermit;
    }

    public Integer getPassTypeId() {
        return passTypeId;
    }

    public void setPassTypeId(Integer passTypeId) {
        this.passTypeId = passTypeId;
    }

    public Boolean getReloadPermit() {
        return reloadPermit;
    }

    public void setReloadPermit(Boolean reloadPermit) {
        this.reloadPermit = reloadPermit;
    }

    public Boolean getSameStationNoFare() {
        return sameStationNoFare;
    }

    public void setSameStationNoFare(Boolean sameStationNoFare) {
        this.sameStationNoFare = sameStationNoFare;
    }

    public Integer getSameStationOverTime() {
        return sameStationOverTime;
    }

    public void setSameStationOverTime(Integer sameStationOverTime) {
        this.sameStationOverTime = sameStationOverTime;
    }

    public Integer getSameStationOverTimeMaxPenalty() {
        return sameStationOverTimeMaxPenalty;
    }

    public void setSameStationOverTimeMaxPenalty(Integer sameStationOverTimeMaxPenalty) {
        this.sameStationOverTimeMaxPenalty = sameStationOverTimeMaxPenalty;
    }

    public Integer getSameStationOverTimePenalty() {
        return sameStationOverTimePenalty;
    }

    public void setSameStationOverTimePenalty(Integer sameStationOverTimePenalty) {
        this.sameStationOverTimePenalty = sameStationOverTimePenalty;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Boolean getStationBased() {
        return stationBased;
    }

    public void setStationBased(Boolean stationBased) {
        this.stationBased = stationBased;
    }

    public Integer getStepReload() {
        return stepReload;
    }

    public void setStepReload(Integer stepReload) {
        this.stepReload = stepReload;
    }

    public Integer getValidityDays() {
        return validityDays;
    }

    public void setValidityDays(Integer validityDays) {
        this.validityDays = validityDays;
    }

    public Boolean getZoneBased() {
        return zoneBased;
    }

    public void setZoneBased(Boolean zoneBased) {
        this.zoneBased = zoneBased;
    }

}
