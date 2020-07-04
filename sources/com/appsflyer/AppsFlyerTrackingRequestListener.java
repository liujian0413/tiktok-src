package com.appsflyer;

public interface AppsFlyerTrackingRequestListener {
    void onTrackingRequestFailure(String str);

    void onTrackingRequestSuccess();
}
