package com.p280ss.android.ugc.aweme.p313im.sdk.arch;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.Widget */
public class Widget implements C0042h, C0043i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f80281a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    private boolean f80282b;

    /* renamed from: c */
    private final C7541d f80283c = C7546e.m23569a(new C30574a(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.Widget$a */
    static final class C30574a extends Lambda implements C7561a<C0044j> {

        /* renamed from: a */
        final /* synthetic */ Widget f80284a;

        C30574a(Widget widget) {
            this.f80284a = widget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0044j invoke() {
            return new C0044j(this.f80284a);
        }
    }

    /* renamed from: a */
    private final C0044j mo82641a() {
        return (C0044j) this.f80283c.getValue();
    }

    /* renamed from: b */
    private void mo82645b() {
        this.f80282b = false;
    }

    /* renamed from: c */
    private void mo82648c() {
        this.f80282b = true;
    }

    public Lifecycle getLifecycle() {
        return mo82641a();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void create() {
        mo82645b();
        mo82641a().mo116a(Event.ON_CREATE);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void destroy() {
        mo82648c();
        mo82641a().mo116a(Event.ON_DESTROY);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void pause() {
        mo82641a().mo116a(Event.ON_PAUSE);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void resume() {
        mo82641a().mo116a(Event.ON_RESUME);
    }

    @C0054q(mo125a = Event.ON_START)
    public final void start() {
        mo82641a().mo116a(Event.ON_START);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void stop() {
        mo82641a().mo116a(Event.ON_STOP);
    }
}
