package com.huawei.iotnorthsdk.net.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Condition_DeviceData {
    @SerializedName("type")       String type;
    @SerializedName("id")         String id;
    @SerializedName("deviceInfo") DeviceInfoRule deviceInfo;
    @SerializedName("operator")   String operator;
    @SerializedName("value")      String value;
    @SerializedName("transInfo")  JsonObject transInfoJsonObj;
    @SerializedName("duration")   Integer duration;
    @SerializedName("strategy")   Strategy strategy;

    @Override
    public String toString() {
        return "Condition_DeviceData{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", deviceInfo=" + deviceInfo +
                ", operator='" + operator + '\'' +
                ", value='" + value + '\'' +
                ", transInfoJsonObj=" + transInfoJsonObj +
                ", duration=" + duration +
                ", strategy=" + strategy +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeviceInfoRule getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfoRule deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JsonObject getTransInfoJsonObj() {
        return transInfoJsonObj;
    }

    public void setTransInfoJsonObj(JsonObject transInfoJsonObj) {
        this.transInfoJsonObj = transInfoJsonObj;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Condition_DeviceData() {

    }

    public Condition_DeviceData(String type, String id, DeviceInfoRule deviceInfo, String operator, String value, JsonObject transInfoJsonObj, Integer duration, Strategy strategy) {

        this.type = type;
        this.id = id;
        this.deviceInfo = deviceInfo;
        this.operator = operator;
        this.value = value;
        this.transInfoJsonObj = transInfoJsonObj;
        this.duration = duration;
        this.strategy = strategy;
    }
}
