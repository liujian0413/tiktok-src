package com.facebook.react.packagerconnection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;

public class PackagerConnectionSettings {
    private static final String TAG = "PackagerConnectionSettings";
    private final String mPackageName;
    private final SharedPreferences mPreferences;

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getInspectorServerHost() {
        return AndroidInfoHelpers.getInspectorProxyHost();
    }

    public String getDebugServerHost() {
        String string = this.mPreferences.getString("debug_http_host", null);
        if (!TextUtils.isEmpty(string)) {
            return (String) C13854a.m40916b(string);
        }
        String serverHost = AndroidInfoHelpers.getServerHost();
        if (serverHost.equals("localhost")) {
            C13286a.m38860c(TAG, "You seem to be running on device. Run 'adb reverse tcp:8081 tcp:8081' to forward the debug server's port to the device.");
        }
        return serverHost;
    }

    public PackagerConnectionSettings(Context context) {
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.mPackageName = context.getPackageName();
    }
}
