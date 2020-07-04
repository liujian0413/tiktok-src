package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0961c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.widget.WidgetHost.C13030a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.widget.a */
public final class C13031a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f34475a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C13031a.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroid/support/v4/view/AsyncLayoutInflater;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C13031a.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;"))};

    /* renamed from: e */
    public static final C13033a f34476e = new C13033a(null);

    /* renamed from: b */
    public final CopyOnWriteArrayList<Widget> f34477b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public WidgetHost f34478c;

    /* renamed from: d */
    public final Lifecycle f34479d;

    /* renamed from: f */
    private final C7541d f34480f;

    /* renamed from: g */
    private final C7541d f34481g;

    /* renamed from: h */
    private final HashMap<Widget, ViewGroup> f34482h = new HashMap<>();

    /* renamed from: i */
    private final View f34483i;

    /* renamed from: com.bytedance.widget.a$a */
    public static final class C13033a {
        private C13033a() {
        }

        public /* synthetic */ C13033a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C13031a mo31608a(Fragment fragment, View view) {
            C7573i.m23587b(fragment, "fragment");
            return m38041a((FragmentActivity) null, fragment, view);
        }

        /* renamed from: a */
        public static C13031a m38040a(Lifecycle lifecycle, WidgetHost widgetHost, View view) {
            C7573i.m23587b(lifecycle, "lifecycle");
            C7573i.m23587b(widgetHost, "widgetHost");
            C13031a a = widgetHost.mo31595a(lifecycle);
            if (a != null) {
                return a;
            }
            C13031a aVar = new C13031a(widgetHost, view, lifecycle);
            widgetHost.mo31597a(lifecycle, aVar);
            return aVar;
        }

        /* renamed from: a */
        private static C13031a m38041a(FragmentActivity fragmentActivity, Fragment fragment, View view) {
            WidgetHost a = C13030a.m38031a(null, fragment);
            Lifecycle lifecycle = a.getLifecycle();
            C7573i.m23582a((Object) lifecycle, "it.lifecycle");
            return m38040a(lifecycle, a, view);
        }
    }

    /* renamed from: com.bytedance.widget.a$b */
    static final class C13034b extends Lambda implements C7561a<C0961c> {

        /* renamed from: a */
        final /* synthetic */ WidgetHost f34485a;

        C13034b(WidgetHost widgetHost) {
            this.f34485a = widgetHost;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0961c invoke() {
            return new C0961c(this.f34485a.mo31600b());
        }
    }

    /* renamed from: com.bytedance.widget.a$c */
    static final class C13035c extends Lambda implements C7561a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ WidgetHost f34486a;

        C13035c(WidgetHost widgetHost) {
            this.f34486a = widgetHost;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LayoutInflater invoke() {
            return LayoutInflater.from(this.f34486a.mo31600b());
        }
    }

    /* renamed from: b */
    private final LayoutInflater m38033b() {
        return (LayoutInflater) this.f34481g.getValue();
    }

    /* renamed from: a */
    public final WidgetHost mo31603a() {
        WidgetHost widgetHost = this.f34478c;
        if (widgetHost != null) {
            return widgetHost;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final C13031a mo31605a(Widget widget) {
        C7573i.m23587b(widget, "widget");
        if (this.f34477b.contains(widget)) {
            return this;
        }
        widget.f34456b = mo31603a();
        this.f34477b.add(widget);
        mo31603a().mo31598a(widget);
        this.f34479d.mo55a(widget);
        return this;
    }

    /* renamed from: b */
    public final C13031a mo31607b(Widget widget) {
        C7573i.m23587b(widget, "widget");
        this.f34479d.mo56b(widget);
        switch (C13036b.f34487a[this.f34479d.mo54a().ordinal()]) {
            case 2:
                if (!widget.f34457c) {
                    widget.destroy$widget_release();
                    break;
                }
                break;
            case 3:
                widget.destroy$widget_release();
                break;
            case 4:
                widget.stop$widget_release();
                widget.destroy$widget_release();
                break;
            case 5:
                widget.pause$widget_release();
                widget.stop$widget_release();
                widget.destroy$widget_release();
                break;
        }
        widget.f34456b = null;
        this.f34477b.remove(widget);
        if (this.f34482h.containsKey(widget)) {
            ViewGroup viewGroup = (ViewGroup) this.f34482h.get(widget);
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            viewGroup.removeAllViews();
            this.f34482h.remove(widget);
        }
        mo31603a().mo31601b(widget);
        return this;
    }

    public C13031a(WidgetHost widgetHost, View view, Lifecycle lifecycle) {
        C7573i.m23587b(widgetHost, "widgetHost");
        C7573i.m23587b(lifecycle, "parentLifecycle");
        this.f34483i = view;
        this.f34479d = lifecycle;
        this.f34480f = C7546e.m23569a(new C13034b(widgetHost));
        this.f34481g = C7546e.m23569a(new C13035c(widgetHost));
        this.f34478c = widgetHost;
        widgetHost.mo31599a((C7561a<C7581n>) new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ C13031a f34484a;

            {
                this.f34484a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m38039a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m38039a() {
                for (Widget widget : this.f34484a.f34477b) {
                    C13031a aVar = this.f34484a;
                    C7573i.m23582a((Object) widget, "it");
                    aVar.mo31607b(widget);
                }
                this.f34484a.f34477b.clear();
                this.f34484a.f34478c = null;
            }
        });
    }

    /* renamed from: a */
    public final C13031a mo31604a(int i, Widget widget, boolean z) {
        C7573i.m23587b(widget, "widget");
        if (widget.mo31583h() <= 0) {
            return mo31605a(widget);
        }
        View view = this.f34483i;
        if (view != null) {
            widget.f34456b = mo31603a();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bjm);
            C7573i.m23582a((Object) viewGroup, "container");
            widget.mo31579a(viewGroup);
            this.f34482h.put(widget, viewGroup);
            View inflate = m38033b().inflate(widget.mo31583h(), viewGroup, false);
            C7573i.m23582a((Object) inflate, "syncLayoutInflater.infla…youtId, container, false)");
            mo31606a(widget, viewGroup, inflate);
            return this;
        }
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView".toString());
    }

    /* renamed from: a */
    public final void mo31606a(Widget widget, ViewGroup viewGroup, View view) {
        widget.mo31578a(view);
        viewGroup.addView(view);
        this.f34477b.add(widget);
        mo31603a().mo31598a(widget);
        this.f34479d.mo55a(widget);
    }
}
