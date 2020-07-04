package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {

    /* renamed from: ˏ */
    private static AppsFlyerProperties f6750 = new AppsFlyerProperties();

    /* renamed from: ʼ */
    private boolean f6751 = false;

    /* renamed from: ˊ */
    private String f6752;

    /* renamed from: ˋ */
    private Map<String, Object> f6753 = new HashMap();

    /* renamed from: ˎ */
    public boolean f6754;

    /* renamed from: ॱ */
    public boolean f6755;

    public enum EmailsCryptType {
        NONE(0),
        SHA1(1),
        MD5(2),
        SHA256(3);
        

        /* renamed from: ˋ */
        private final int f6757;

        public final int getValue() {
            return this.f6757;
        }

        private EmailsCryptType(int i) {
            this.f6757 = i;
        }
    }

    public static AppsFlyerProperties getInstance() {
        return f6750;
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f6754 = true;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f6755 = true;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    private AppsFlyerProperties() {
    }

    public Object getObject(String str) {
        return this.f6753.get(str);
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f6752 = str;
    }

    public String getString(String str) {
        return (String) this.f6753.get(str);
    }

    public String getReferrer(Context context) {
        if (this.f6752 != null) {
            return this.f6752;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return C7285c.m22838a(context, "appsflyer-data", 0).getString("referrer", null);
    }

    public void saveProperties(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f6753).toString();
        Editor edit = sharedPreferences.edit();
        edit.putString("savedProperties", jSONObject);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public void loadProperties(Context context) {
        if (!this.f6751) {
            String string = C7285c.m22838a(context, "appsflyer-data", 0).getString("savedProperties", null);
            if (string != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (this.f6753.get(str) == null) {
                            this.f6753.put(str, jSONObject.getString(str));
                        }
                    }
                    this.f6751 = true;
                } catch (JSONException e) {
                    AFLogger.afErrorLog("Failed loading properties", e);
                }
                StringBuilder sb = new StringBuilder("Done loading properties: ");
                sb.append(this.f6751);
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }

    public void set(String str, String str2) {
        this.f6753.put(str, str2);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return Long.valueOf(string).longValue();
    }

    public void set(String str, int i) {
        this.f6753.put(str, Integer.toString(i));
    }

    public void set(String str, long j) {
        this.f6753.put(str, Long.toString(j));
    }

    public void set(String str, boolean z) {
        this.f6753.put(str, Boolean.toString(z));
    }
}
