package com.p280ss.android.ugc.aweme.base.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.C6301a;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.base.utils.g */
public class C6900g implements C6301a {

    /* renamed from: a */
    private NetworkInfo f19574a;

    /* renamed from: b */
    private NetworkType f19575b;

    /* renamed from: com.ss.android.ugc.aweme.base.utils.g$a */
    static class C6902a {

        /* renamed from: a */
        public static final C6900g f19576a = new C6900g();
    }

    /* renamed from: b */
    public static C6900g m21454b() {
        return C6902a.f19576a;
    }

    /* renamed from: a */
    public final NetworkType mo15136a() {
        return this.f19575b;
    }

    /* renamed from: c */
    public final boolean mo16942c() {
        boolean z;
        synchronized (C6900g.class) {
            z = false;
            if (this.f19574a != null && this.f19574a.isAvailable() && 1 == this.f19574a.getType()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo16943d() {
        boolean z;
        synchronized (C6900g.class) {
            if (this.f19574a == null || !this.f19574a.isAvailable()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    private C6900g() {
        this.f19575b = NetworkType.NONE;
        try {
            this.f19574a = ((ConnectivityManager) C6399b.m19921a().getSystemService("connectivity")).getActiveNetworkInfo();
            m21455b(this.f19574a);
            NetworkUtils.m19543a((C6301a) this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo16941a(NetworkInfo networkInfo) {
        synchronized (C6900g.class) {
            this.f19574a = networkInfo;
            m21455b(this.f19574a);
        }
    }

    /* renamed from: b */
    private void m21455b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            this.f19575b = NetworkType.NONE;
            return;
        }
        int type = networkInfo.getType();
        if (1 == type) {
            this.f19575b = NetworkType.WIFI;
        } else if (type == 0) {
            switch (((TelephonyManager) C6399b.m19921a().getSystemService("phone")).getNetworkType()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    this.f19575b = NetworkType.MOBILE_3G;
                    break;
                case 13:
                    break;
            }
            this.f19575b = NetworkType.MOBILE_4G;
            this.f19575b = NetworkType.MOBILE;
        } else {
            this.f19575b = NetworkType.MOBILE;
        }
    }
}
