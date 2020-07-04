package com.p280ss.android.push.daemon.p898a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.ss.android.push.daemon.a.c */
public final class C20012c extends C20009a {

    /* renamed from: c */
    private IBinder f54147c;

    /* renamed from: d */
    private Parcel f54148d;

    /* renamed from: b */
    private boolean m65936b() {
        try {
            if (this.f54147c != null) {
                if (this.f54148d != null) {
                    this.f54147c.transact(14, this.f54148d, null, 0);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo53591a() {
        try {
            if (!(!m65936b() || this.f54142b == null || this.f54142b.f19474c == null)) {
                this.f54142b.f19474c.mo16702a();
            }
        } catch (Throwable unused) {
        }
    }
}
