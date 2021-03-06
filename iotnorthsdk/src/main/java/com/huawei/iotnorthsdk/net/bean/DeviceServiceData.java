package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class DeviceServiceData {
    @SerializedName("serviceId")     String serviceId;
    @SerializedName("serviceType")   String serviceType;
    @SerializedName("data")          JsonObject dataJsonObj;
    @SerializedName("eventTime")     String eventTime;

    @Override
    public String toString() {
        return "DeviceServiceData{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", dataJsonObj=" + dataJsonObj +
                ", eventTime='" + eventTime + '\'' +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public JsonObject getDataJsonObj() {
        return dataJsonObj;
    }

    public void setDataJsonObj(JsonObject dataJsonObj) {
        this.dataJsonObj = dataJsonObj;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public DeviceServiceData() {

    }

    public DeviceServiceData(String serviceId, String serviceType, JsonObject dataJsonObj, String eventTime) {

        this.serviceId = serviceId;
        this.serviceType = serviceType;
        this.dataJsonObj = dataJsonObj;
        this.eventTime = eventTime;
    }
}
