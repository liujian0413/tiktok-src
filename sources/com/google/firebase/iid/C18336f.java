package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.p751a.C15316b;
import com.google.android.gms.tasks.C17057f;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.iid.f */
public final class C18336f {

    /* renamed from: a */
    private static C18336f f49817a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f49818b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f49819c;

    /* renamed from: d */
    private C18339i f49820d = new C18339i(this);

    /* renamed from: e */
    private int f49821e = 1;

    /* renamed from: a */
    public static synchronized C18336f m60445a(Context context) {
        C18336f fVar;
        synchronized (C18336f.class) {
            if (f49817a == null) {
                f49817a = new C18336f(context, C18337g.m60449a(new C15316b("MessengerIpcClient")));
            }
            fVar = f49817a;
        }
        return fVar;
    }

    private C18336f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f49819c = scheduledExecutorService;
        this.f49818b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C17057f<Void> mo47247a(int i, Bundle bundle) {
        return m60444a((C18346p<T>) new C18345o<T>(m60442a(), 2, bundle));
    }

    /* renamed from: b */
    public final C17057f<Bundle> mo47248b(int i, Bundle bundle) {
        return m60444a((C18346p<T>) new C18347q<T>(m60442a(), 1, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C17057f<T> m60444a(C18346p<T> pVar) {
        if (!this.f49820d.mo47253a((C18346p) pVar)) {
            this.f49820d = new C18339i(this);
            this.f49820d.mo47253a((C18346p) pVar);
        }
        return pVar.f49836b.f47728a;
    }

    /* renamed from: a */
    private final synchronized int m60442a() {
        int i;
        i = this.f49821e;
        this.f49821e = i + 1;
        return i;
    }
}
