package com.paycraft.tom.network.initilize_db;

import com.paycraft.db.utils.Utils;

import java.io.Serializable;


public class UserPrivilegeNet implements Serializable {

    private static final long serialVersionUID = 1L;

    private long privilegeId;
    private String privilegeName;
    private long deviceTypeId;
    private String privilegeDescription;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setPrivilegeId(long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public void setDeviceTypeId(long deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public void setPrivilegeDescription(String privilegeDescription) {
        this.privilegeDescription = privilegeDescription;
    }

    public long getPrivilegeId() {
        return privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public long getDeviceTypeId() {
        return deviceTypeId;
    }

    public String getPrivilegeDescription() {
        return privilegeDescription;
    }

    public UserPrivilegeNet(String privilegeName, long deviceTypeId, String privilegeDescription) {
        this.privilegeName = privilegeName;
        this.deviceTypeId = deviceTypeId;
        this.privilegeDescription = privilegeDescription;
    }

    @Override
    public String toString() {
        return Utils.toJson(this);
    }
}
