package com.p280ss.android.mobilelib.model;

import android.content.Context;
import com.bytedance.common.utility.p481c.C9719a;
import com.bytedance.common.utility.p481c.C9719a.C9720a;
import com.bytedance.common.utility.p481c.C9721b;

/* renamed from: com.ss.android.mobilelib.model.PersistentData */
public class PersistentData {
    private static PersistentData sInstance;
    private String mLastLoginMobile = "";
    private String mMobileRegexJson = "[['^(\\+86)?(1\\d{10})$', '$2']]";

    private PersistentData() {
    }

    public String getLastLoginMobile() {
        if (this.mLastLoginMobile == null) {
            return "";
        }
        return this.mLastLoginMobile;
    }

    public static synchronized PersistentData inst() {
        PersistentData persistentData;
        synchronized (PersistentData.class) {
            if (sInstance == null) {
                sInstance = new PersistentData();
            }
            persistentData = sInstance;
        }
        return persistentData;
    }

    public void saveLastLoginMobile(Context context, String str) {
        this.mLastLoginMobile = str;
        C9720a a = C9719a.m28654a(context, "app_setting").edit();
        a.putString("last_login_mobile", str);
        C9721b.m28656a(a);
    }
}
