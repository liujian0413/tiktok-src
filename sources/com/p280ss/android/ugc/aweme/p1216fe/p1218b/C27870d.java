package com.p280ss.android.ugc.aweme.p1216fe.p1218b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.fe.b.d */
public final class C27870d {

    /* renamed from: a */
    public SharedPreferences f73438a;

    /* renamed from: b */
    private Editor f73439b;

    /* renamed from: com.ss.android.ugc.aweme.fe.b.d$a */
    static class C27872a {

        /* renamed from: a */
        public static C27870d f73440a = new C27870d();
    }

    /* renamed from: a */
    public static C27870d m91297a() {
        return C27872a.f73440a;
    }

    /* renamed from: b */
    private Editor m91298b() {
        if (this.f73439b == null) {
            this.f73439b = this.f73438a.edit();
        }
        return this.f73439b;
    }

    private C27870d() {
        this.f73438a = C7285c.m22838a(C6399b.m19921a(), "fe-storage", 0);
    }

    /* renamed from: a */
    public final String mo71348a(String str, String str2) {
        return this.f73438a.getString(str, str2);
    }

    /* renamed from: a */
    public final Boolean mo71346a(String str, Boolean bool) {
        return Boolean.valueOf(this.f73438a.getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: a */
    public final Integer mo71347a(String str, Integer num) {
        return Integer.valueOf(this.f73438a.getInt(str, num.intValue()));
    }

    /* renamed from: b */
    public final void mo71350b(String str, Boolean bool) {
        m91298b().putBoolean(str, bool.booleanValue()).apply();
    }

    /* renamed from: a */
    public final boolean mo71349a(String str, Object obj) {
        if (str == null || obj == null) {
            return false;
        }
        try {
            if (!(obj instanceof String)) {
                return false;
            }
            mo71352b(str, (String) obj);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo71351b(String str, Integer num) {
        m91298b().putInt(str, num.intValue()).apply();
    }

    /* renamed from: b */
    public final void mo71352b(String str, String str2) {
        m91298b().putString(str, str2).apply();
    }
}
