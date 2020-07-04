package com.facebook.react.common;

import android.text.TextUtils;
import com.facebook.common.p686c.C13286a;
import org.json.JSONException;
import org.json.JSONObject;

public class DebugServerException extends RuntimeException {
    public DebugServerException(String str) {
        super(str);
    }

    private static String shortenFileName(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    public static DebugServerException parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new DebugServerException(jSONObject.getString("description"), shortenFileName(jSONObject.getString("filename")), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"));
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Could not parse DebugServerException from: ");
            sb.append(str);
            C13286a.m38854b("ReactNative", sb.toString(), (Throwable) e);
            return null;
        }
    }

    public DebugServerException(String str, Throwable th) {
        super(str, th);
    }

    public static DebugServerException makeGeneric(String str, Throwable th) {
        return makeGeneric(str, "", th);
    }

    public static DebugServerException makeGeneric(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:8081 tcp:8081' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:8081\n\n");
        sb.append(str2);
        return new DebugServerException(sb.toString(), th);
    }

    private DebugServerException(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n  at ");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(i2);
        super(sb.toString());
    }
}
