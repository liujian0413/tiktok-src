package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.ad.e.e */
public final class C22457e {
    /* renamed from: a */
    public static void m74329a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null) {
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
                return;
            }
            edit.commit();
        }
    }
}
