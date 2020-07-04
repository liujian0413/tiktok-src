package com.bytedance.android.livesdk.utils.p425a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.C9048ao;

/* renamed from: com.bytedance.android.livesdk.utils.a.e */
final class C9027e {

    /* renamed from: d */
    private static C9027e f24683d;

    /* renamed from: e */
    private static Context f24684e;

    /* renamed from: a */
    public boolean f24685a;

    /* renamed from: b */
    public long f24686b;

    /* renamed from: c */
    public long f24687c;

    /* renamed from: f */
    private final String f24688f;

    /* renamed from: g */
    private final long f24689g;

    /* renamed from: h */
    private ConnectivityManager f24690h;

    /* renamed from: i */
    private long f24691i;

    /* renamed from: c */
    private long m26974c() {
        if (this.f24685a) {
            return SystemClock.elapsedRealtime() - this.f24687c;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final long mo22227b() {
        if (!this.f24685a) {
            return C9048ao.m27015a();
        }
        return this.f24686b + m26974c();
    }

    /* renamed from: a */
    public final boolean mo22226a() {
        NetworkInfo networkInfo;
        if (TextUtils.isEmpty(this.f24688f)) {
            return false;
        }
        synchronized (this) {
            if (this.f24690h == null) {
                this.f24690h = (ConnectivityManager) f24684e.getSystemService("connectivity");
            }
        }
        if (this.f24690h == null) {
            networkInfo = null;
        } else {
            networkInfo = this.f24690h.getActiveNetworkInfo();
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        C9028f fVar = new C9028f();
        if (!fVar.mo22228a(this.f24688f, (int) this.f24689g)) {
            return false;
        }
        this.f24685a = true;
        this.f24686b = fVar.f24692a;
        this.f24687c = fVar.f24693b;
        this.f24691i = fVar.f24694c / 2;
        return true;
    }

    private C9027e(String str, long j) {
        this.f24688f = str;
        this.f24689g = j;
    }

    /* renamed from: a */
    public static synchronized C9027e m26973a(Context context, String str, long j) {
        C9027e eVar;
        synchronized (C9027e.class) {
            if (f24683d == null) {
                f24683d = new C9027e(str, 500);
                f24684e = context.getApplicationContext();
            }
            eVar = f24683d;
        }
        return eVar;
    }
}
