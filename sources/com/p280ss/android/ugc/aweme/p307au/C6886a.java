package com.p280ss.android.ugc.aweme.p307au;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.au.a */
public abstract class C6886a {

    /* renamed from: a */
    protected String f19551a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16897a();

    public C6886a() {
        mo16897a();
    }

    /* renamed from: b */
    private void m21419b() {
        if (TextUtils.isEmpty(this.f19551a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    /* renamed from: a */
    private SharedPreferences m21418a(Context context) {
        if (context == null) {
            return null;
        }
        m21419b();
        return C7285c.m22838a(context, this.f19551a, 0);
    }

    /* renamed from: c */
    public final long mo16910c(Context context, String str) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return 0;
        }
        return a.getLong(str, 0);
    }

    /* renamed from: a */
    public final String mo16896a(Context context, String str) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, "");
    }

    /* renamed from: b */
    public final boolean mo16908b(Context context, String str) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, false);
    }

    /* renamed from: b */
    public final int mo16903b(Context context, String str, int i) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return 0;
        }
        return a.getInt(str, i);
    }

    /* renamed from: a */
    public final <T> T mo16895a(Context context, String str, Class<T> cls) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string, cls);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final long mo16904b(Context context, String str, long j) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return 0;
        }
        return a.getLong(str, 0);
    }

    /* renamed from: a */
    public final void mo16898a(Context context, String str, int i) {
        Editor edit = C7285c.m22838a(context, this.f19551a, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: b */
    public final String mo16905b(Context context, String str, String str2) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo16899a(Context context, String str, long j) {
        SharedPreferences a = m21418a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final <T> List<T> mo16906b(Context context, String str, Class<T> cls) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseArray(string, cls);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo16900a(Context context, String str, Object obj) {
        try {
            SharedPreferences a = m21418a(context);
            if (a != null) {
                if (obj != null) {
                    Editor edit = a.edit();
                    edit.putString(str, JSONObject.toJSONString(obj));
                    edit.apply();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo16907b(Context context, String str, Object obj) {
        try {
            SharedPreferences a = m21418a(context);
            if (a != null) {
                if (obj != null) {
                    Editor edit = a.edit();
                    edit.putString(str, JSONObject.toJSONString(obj));
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo16901a(Context context, String str, String str2) {
        SharedPreferences a = m21418a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final void mo16902a(Context context, String str, boolean z) {
        SharedPreferences a = m21418a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final boolean mo16909b(Context context, String str, boolean z) {
        SharedPreferences a = m21418a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, z);
    }
}
