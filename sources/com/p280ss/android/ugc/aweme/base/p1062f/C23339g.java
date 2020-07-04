package com.p280ss.android.ugc.aweme.base.p1062f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.base.f.g */
public final class C23339g {

    /* renamed from: a */
    public SharedPreferences f61412a;

    /* renamed from: b */
    private Editor f61413b;

    /* renamed from: b */
    private Editor m76572b() {
        if (this.f61413b == null) {
            this.f61413b = this.f61412a.edit();
        }
        return this.f61413b;
    }

    /* renamed from: a */
    public final void mo60625a() {
        m76572b().clear().apply();
    }

    /* renamed from: a */
    public final int mo60620a(String str, int i) {
        return this.f61412a.getInt(str, i);
    }

    public C23339g(Context context, String str) {
        this.f61412a = C7285c.m22838a(context.getApplicationContext(), str, 0);
    }

    /* renamed from: a */
    public final long mo60621a(String str, long j) {
        return this.f61412a.getLong(str, j);
    }

    /* renamed from: a */
    public final <T> T mo60622a(String str, Class<T> cls) {
        String a = mo60623a(str, "");
        if (!TextUtils.isEmpty(a)) {
            try {
                return JSON.parseObject(a, cls);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.util.List<T> mo60628b(java.lang.String r2, java.lang.Class<T> r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.mo60623a(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0011
            java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r2, r3)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 != 0) goto L_0x0019
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p1062f.C23339g.mo60628b(java.lang.String, java.lang.Class):java.util.List");
    }

    /* renamed from: a */
    public final String mo60623a(String str, String str2) {
        return this.f61412a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo60629b(String str, int i) {
        m76572b().putInt(str, i).apply();
    }

    /* renamed from: a */
    public final Set<String> mo60624a(String str, Set<String> set) {
        return this.f61412a.getStringSet(str, set);
    }

    /* renamed from: b */
    public final void mo60630b(String str, long j) {
        m76572b().putLong(str, j).apply();
    }

    /* renamed from: b */
    public final void mo60631b(String str, Object obj) {
        m76572b().putString(str, JSONArray.toJSONString(obj)).apply();
    }

    /* renamed from: a */
    public final void mo60626a(String str, Object obj) {
        m76572b().putString(str, JSONObject.toJSONString(obj)).apply();
    }

    /* renamed from: b */
    public final void mo60632b(String str, String str2) {
        m76572b().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final boolean mo60627a(String str, boolean z) {
        return this.f61412a.getBoolean(str, z);
    }

    /* renamed from: b */
    public final void mo60633b(String str, Set<String> set) {
        m76572b().putStringSet(str, set).apply();
    }

    /* renamed from: b */
    public final void mo60634b(String str, boolean z) {
        m76572b().putBoolean(str, z).apply();
    }
}
