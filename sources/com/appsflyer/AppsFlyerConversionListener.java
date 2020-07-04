package com.appsflyer;

import java.util.Map;

public interface AppsFlyerConversionListener {
    void onAppOpenAttribution(Map<String, String> map);

    void onAttributionFailure(String str);

    void onInstallConversionDataLoaded(Map<String, String> map);

    void onInstallConversionFailure(String str);
}
