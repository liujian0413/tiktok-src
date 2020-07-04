package com.p280ss.video.rtc.base.net.bean;

import com.google.gson.C6711m;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody */
public class FeedbackRequestBody {
    @C6593c(mo15949a = "clientInfo")
    public ClientInfo clientInfo;
    @C6593c(mo15949a = "feedback")
    public C6711m feedback;
    @C6593c(mo15949a = "rtcInfo")
    public RtcInfo rtcInfo;
    @C6593c(mo15949a = "satisfied")
    public boolean satisfied;

    /* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody$ClientInfo */
    public static class ClientInfo {
        @C6593c(mo15949a = "carrierName")
        public String carrierName;
        @C6593c(mo15949a = "deviceId")
        public String deviceId;
        @C6593c(mo15949a = "deviceModel")
        public String deviceModel;
        @C6593c(mo15949a = "manufacturer")
        public String manufacturer;
        @C6593c(mo15949a = "networkType")
        public String networkType;
        @C6593c(mo15949a = "osType")
        public String osType;
        @C6593c(mo15949a = "osVersion")
        public String osVersion;

        public ClientInfo setCarrierName(String str) {
            this.carrierName = str;
            return this;
        }

        public ClientInfo setDevice(String str) {
            this.deviceModel = str;
            return this;
        }

        public ClientInfo setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public ClientInfo setManufacturerInfo(String str) {
            this.manufacturer = str;
            return this;
        }

        public ClientInfo setNetworkType(String str) {
            this.networkType = str;
            return this;
        }

        public ClientInfo setOsType(String str) {
            this.osType = str;
            return this;
        }

        public ClientInfo setOsVersion(String str) {
            this.osVersion = str;
            return this;
        }
    }

    /* renamed from: com.ss.video.rtc.base.net.bean.FeedbackRequestBody$RtcInfo */
    public static class RtcInfo {
        @C6593c(mo15949a = "appId")
        public String appId;
        @C6593c(mo15949a = "roomId")
        public String roomId;
        @C6593c(mo15949a = "rtcProvider")
        public String rtcProvider;
        @C6593c(mo15949a = "sdkVersion")
        public String sdkVersion;
        @C6593c(mo15949a = "timestamp")
        public String timestamp;
        @C6593c(mo15949a = "userId")
        public String userId;

        public RtcInfo setAppId(String str) {
            this.appId = str;
            return this;
        }

        public RtcInfo setRoomId(String str) {
            this.roomId = str;
            return this;
        }

        public RtcInfo setSdkProvider(String str) {
            this.rtcProvider = str;
            return this;
        }

        public RtcInfo setSdkVersion(String str) {
            this.sdkVersion = str;
            return this;
        }

        public RtcInfo setTimestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public RtcInfo setUserId(String str) {
            this.userId = str;
            return this;
        }
    }
}
