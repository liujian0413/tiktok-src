package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BasePanel */
public abstract class BasePanel implements C0042h, C0043i {

    /* renamed from: l */
    static final /* synthetic */ C7595j[] f80367l = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BasePanel.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: a */
    private boolean f80368a;

    /* renamed from: b */
    private final C7541d f80369b = C7546e.m23569a(new C30608a(this));

    /* renamed from: m */
    public boolean f80370m;

    /* renamed from: n */
    public final C0043i f80371n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.BasePanel$a */
    static final class C30608a extends Lambda implements C7561a<C0044j> {

        /* renamed from: a */
        final /* synthetic */ BasePanel f80372a;

        C30608a(BasePanel basePanel) {
            this.f80372a = basePanel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0044j invoke() {
            return new C0044j(this.f80372a);
        }
    }

    /* renamed from: a */
    private final C0044j mo80380a() {
        return (C0044j) this.f80369b.getValue();
    }

    public Lifecycle getLifecycle() {
        return mo80380a();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f80368a = false;
        mo80380a().mo116a(Event.ON_CREATE);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        mo80380a().mo116a(Event.ON_DESTROY);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f80370m = false;
        mo80380a().mo116a(Event.ON_PAUSE);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f80370m = true;
        mo80380a().mo116a(Event.ON_RESUME);
    }

    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
        mo80380a().mo116a(Event.ON_START);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        this.f80368a = true;
        mo80380a().mo116a(Event.ON_STOP);
    }

    public BasePanel(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        this.f80371n = iVar;
    }
}
