package com.p280ss.video.rtc.base.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.video.rtc.base.utils.JsonUtils;
import org.webrtc.ContextUtils;

/* renamed from: com.ss.video.rtc.base.data.RtcPreferences */
public class RtcPreferences {
    private static volatile RtcPreferences sInstance;
    private final SharedPreferences mSharedPreferences;

    private static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    private RtcPreferences(Context context) {
        this.mSharedPreferences = C7285c.m22838a(context, "rtc_preference", 0);
    }

    public void remove(String str) {
        if (str != null) {
            Editor edit = this.mSharedPreferences.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public static RtcPreferences instance(Context context) {
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                if (context != null) {
                    sInstance = new RtcPreferences(context);
                } else {
                    throw new RuntimeException("unable to init RtcPreferences without context");
                }
            }
        }
        return sInstance;
    }

    public int getInt(String str, int i) {
        return this.mSharedPreferences.getInt(str, i);
    }

    public String getString(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public void put(String str, Object obj) {
        putString(str, JsonUtils.toJson(obj));
    }

    public <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        return JsonUtils.fromJson(string, cls);
    }

    public void putInt(String str, int i) {
        Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void putString(String str, String str2) {
        Editor edit = this.mSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
