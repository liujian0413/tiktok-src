package com.appsflyer;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public void onInstallConversionDataLoaded(Map<String, String> map) {
        onInstallConversionDataLoadedNative(map);
    }

    public void onAttributionFailure(String str) {
        m8651("onInstallConversionFailure", str);
    }

    public void onInstallConversionFailure(String str) {
        m8651("onAttributionFailure", str);
    }

    /* renamed from: ˊ */
    private void m8651(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216) {
                    if (str.equals("onInstallConversionFailure")) {
                        c = 0;
                    }
                }
            } else if (str.equals("onAttributionFailure")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    onInstallConversionFailureNative(jSONObject);
                    return;
                case 1:
                    onAttributionFailureNative(jSONObject);
                    break;
            }
        } catch (JSONException e) {
            C6497a.m20185b(e);
        }
    }
}
