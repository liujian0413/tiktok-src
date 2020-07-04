package com.bytedance.neverland;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

public class Config {
    public int appId;
    public String detailVersion;
    public String deviceId;
    public String host;
    public String randomId;

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public void loadLibrary(String str) {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }

    public Config setAppId(int i) {
        this.appId = i;
        return this;
    }

    public Config setDetailVersion(String str) {
        this.detailVersion = str;
        return this;
    }

    public Config setDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public Config setHost(String str) {
        this.host = str;
        return this;
    }

    public Config setRandomId(String str) {
        this.randomId = str;
        return this;
    }
}
