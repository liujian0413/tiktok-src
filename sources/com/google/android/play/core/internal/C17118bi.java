package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.bi */
final class C17118bi implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C17112bc f47831a;

    private C17118bi(C17112bc bcVar) {
        this.f47831a = bcVar;
    }

    /* synthetic */ C17118bi(C17112bc bcVar, byte b) {
        this(bcVar);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f47831a.f47817d.mo15889a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f47831a.m56740c((C17113bd) new C17121bl(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47831a.f47817d.mo15889a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f47831a.m56740c((C17113bd) new C17120bk(this));
    }
}
