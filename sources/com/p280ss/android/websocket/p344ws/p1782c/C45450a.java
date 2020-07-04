package com.p280ss.android.websocket.p344ws.p1782c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p280ss.android.websocket.p344ws.output.WSHandShakeState;

/* renamed from: com.ss.android.websocket.ws.c.a */
public class C45450a implements C45453d {

    /* renamed from: a */
    private long f117054a = -1;

    /* renamed from: b */
    private final Context f117055b;

    /* renamed from: a */
    public void mo108843a() {
        this.f117054a = -1;
    }

    /* renamed from: b */
    private static long m143666b() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    public C45450a(Context context) {
        this.f117055b = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m143665a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public long mo108842a(WSHandShakeState wSHandShakeState) {
        if (!m143665a(this.f117055b)) {
            return -1;
        }
        if (this.f117054a == -1) {
            this.f117054a = m143666b();
        } else {
            this.f117054a *= 2;
            if (this.f117054a > 120000) {
                this.f117054a = 120000;
            }
        }
        return this.f117054a;
    }
}
