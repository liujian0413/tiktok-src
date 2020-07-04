package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0040g;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11668r;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class JediViewHolderProxy implements C0042h, C11668r, C11679b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31473a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    public JediViewHolder<? extends C11501d, ?> f31474b;

    /* renamed from: c */
    public C11724d f31475c;

    /* renamed from: d */
    public boolean f31476d;

    /* renamed from: e */
    private boolean f31477e = true;

    /* renamed from: f */
    private boolean f31478f;

    /* renamed from: g */
    private final C7541d<C0040g> f31479g = C7546e.m23569a(C11719b.f31483a);

    /* renamed from: h */
    private boolean f31480h;

    /* renamed from: i */
    private final C7541d f31481i = C7546e.m23569a(new C11718a(this));

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$a */
    static final class C11718a extends Lambda implements C7561a<C0044j> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolderProxy f31482a;

        C11718a(JediViewHolderProxy jediViewHolderProxy) {
            this.f31482a = jediViewHolderProxy;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0044j invoke() {
            return new C0044j(this.f31482a);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$b */
    static final class C11719b extends Lambda implements C7561a<C0040g> {

        /* renamed from: a */
        public static final C11719b f31483a = new C11719b();

        C11719b() {
            super(0);
        }

        /* renamed from: a */
        private static C0040g m34351a() {
            return new C0040g();
        }

        public final /* synthetic */ Object invoke() {
            return m34351a();
        }
    }

    /* renamed from: h */
    private final C0044j m34340h() {
        return (C0044j) this.f31481i.getValue();
    }

    /* renamed from: a */
    public final boolean mo29190a() {
        return this.f31477e;
    }

    /* renamed from: c */
    public final void mo29272c() {
        this.f31478f = false;
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return this;
    }

    /* renamed from: f */
    public final void mo29273f() {
        this.f31478f = true;
    }

    public final Lifecycle getLifecycle() {
        return m34340h();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public JediViewHolder<? extends C11501d, ?> mo29191e() {
        if (this.f31478f) {
            return null;
        }
        return this.f31474b;
    }

    /* renamed from: b */
    public final C0040g mo29232b() {
        return (C0040g) this.f31479g.getValue();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        this.f31476d = false;
        m34340h().mo116a(Event.ON_CREATE);
    }

    @C0054q(mo125a = Event.ON_START)
    public final void onStart() {
        if (mo29191e() != null) {
            mo29270a(true);
        }
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        if (mo29191e() != null) {
            mo29271b(true);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m34340h().mo116a(Event.ON_DESTROY);
        if (this.f31479g.isInitialized()) {
            mo29232b().mo114a();
        }
        this.f31476d = true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Proxy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append('(');
        sb.append("holder@");
        JediViewHolder<? extends C11501d, ?> jediViewHolder = this.f31474b;
        if (jediViewHolder != null) {
            str = Integer.toHexString(jediViewHolder.hashCode());
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",detached:");
        sb.append(this.f31478f);
        sb.append(",state:");
        sb.append(getLifecycle().mo54a());
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo29270a(boolean z) {
        this.f31477e = z;
        if (!z) {
            this.f31480h = true;
        }
        if (this.f31480h) {
            m34340h().mo116a(Event.ON_START);
        }
    }

    /* renamed from: b */
    public final void mo29271b(boolean z) {
        this.f31477e = z;
        m34340h().mo116a(Event.ON_STOP);
    }

    /* renamed from: a */
    public final void mo29269a(C11724d dVar, JediViewHolder<? extends C11501d, ?> jediViewHolder) {
        C7573i.m23587b(dVar, "manager");
        if (jediViewHolder != null) {
            this.f31474b = jediViewHolder;
            jediViewHolder.f31374d = this;
            this.f31478f = false;
            dVar.mo29296a(this);
            return;
        }
        this.f31474b = null;
        JediViewHolder<? extends C11501d, ?> jediViewHolder2 = this.f31474b;
        if (jediViewHolder2 != null) {
            jediViewHolder2.f31374d = null;
        }
    }
}
