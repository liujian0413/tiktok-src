package com.p280ss.android.push.daemon.p898a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.ss.android.push.daemon.a.b */
public final class C20011b extends C20009a {

    /* renamed from: c */
    private IBinder f54145c;

    /* renamed from: d */
    private Parcel f54146d;

    /* renamed from: b */
    private boolean m65934b() {
        try {
            if (this.f54145c != null) {
                if (this.f54146d != null) {
                    this.f54145c.transact(34, this.f54146d, null, 0);
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
        if (m65934b() && this.f54142b != null && this.f54142b.f19474c != null) {
            this.f54142b.f19474c.mo16702a();
        }
    }
}
