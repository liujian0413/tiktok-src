package com.google.android.play.core.p275b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.C6525f;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.b */
public abstract class C6507b<StateT> {

    /* renamed from: a */
    public final C6525f f18817a;

    /* renamed from: b */
    private final IntentFilter f18818b;

    /* renamed from: c */
    private final Context f18819c;

    /* renamed from: d */
    private final Set<C6506a<StateT>> f18820d = new HashSet();

    /* renamed from: e */
    private C6508c f18821e = null;

    /* renamed from: f */
    private volatile boolean f18822f = false;

    protected C6507b(C6525f fVar, IntentFilter intentFilter, Context context) {
        this.f18817a = fVar;
        this.f18818b = intentFilter;
        this.f18819c = context;
    }

    /* renamed from: a */
    private final void m20207a() {
        if ((this.f18822f || !this.f18820d.isEmpty()) && this.f18821e == null) {
            this.f18821e = new C6508c(this, 0);
            this.f18819c.registerReceiver(this.f18821e, this.f18818b);
        }
        if (!this.f18822f && this.f18820d.isEmpty() && this.f18821e != null) {
            this.f18819c.unregisterReceiver(this.f18821e);
            this.f18821e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15872a(Context context, Intent intent);

    /* renamed from: a */
    public final synchronized void mo15873a(C6506a<StateT> aVar) {
        this.f18817a.mo15889a("registerListener", new Object[0]);
        this.f18820d.add(aVar);
        m20207a();
    }

    /* renamed from: a */
    public final synchronized void mo15874a(StateT statet) {
        for (C6506a a : this.f18820d) {
            a.mo15871a(statet);
        }
    }

    /* renamed from: a */
    public final synchronized void mo15875a(boolean z) {
        this.f18822f = true;
        m20207a();
    }

    /* renamed from: b */
    public final synchronized void mo15876b(C6506a<StateT> aVar) {
        this.f18817a.mo15889a("unregisterListener", new Object[0]);
        this.f18820d.remove(aVar);
        m20207a();
    }
}
