package com.p280ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* renamed from: com.ss.android.download.n */
final class C19435n implements C19439q {

    /* renamed from: b */
    private static C19435n f52615b;

    /* renamed from: a */
    private Context f52616a;

    /* renamed from: a */
    public final long mo51469a() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public final Long mo51473d() {
        return C19410c.m63776b(this.f52616a);
    }

    /* renamed from: e */
    public final Long mo51474e() {
        return C19410c.m63779c(this.f52616a);
    }

    /* renamed from: b */
    public final NetworkInfo mo51471b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f52616a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* renamed from: c */
    public final boolean mo51472c() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f52616a.getSystemService("connectivity");
        boolean z2 = false;
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            z = false;
        } else {
            z = true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f52616a.getSystemService("phone");
        if (z && telephonyManager.isNetworkRoaming()) {
            z2 = true;
        }
        return z2;
    }

    private C19435n(Context context) {
        this.f52616a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo51470a(Intent intent) {
        try {
            intent.setClass(this.f52616a, DownloadHandlerService.class);
            this.f52616a.startService(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static synchronized C19435n m63904a(Context context) {
        C19435n nVar;
        synchronized (C19435n.class) {
            if (f52615b == null) {
                f52615b = new C19435n(context);
            }
            nVar = f52615b;
        }
        return nVar;
    }
}
