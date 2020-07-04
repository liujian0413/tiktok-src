package com.bytedance.ttnet.p670a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.d */
public final class C12938d {

    /* renamed from: a */
    private static volatile C12938d f34226a;

    /* renamed from: b */
    private static final Object f34227b = new Object();

    /* renamed from: d */
    private static volatile SharedPreferences f34228d;

    /* renamed from: c */
    private volatile Context f34229c;

    /* renamed from: e */
    private volatile int f34230e;

    /* renamed from: f */
    private volatile long f34231f;

    /* renamed from: g */
    private volatile int f34232g;

    /* renamed from: h */
    private volatile int f34233h;

    /* renamed from: a */
    public static C12938d m37686a() {
        return f34226a;
    }

    /* renamed from: b */
    public final int mo31434b() {
        return this.f34230e;
    }

    /* renamed from: c */
    public final int mo31435c() {
        return this.f34232g;
    }

    /* renamed from: d */
    public final int mo31436d() {
        return this.f34233h;
    }

    /* renamed from: e */
    public final NetworkType mo31437e() {
        return NetworkUtils.m19550d(this.f34229c);
    }

    /* renamed from: g */
    private SharedPreferences m37689g() {
        if (f34228d == null) {
            f34228d = C7285c.m22838a(this.f34229c, "image_opt_table", 0);
        }
        return f34228d;
    }

    /* renamed from: f */
    private void m37688f() {
        try {
            SharedPreferences g = m37689g();
            this.f34230e = g.getInt("image_opt_switch", 0);
            this.f34231f = g.getLong("image_opt_black_interval", 0);
            this.f34232g = g.getInt("image_opt_failed_times", 0);
            this.f34233h = g.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }

    private C12938d(Context context) {
        if (context != null) {
            this.f34229c = context.getApplicationContext();
        }
        m37688f();
    }

    /* renamed from: a */
    public static C12938d m37687a(Context context) {
        if (f34226a == null) {
            synchronized (f34227b) {
                if (f34226a == null) {
                    f34226a = new C12938d(context);
                }
            }
        }
        return f34226a;
    }

    /* renamed from: a */
    public final void mo31433a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    int optInt = jSONObject.optInt("image_opt_switch", 0);
                    long optLong = jSONObject.optLong("image_opt_black_interval", 0);
                    int optInt2 = jSONObject.optInt("image_opt_failed_times", 0);
                    int optInt3 = jSONObject.optInt("image_opt_limit_count", 0);
                    Editor edit = m37689g().edit();
                    if (optInt != this.f34230e) {
                        edit.putInt("image_opt_switch", optInt);
                    }
                    if (optLong != this.f34231f) {
                        edit.putLong("image_opt_black_interval", optLong);
                    }
                    if (optInt2 != this.f34232g) {
                        edit.putInt("image_opt_failed_times", optInt2);
                    }
                    if (optInt3 != this.f34233h) {
                        edit.putInt("image_opt_limit_count", optInt3);
                    }
                    edit.apply();
                    this.f34230e = optInt;
                    this.f34231f = optLong;
                    this.f34232g = optInt2;
                    this.f34233h = optInt3;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
