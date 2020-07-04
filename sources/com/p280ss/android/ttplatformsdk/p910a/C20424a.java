package com.p280ss.android.ttplatformsdk.p910a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ttplatformsdk.a.a */
public final class C20424a {

    /* renamed from: b */
    private static C20424a f55152b;

    /* renamed from: a */
    private SharedPreferences f55153a;

    /* renamed from: c */
    private final String f55154c = "ttplatformapi.prefs";

    /* renamed from: a */
    public static C20424a m67762a(Context context) {
        if (f55152b == null) {
            f55152b = new C20424a(context);
        }
        return f55152b;
    }

    private C20424a(Context context) {
        this.f55153a = C7285c.m22838a(context, "ttplatformapi.prefs", 4);
    }

    /* renamed from: b */
    public final String mo54971b(String str, String str2) {
        return this.f55153a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo54968a(String str, String str2) {
        Editor edit = this.f55153a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    /* renamed from: a */
    public final void mo54969a(String str, boolean z) {
        Editor edit = this.f55153a.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    /* renamed from: a */
    public final boolean mo54970a(String str, Boolean bool) {
        return this.f55153a.getBoolean(str, bool.booleanValue());
    }
}
