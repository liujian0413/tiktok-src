package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

public final class bjw {

    /* renamed from: a */
    public boolean f42361a;

    /* renamed from: b */
    private final ExecutorService f42362b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public bjz f42363c;

    public bjw(String str) {
        this.f42362b = bkn.m49086a(str);
    }

    /* renamed from: a */
    public final void mo40800a(bka bka, bjx bjx) {
        Looper myLooper = Looper.myLooper();
        bke.m49060b(myLooper != null);
        bke.m49060b(!this.f42361a);
        this.f42361a = true;
        bjz bjz = new bjz(this, myLooper, bka, bjx, 0);
        this.f42363c = bjz;
        this.f42362b.submit(this.f42363c);
    }

    /* renamed from: a */
    public final void mo40799a() {
        bke.m49060b(this.f42361a);
        this.f42363c.mo40803a();
    }

    /* renamed from: b */
    public final void mo40801b() {
        if (this.f42361a) {
            mo40799a();
        }
        this.f42362b.shutdown();
    }
}
