package com.bytedance.android.p089a.p090a.p092b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;

/* renamed from: com.bytedance.android.a.a.b.b */
public final class C2213b implements C2212a {

    /* renamed from: a */
    private Context f7449a;

    /* renamed from: b */
    private String f7450b;

    /* renamed from: c */
    private SharedPreferences f7451c;

    /* renamed from: d */
    private Editor f7452d;

    /* renamed from: b */
    public final C2212a mo7945b() {
        m9537d().clear();
        return this;
    }

    /* renamed from: c */
    public final void mo7946c() {
        m9537d().apply();
    }

    /* renamed from: d */
    private Editor m9537d() {
        if (this.f7452d == null) {
            synchronized (this) {
                if (this.f7452d == null) {
                    this.f7452d = m9538e().edit();
                }
            }
        }
        return this.f7452d;
    }

    /* renamed from: e */
    private SharedPreferences m9538e() {
        if (this.f7451c == null) {
            synchronized (this) {
                if (this.f7451c == null) {
                    this.f7451c = C7285c.m22838a(this.f7449a, this.f7450b, 0);
                }
            }
        }
        return this.f7451c;
    }

    /* renamed from: a */
    public final Map<String, ?> mo7943a() {
        return m9538e().getAll();
    }

    /* renamed from: a */
    public final C2212a mo7940a(String str) {
        m9537d().remove(str);
        return this;
    }

    public C2213b(Context context, String str) {
        this.f7449a = context;
        this.f7450b = str;
    }

    /* renamed from: a */
    public final C2212a mo7941a(String str, int i) {
        m9537d().putInt(str, 2);
        return this;
    }

    /* renamed from: b */
    public final int mo7944b(String str, int i) {
        return m9538e().getInt(str, 0);
    }

    /* renamed from: a */
    public final C2212a mo7942a(String str, String str2) {
        m9537d().putString(str, str2);
        return this;
    }
}
