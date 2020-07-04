package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.C15307a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.ah */
final class C15216ah implements ServiceConnection {

    /* renamed from: a */
    public int f39358a = 2;

    /* renamed from: b */
    public boolean f39359b;

    /* renamed from: c */
    public IBinder f39360c;

    /* renamed from: d */
    public ComponentName f39361d;

    /* renamed from: e */
    private final Set<ServiceConnection> f39362e = new HashSet();

    /* renamed from: f */
    private final C15253a f39363f;

    /* renamed from: g */
    private final /* synthetic */ C15215ag f39364g;

    public C15216ah(C15215ag agVar, C15253a aVar) {
        this.f39364g = agVar;
        this.f39363f = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f39364g.f39352a) {
            this.f39364g.f39354c.removeMessages(1, this.f39363f);
            this.f39360c = iBinder;
            this.f39361d = componentName;
            for (ServiceConnection onServiceConnected : this.f39362e) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f39358a = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39364g.f39352a) {
            this.f39364g.f39354c.removeMessages(1, this.f39363f);
            this.f39360c = null;
            this.f39361d = componentName;
            for (ServiceConnection onServiceDisconnected : this.f39362e) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f39358a = 2;
        }
    }

    /* renamed from: a */
    public final void mo38535a(String str) {
        this.f39358a = 3;
        this.f39359b = C15307a.m44542a(this.f39364g.f39353b, str, this.f39363f.mo38602a(this.f39364g.f39353b), this, this.f39363f.f39455c);
        if (this.f39359b) {
            this.f39364g.f39354c.sendMessageDelayed(this.f39364g.f39354c.obtainMessage(1, this.f39363f), this.f39364g.f39357f);
            return;
        }
        this.f39358a = 2;
        try {
            C15307a.m44541a(this.f39364g.f39353b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo38539b(String str) {
        this.f39364g.f39354c.removeMessages(1, this.f39363f);
        C15307a.m44541a(this.f39364g.f39353b, this);
        this.f39359b = false;
        this.f39358a = 2;
    }

    /* renamed from: a */
    public final void mo38534a(ServiceConnection serviceConnection, String str) {
        this.f39363f.mo38602a(this.f39364g.f39353b);
        this.f39362e.add(serviceConnection);
    }

    /* renamed from: b */
    public final void mo38538b(ServiceConnection serviceConnection, String str) {
        this.f39362e.remove(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo38537a(ServiceConnection serviceConnection) {
        return this.f39362e.contains(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo38536a() {
        return this.f39362e.isEmpty();
    }
}
