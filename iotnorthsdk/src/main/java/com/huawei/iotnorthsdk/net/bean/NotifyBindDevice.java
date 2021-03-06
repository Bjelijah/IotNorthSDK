package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.annotations.SerializedName;

public class NotifyBindDevice extends NotifyBase {
    @SerializedName("deviceId")     String deviceId;
    @SerializedName("resultCode")   String resultCode;
    @SerializedName("deviceInfo")   DeviceInfo deviceInfo;

    @Override
    public String toString() {
        return "NotifyBindDevice{" +
                "notifyType='" + notifyType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", deviceInfo=" + deviceInfo +
                '}';
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public NotifyBindDevice() {

    }

    public NotifyBindDevice(String notifyType, String deviceId, String resultCode, DeviceInfo deviceInfo) {

        this.notifyType = notifyType;
        this.deviceId = deviceId;
        this.resultCode = resultCode;
        this.deviceInfo = deviceInfo;
    }
}
