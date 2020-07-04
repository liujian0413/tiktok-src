package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.p275b.C6507b;

/* renamed from: com.google.android.play.core.splitinstall.x */
public final class C6575x extends C6507b<C6563f> {

    /* renamed from: b */
    private static C6575x f18899b;

    /* renamed from: c */
    private final Handler f18900c;

    /* renamed from: d */
    private final C6567p f18901d;

    private C6575x(Context context) {
        this(context, C6566n.m20393a());
    }

    private C6575x(Context context, C6567p pVar) {
        super(new C6525f("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f18900c = new Handler(Looper.getMainLooper());
        this.f18901d = pVar;
    }

    /* renamed from: a */
    public static synchronized C6575x m20415a(Context context) {
        C6575x xVar;
        synchronized (C6575x.class) {
            if (f18899b == null) {
                f18899b = new C6575x(context);
            }
            xVar = f18899b;
        }
        return xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20416a(C6563f fVar, int i, int i2) {
        this.f18900c.post(new C6574w(this, fVar, i, i2));
    }

    /* renamed from: a */
    public final void mo15872a(Context context, Intent intent) {
        C6563f a = C6563f.m20385a(intent.getBundleExtra("session_state"));
        this.f18817a.mo15891b("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        if (a.f18875b != 3 || this.f18901d == null) {
            mo15874a(a);
        } else {
            this.f18901d.mo15885a(a.f18880g, new C6568q(this, a, intent, context));
        }
    }
}
