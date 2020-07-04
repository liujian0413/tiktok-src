package com.p280ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.common.applog.WifiBssidInfo */
public class WifiBssidInfo {
    private boolean mBssidChanged;
    private Context mContext;
    private String mLastBssid;
    private long mLastCheckBssidTime;
    private String mTempBssid;
    private long mTempCheckTime;

    public String getBssid() {
        if (this.mContext == null) {
            return null;
        }
        WifiManager wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
        if (wifiManager == null) {
            return null;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public boolean needUploadBssid() {
        if (this.mContext == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastCheckBssidTime < 1800000 || !NetworkUtils.m19548b(this.mContext)) {
            return false;
        }
        String bssid = getBssid();
        if (TextUtils.isEmpty(bssid) || bssid.equals(this.mLastBssid)) {
            return false;
        }
        this.mBssidChanged = true;
        this.mTempBssid = bssid;
        this.mTempCheckTime = currentTimeMillis;
        return true;
    }

    public void uploadSuccess() {
        if (this.mBssidChanged) {
            this.mBssidChanged = false;
            this.mLastBssid = this.mTempBssid;
            this.mLastCheckBssidTime = this.mTempCheckTime;
            Editor edit = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0).edit();
            edit.putString("last_wifi_bssid", this.mLastBssid);
            edit.putLong("last_check_bssid_time", this.mLastCheckBssidTime);
            C9721b.m28656a(edit);
        }
    }

    public WifiBssidInfo(Context context) {
        this.mContext = context.getApplicationContext();
        SharedPreferences a = C7285c.m22838a(this.mContext, C6778a.m20960a(), 0);
        this.mLastBssid = a.getString("last_wifi_bssid", null);
        this.mLastCheckBssidTime = a.getLong("last_check_bssid_time", 0);
    }
}
