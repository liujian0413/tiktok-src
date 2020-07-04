package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0961c;
import android.support.p022v4.view.C0961c.C0966d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager */
public class WidgetManager extends Fragment {

    /* renamed from: d */
    private static final String f60926d = WidgetManager.class.getCanonicalName();

    /* renamed from: a */
    public Fragment f60927a;

    /* renamed from: b */
    public DataCenter f60928b;

    /* renamed from: c */
    C0609a f60929c = new C0609a() {
        public final void onFragmentViewDestroyed(C0608j jVar, Fragment fragment) {
            if (fragment == WidgetManager.this.f60927a) {
                jVar.mo2648a(WidgetManager.this.f60929c);
                fragment.getChildFragmentManager().mo2645a().mo2587a((Fragment) WidgetManager.this).mo2610f();
            }
        }
    };

    /* renamed from: e */
    private Thread f60930e;

    /* renamed from: f */
    private Handler f60931f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private C23076a f60932g = new C23076a() {
        /* renamed from: a */
        public final Activity mo60149a() {
            return WidgetManager.this.getActivity();
        }

        /* renamed from: a */
        public final void mo60150a(Intent intent, int i) {
            WidgetManager.this.startActivityForResult(intent, i);
        }
    };

    /* renamed from: h */
    private View f60933h;

    /* renamed from: i */
    private Context f60934i;

    /* renamed from: j */
    private C0961c f60935j;

    /* renamed from: k */
    private LayoutInflater f60936k;

    /* renamed from: l */
    private List<Widget> f60937l = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo60155a(Widget widget, View view, View view2) {
        widget.f60921d = view2;
        if ((view instanceof ViewGroup) && view2 != null) {
            ((ViewGroup) view).addView(view2);
        }
        this.f60937l.add(widget);
        getLifecycle().mo55a(widget);
    }

    /* renamed from: a */
    public final void mo60156a(final Callable callable, boolean z) {
        if (this.f60928b == null || z) {
            try {
                callable.call();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Widget disable AsyncBind:");
                sb.append(z);
                C6921a.m21556a(sb.toString(), e);
            }
        } else {
            this.f60928b.f60908a.getAndIncrement();
            C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    try {
                        callable.call();
                        WidgetManager.this.f60928b.f60908a.getAndDecrement();
                        return null;
                    } catch (Exception e) {
                        C6921a.m21556a("Widget AsyncBind:", e);
                        throw e;
                    } catch (Throwable th) {
                        WidgetManager.this.f60928b.f60908a.getAndDecrement();
                        throw th;
                    }
                }
            }, (Executor) DataCenter.m75850a());
        }
    }

    /* renamed from: a */
    private boolean m75870a() {
        if (this.f60930e == null) {
            this.f60930e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f60930e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final WidgetManager mo60158b(Widget widget) {
        if (widget == null) {
            return this;
        }
        getLifecycle().mo56b(widget);
        switch (getLifecycle().mo54a()) {
            case CREATED:
                widget.onDestroy();
                break;
            case STARTED:
                widget.onStop();
                widget.onDestroy();
                break;
            case RESUMED:
                widget.onPause();
                widget.onStop();
                widget.onDestroy();
                break;
        }
        widget.f60923f = null;
        widget.f60922e = null;
        this.f60937l.remove(widget);
        if (widget.f60920c != widget.f60921d && (widget.f60920c instanceof ViewGroup)) {
            ((ViewGroup) widget.f60920c).removeAllViews();
        }
        return this;
    }

    /* renamed from: a */
    public final WidgetManager mo60153a(DataCenter dataCenter) {
        this.f60928b = dataCenter;
        for (Widget widget : this.f60937l) {
            widget.f60922e = dataCenter;
        }
        return this;
    }

    /* renamed from: a */
    public final WidgetManager mo60154a(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f60923f = this.f60932g;
        widget.f60919b = this.f60934i;
        widget.f60922e = this.f60928b;
        this.f60937l.add(widget);
        getLifecycle().mo55a(widget);
        return this;
    }

    /* renamed from: a */
    public static WidgetManager m75869a(FragmentActivity fragmentActivity, View view) {
        return m75868a(fragmentActivity, null, view, fragmentActivity);
    }

    /* renamed from: a */
    public static WidgetManager m75867a(Fragment fragment, View view) {
        return m75868a(null, fragment, view, fragment.getContext());
    }

    /* renamed from: b */
    public final WidgetManager mo60157b(int i, Widget widget) {
        if (widget == null) {
            return this;
        }
        return mo60152a(this.f60933h.findViewById(i), widget);
    }

    /* renamed from: a */
    public final WidgetManager mo60151a(int i, Widget widget) {
        return m75866a(i, widget, true);
    }

    /* renamed from: a */
    public final WidgetManager mo60152a(View view, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f60923f = this.f60932g;
        widget.f60919b = this.f60934i;
        widget.f60922e = this.f60928b;
        widget.f60921d = view;
        this.f60937l.add(widget);
        if (!m75870a()) {
            this.f60931f.post(new Runnable() {
                public final void run() {
                    WidgetManager.this.getLifecycle().mo55a(widget);
                }
            });
            return this;
        }
        getLifecycle().mo55a(widget);
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Widget a : this.f60937l) {
            a.mo60144a(i, i2, intent);
        }
    }

    /* renamed from: a */
    private WidgetManager m75866a(int i, final Widget widget, boolean z) {
        if (widget == null) {
            return this;
        }
        widget.f60923f = this.f60932g;
        widget.f60919b = this.f60934i;
        widget.f60922e = this.f60928b;
        final ViewGroup viewGroup = (ViewGroup) this.f60933h.findViewById(i);
        widget.f60920c = viewGroup;
        if (widget.mo60147b() == 0) {
            mo60155a(widget, (View) viewGroup, (View) null);
            return this;
        }
        this.f60935j.mo3741a(widget.mo60147b(), viewGroup, new C0966d() {
            public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                if (!WidgetManager.this.mRemoving && !WidgetManager.this.mDetached && WidgetManager.this.getLifecycle().mo54a() != State.DESTROYED) {
                    WidgetManager.this.mo60155a(widget, (View) viewGroup, view);
                }
            }
        });
        return this;
    }

    /* renamed from: a */
    private static WidgetManager m75868a(FragmentActivity fragmentActivity, Fragment fragment, View view, Context context) {
        C0608j jVar;
        if (fragmentActivity != null) {
            jVar = fragmentActivity.getSupportFragmentManager();
        } else if (fragment == null) {
            return null;
        } else {
            jVar = fragment.getChildFragmentManager();
        }
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.f60927a = fragment;
        widgetManager.f60933h = view;
        widgetManager.f60934i = context;
        widgetManager.f60935j = new C0961c(widgetManager.f60934i);
        widgetManager.f60936k = LayoutInflater.from(widgetManager.f60934i);
        if (!(fragment == null || fragment.mFragmentManager == null)) {
            fragment.mFragmentManager.mo2649a(widgetManager.f60929c, false);
        }
        jVar.mo2645a().mo2588a((Fragment) widgetManager, f60926d).mo2610f();
        return widgetManager;
    }
}
