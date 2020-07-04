package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.C14793ay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@C6505uv
public final class bub implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final long f43577a = ((Long) bym.m50299d().mo41272a(C15585bw.f43839bg)).longValue();

    /* renamed from: b */
    private final Context f43578b;

    /* renamed from: c */
    private Application f43579c;

    /* renamed from: d */
    private final WindowManager f43580d;

    /* renamed from: e */
    private final PowerManager f43581e;

    /* renamed from: f */
    private final KeyguardManager f43582f;

    /* renamed from: g */
    private BroadcastReceiver f43583g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f43584h;

    /* renamed from: i */
    private WeakReference<View> f43585i;

    /* renamed from: j */
    private buh f43586j;

    /* renamed from: k */
    private aeq f43587k = new aeq(f43577a);

    /* renamed from: l */
    private boolean f43588l = false;

    /* renamed from: m */
    private int f43589m = -1;

    /* renamed from: n */
    private final HashSet<buf> f43590n = new HashSet<>();

    /* renamed from: o */
    private final DisplayMetrics f43591o;

    /* renamed from: p */
    private final Rect f43592p;

    public bub(Context context, View view) {
        this.f43578b = context.getApplicationContext();
        this.f43580d = (WindowManager) context.getSystemService("window");
        this.f43581e = (PowerManager) this.f43578b.getSystemService("power");
        this.f43582f = (KeyguardManager) context.getSystemService("keyguard");
        if (this.f43578b instanceof Application) {
            this.f43579c = (Application) this.f43578b;
            this.f43586j = new buh((Application) this.f43578b, this);
        }
        this.f43591o = context.getResources().getDisplayMetrics();
        this.f43592p = new Rect();
        this.f43592p.right = this.f43580d.getDefaultDisplay().getWidth();
        this.f43592p.bottom = this.f43580d.getDefaultDisplay().getHeight();
        View view2 = this.f43585i != null ? (View) this.f43585i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m50093c(view2);
        }
        this.f43585i = new WeakReference<>(view);
        if (view != null) {
            if (C14793ay.m42896b().mo39201a(view)) {
                m50091b(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo41319a(buf buf) {
        this.f43590n.add(buf);
        m50087a(3);
    }

    /* renamed from: b */
    public final void mo41321b(buf buf) {
        this.f43590n.remove(buf);
    }

    /* renamed from: c */
    private final void m50092c() {
        acl.f40003a.post(new buc(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f43589m = -1;
        m50091b(view);
        m50087a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f43589m = -1;
        m50087a(3);
        m50092c();
        m50093c(view);
    }

    /* renamed from: a */
    private final void m50088a(Activity activity, int i) {
        if (this.f43585i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f43585i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f43589m = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m50088a(activity, 0);
        m50087a(3);
        m50092c();
    }

    public final void onActivityStarted(Activity activity) {
        m50088a(activity, 0);
        m50087a(3);
        m50092c();
    }

    public final void onActivityResumed(Activity activity) {
        m50088a(activity, 0);
        m50087a(3);
        m50092c();
    }

    public final void onActivityPaused(Activity activity) {
        m50088a(activity, 4);
        m50087a(3);
        m50092c();
    }

    public final void onActivityStopped(Activity activity) {
        m50087a(3);
        m50092c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m50087a(3);
        m50092c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m50087a(3);
        m50092c();
    }

    public final void onGlobalLayout() {
        m50087a(2);
        m50092c();
    }

    public final void onScrollChanged() {
        m50087a(1);
    }

    /* renamed from: a */
    public final void mo41317a() {
        m50087a(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m50087a(int i) {
        boolean z;
        boolean z2;
        List list;
        int i2 = i;
        if (this.f43590n.size() != 0 && this.f43585i != null) {
            View view = (View) this.f43585i.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    acd.m45778b("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43842bj)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = m50086a(view);
            }
            List list2 = list;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            if (this.f43589m != -1) {
                windowVisibility = this.f43589m;
            }
            boolean z5 = !z4 && acl.m45536a(view, this.f43581e, this.f43582f) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f43587k.mo39263a() && z5 == this.f43588l) {
                return;
            }
            if (z5 || this.f43588l || i2 != 1) {
                bue bue = new bue(C14793ay.m42901g().mo38685b(), this.f43581e.isScreenOn(), view != null ? C14793ay.m42896b().mo39201a(view) : false, view != null ? view.getWindowVisibility() : 8, m50085a(this.f43592p), m50085a(rect), m50085a(rect2), z2, m50085a(rect3), z, m50085a(rect4), this.f43591o.density, z5, list2);
                Iterator it = this.f43590n.iterator();
                while (it.hasNext()) {
                    ((buf) it.next()).mo39036a(bue);
                }
                this.f43588l = z5;
            }
        }
    }

    /* renamed from: a */
    private final Rect m50085a(Rect rect) {
        return new Rect(m50090b(rect.left), m50090b(rect.top), m50090b(rect.right), m50090b(rect.bottom));
    }

    /* renamed from: b */
    private final int m50090b(int i) {
        return (int) (((float) i) / this.f43591o.density);
    }

    /* renamed from: a */
    private final List<Rect> m50086a(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView)) {
                        if (!(view2 instanceof ListView)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(m50085a(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    private final void m50091b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f43584h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f43583g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f43583g = new bud(this);
            C14793ay.m42911q().mo39267a(this.f43578b, this.f43583g, intentFilter);
        }
        if (this.f43579c != null) {
            try {
                this.f43579c.registerActivityLifecycleCallbacks(this.f43586j);
            } catch (Exception e) {
                acd.m45778b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: c */
    private final void m50093c(View view) {
        try {
            if (this.f43584h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f43584h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f43584h = null;
            }
        } catch (Exception e) {
            acd.m45778b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            acd.m45778b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f43583g != null) {
            try {
                C14793ay.m42911q().mo39266a(this.f43578b, this.f43583g);
            } catch (IllegalStateException e3) {
                acd.m45778b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C14793ay.m42898d().mo39089a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f43583g = null;
        }
        if (this.f43579c != null) {
            try {
                this.f43579c.unregisterActivityLifecycleCallbacks(this.f43586j);
            } catch (Exception e5) {
                acd.m45778b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo41318a(long j) {
        this.f43587k.mo39262a(j);
    }

    /* renamed from: b */
    public final void mo41320b() {
        this.f43587k.mo39262a(f43577a);
    }
}
