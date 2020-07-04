package com.bytedance.widget;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.widget.C13031a.C13033a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public class Widget implements C0042h, C0043i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f34455a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;"))};

    /* renamed from: b */
    public WidgetHost f34456b;

    /* renamed from: c */
    public boolean f34457c;

    /* renamed from: d */
    protected ViewGroup f34458d;

    /* renamed from: e */
    public View f34459e;

    /* renamed from: f */
    public boolean f34460f = true;

    /* renamed from: g */
    private final C7541d f34461g = C7546e.m23569a(new C13029b(this));

    /* renamed from: h */
    private final C7541d f34462h = C7546e.m23569a(new C13028a(this));

    /* renamed from: com.bytedance.widget.Widget$a */
    static final class C13028a extends Lambda implements C7561a<C13031a> {

        /* renamed from: a */
        final /* synthetic */ Widget f34463a;

        C13028a(Widget widget) {
            this.f34463a = widget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13031a invoke() {
            return C13033a.m38040a(this.f34463a.getLifecycle(), this.f34463a.mo31590o(), this.f34463a.f34459e);
        }
    }

    /* renamed from: com.bytedance.widget.Widget$b */
    static final class C13029b extends Lambda implements C7561a<C0044j> {

        /* renamed from: a */
        final /* synthetic */ Widget f34464a;

        C13029b(Widget widget) {
            this.f34464a = widget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0044j invoke() {
            return new C0044j(this.f34464a);
        }
    }

    /* renamed from: p */
    private final C0044j mo63300p() {
        return (C0044j) this.f34461g.getValue();
    }

    /* renamed from: h */
    public int mo31583h() {
        return 0;
    }

    /* renamed from: i */
    public void mo31584i() {
        this.f34457c = false;
    }

    /* renamed from: j */
    public void mo31585j() {
    }

    /* renamed from: k */
    public void mo31586k() {
    }

    /* renamed from: l */
    public void mo31587l() {
    }

    /* renamed from: m */
    public void mo31588m() {
        this.f34457c = true;
    }

    public Lifecycle getLifecycle() {
        return mo63300p();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void create$widget_release() {
        mo31584i();
        mo63300p().mo116a(Event.ON_CREATE);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void destroy$widget_release() {
        mo31588m();
        mo63300p().mo116a(Event.ON_DESTROY);
    }

    /* renamed from: g */
    public final ViewGroup mo31582g() {
        ViewGroup viewGroup = this.f34458d;
        if (viewGroup == null) {
            C7573i.m23583a("container");
        }
        return viewGroup;
    }

    /* renamed from: n */
    public final Object mo31589n() {
        return mo31590o().mo31602c();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void pause$widget_release() {
        mo31586k();
        mo63300p().mo116a(Event.ON_PAUSE);
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void resume$widget_release() {
        mo31585j();
        mo63300p().mo116a(Event.ON_RESUME);
    }

    @C0054q(mo125a = Event.ON_START)
    public final void start$widget_release() {
        mo63300p().mo116a(Event.ON_START);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void stop$widget_release() {
        mo31587l();
        mo63300p().mo116a(Event.ON_STOP);
    }

    /* renamed from: o */
    public final WidgetHost mo31590o() {
        WidgetHost widgetHost = this.f34456b;
        if (widgetHost != null) {
            return widgetHost;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo31578a(View view) {
        C7573i.m23587b(view, "contentView");
        this.f34459e = view;
    }

    /* renamed from: a */
    public final void mo31579a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "containerView");
        this.f34458d = viewGroup;
    }
}
