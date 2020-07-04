package com.bytedance.frameworks.baselib.network.http.cronet;

import java.util.Map;

public interface ICronetAppProvider {
    String getAbClient();

    String getAbFeature();

    String getAbFlag();

    String getAbVersion();

    String getAbi();

    String getAppId();

    String getAppName();

    String getBypassBOEJSON();

    String getCarrierRegion();

    String getChannel();

    String getCityName();

    String getDPI();

    String getDeviceBrand();

    String getDeviceId();

    String getDevicePlatform();

    String getDeviceType();

    String getGetDomainDefaultJSON();

    Map<String, String> getGetDomainDependHostMap();

    String getIId();

    String getLanguage();

    String getManifestVersionCode();

    String getNetAccessType();

    String getOSApi();

    String getOSVersion();

    String getOpenUdid();

    String getRegion();

    String getResolution();

    String getRticket();

    String getSsmix();

    String getStoreIdc();

    String getSysRegion();

    String getUUID();

    String getUpdateVersionCode();

    String getUserId();

    String getVersionCode();

    String getVersionName();

    void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4);

    Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    void onColdStartFinish();

    void onEffectiveConnectionTypeChanged(int i);

    void onServerConfigUpdated(String str);

    void onTNCUpdateFailed();

    void onTTNetDetectInfoChanged(String str);

    void onTTNetStateChanged(int i);

    void sendAppMonitorEvent(String str, String str2);
}
