package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C13499h;

/* renamed from: com.facebook.appevents.internal.j */
final class C13186j {

    /* renamed from: a */
    public String f34929a;

    /* renamed from: b */
    public boolean f34930b;

    /* renamed from: b */
    public static void m38540b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: c */
    public final void mo32362c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f34929a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f34930b);
        edit.apply();
    }

    /* renamed from: a */
    public static C13186j m38539a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C13186j(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    public final String toString() {
        String str = "Unclassified";
        if (this.f34930b) {
            str = "Applink";
        }
        if (this.f34929a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.f34929a);
        sb.append(")");
        return sb.toString();
    }

    private C13186j(String str, boolean z) {
        this.f34929a = str;
        this.f34930b = z;
    }
}
