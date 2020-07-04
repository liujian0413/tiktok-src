package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.n */
public class C25935n {

    /* renamed from: b */
    private static volatile C25935n f68608b;

    /* renamed from: a */
    public String f68609a = PreferenceManager.getDefaultSharedPreferences(C6399b.m19921a()).getString("rn_debug_source_url_safe_host", null);

    private C25935n() {
    }

    /* renamed from: a */
    public static C25935n m85247a() {
        if (f68608b == null) {
            synchronized (C25935n.class) {
                if (f68608b == null) {
                    f68608b = new C25935n();
                }
            }
        }
        return f68608b;
    }

    /* renamed from: a */
    public final void mo67320a(String str) {
        this.f68609a = str;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C6399b.m19921a());
        if (str != null) {
            defaultSharedPreferences.edit().putString("rn_debug_source_url_safe_host", str).apply();
        } else {
            defaultSharedPreferences.edit().remove("rn_debug_source_url_safe_host").apply();
        }
    }
}
