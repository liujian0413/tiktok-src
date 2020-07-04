package com.p280ss.android.deviceregister.p290b.p291a.p292a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.deviceregister.b.a.a.e */
public final class C19312e extends C19301b {

    /* renamed from: a */
    private final SharedPreferences f52223a;

    /* renamed from: b */
    private final SharedPreferences f52224b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo51197a(String str) {
        return m63328d(str);
    }

    /* renamed from: d */
    private String m63328d(String str) {
        return m63329e(str).getString(str, null);
    }

    /* renamed from: e */
    private SharedPreferences m63329e(String str) {
        if ("device_id".equals(str)) {
            return this.f52224b;
        }
        return this.f52223a;
    }

    public C19312e(Context context) {
        if (context != null) {
            this.f52223a = C7285c.m22838a(context, C6778a.m20964c(), 0);
            this.f52224b = C6778a.m20959a(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo51201b(String str) {
        String d = m63328d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return d.split("\n");
    }

    /* renamed from: c */
    public final void mo51202c(String str) {
        SharedPreferences e = m63329e(str);
        if (e != null && e.contains(str)) {
            m63329e(str).edit().remove(str).apply();
        }
        super.mo51202c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51199a(String str, String str2) {
        m63330g(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51200a(String str, String[] strArr) {
        if (strArr != null) {
            m63330g(str, TextUtils.join("\n", strArr));
        }
    }

    /* renamed from: g */
    private void m63330g(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Editor edit = m63329e(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
