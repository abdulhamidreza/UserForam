
package com.paycraft.tom.network.initilize_db;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare {

    @SerializedName("destinationStation")
    @Expose
    private Integer destinationStation;
    @SerializedName("fareAmount")
    @Expose
    private Integer fareAmount;
    @SerializedName("fareId")
    @Expose
    private Integer fareId;
    @SerializedName("fareVersionId")
    @Expose
    private Integer fareVersionId;
    @SerializedName("originStation")
    @Expose
    private Integer originStation;

    public Integer getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(Integer destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Integer getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(Integer fareAmount) {
        this.fareAmount = fareAmount;
    }

    public Integer getFareId() {
        return fareId;
    }

    public void setFareId(Integer fareId) {
        this.fareId = fareId;
    }

    public Integer getFareVersionId() {
        return fareVersionId;
    }

    public void setFareVersionId(Integer fareVersionId) {
        this.fareVersionId = fareVersionId;
    }

    public Integer getOriginStation() {
        return originStation;
    }

    public void setOriginStation(Integer originStation) {
        this.originStation = originStation;
    }

}
