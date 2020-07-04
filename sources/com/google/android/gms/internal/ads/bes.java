package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class bes implements ActivityLifecycleCallbacks, OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final Handler f41805a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Context f41806b;

    /* renamed from: c */
    private Application f41807c;

    /* renamed from: d */
    private final PowerManager f41808d;

    /* renamed from: e */
    private final KeyguardManager f41809e;

    /* renamed from: f */
    private final beh f41810f;

    /* renamed from: g */
    private BroadcastReceiver f41811g;

    /* renamed from: h */
    private WeakReference<ViewTreeObserver> f41812h;

    /* renamed from: i */
    private WeakReference<View> f41813i;

    /* renamed from: j */
    private bdw f41814j;

    /* renamed from: k */
    private byte f41815k = -1;

    /* renamed from: l */
    private int f41816l = -1;

    /* renamed from: m */
    private long f41817m = -3;

    public bes(beh beh, View view) {
        this.f41810f = beh;
        this.f41806b = beh.f41760a;
        this.f41808d = (PowerManager) this.f41806b.getSystemService("power");
        this.f41809e = (KeyguardManager) this.f41806b.getSystemService("keyguard");
        if (this.f41806b instanceof Application) {
            this.f41807c = (Application) this.f41806b;
            this.f41814j = new bdw((Application) this.f41806b, this);
        }
        mo40564a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40564a(View view) {
        View view2 = this.f41813i != null ? (View) this.f41813i.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m48564c(view2);
        }
        this.f41813i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m48562b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f41817m = -2;
            return;
        }
        this.f41817m = -3;
    }

    /* renamed from: b */
    private final void m48561b() {
        f41805a.post(new bet(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.f41816l = -1;
        m48562b(view);
        m48563c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f41816l = -1;
        m48563c();
        m48561b();
        m48564c(view);
    }

    /* renamed from: a */
    private final void m48559a(Activity activity, int i) {
        if (this.f41813i != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View peekDecorView = window.peekDecorView();
                View view = (View) this.f41813i.get();
                if (!(view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView())) {
                    this.f41816l = i;
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m48559a(activity, 0);
        m48563c();
    }

    public final void onActivityStarted(Activity activity) {
        m48559a(activity, 0);
        m48563c();
    }

    public final void onActivityResumed(Activity activity) {
        m48559a(activity, 0);
        m48563c();
        m48561b();
    }

    public final void onActivityPaused(Activity activity) {
        m48559a(activity, 4);
        m48563c();
    }

    public final void onActivityStopped(Activity activity) {
        m48563c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m48563c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m48563c();
    }

    public final void onGlobalLayout() {
        m48563c();
    }

    public final void onScrollChanged() {
        m48563c();
    }

    /* renamed from: a */
    public final long mo40563a() {
        if (this.f41817m <= -2 && this.f41813i.get() == null) {
            this.f41817m = -3;
        }
        return this.f41817m;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (r7 == false) goto L_0x006d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m48563c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f41813i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f41813i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0017
            r9.f41817m = r2
            r9.f41815k = r1
            return
        L_0x0017:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x002b
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x002b:
            android.os.PowerManager r7 = r9.f41808d
            if (r7 == 0) goto L_0x003a
            android.os.PowerManager r7 = r9.f41808d
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x003a
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x003a:
            com.google.android.gms.internal.ads.beh r7 = r9.f41810f
            boolean r7 = r7.f41771l
            if (r7 != 0) goto L_0x006e
            android.app.KeyguardManager r7 = r9.f41809e
            if (r7 == 0) goto L_0x006d
            android.app.KeyguardManager r7 = r9.f41809e
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x006d
            android.app.Activity r7 = com.google.android.gms.internal.ads.beq.m48552a(r0)
            if (r7 == 0) goto L_0x0069
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x005a
            r7 = 0
            goto L_0x005e
        L_0x005a:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x005e:
            if (r7 == 0) goto L_0x0069
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0069
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            if (r7 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 != 0) goto L_0x0073
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x0073:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x0081
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x0081:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x008f
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x008f:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f41816l
            if (r5 == r1) goto L_0x0099
            int r0 = r9.f41816l
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x009e:
            byte r0 = r9.f41815k
            if (r0 == r4) goto L_0x00b4
            r9.f41815k = r4
            byte r0 = r9.f41815k
            if (r0 != 0) goto L_0x00ad
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00b2
        L_0x00ad:
            byte r0 = r9.f41815k
            long r0 = (long) r0
            long r0 = r2 - r0
        L_0x00b2:
            r9.f41817m = r0
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bes.m48563c():void");
    }

    /* renamed from: b */
    private final void m48562b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f41812h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f41811g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f41811g = new beu(this);
            this.f41806b.registerReceiver(this.f41811g, intentFilter);
        }
        if (this.f41807c != null) {
            try {
                this.f41807c.registerActivityLifecycleCallbacks(this.f41814j);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m48564c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f41812h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f41812h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f41812h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f41811g
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.f41806b     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.f41811g     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f41811g = r0
        L_0x003a:
            android.app.Application r4 = r3.f41807c
            if (r4 == 0) goto L_0x0046
            android.app.Application r4 = r3.f41807c     // Catch:{ Exception -> 0x0046 }
            com.google.android.gms.internal.ads.bdw r0 = r3.f41814j     // Catch:{ Exception -> 0x0046 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bes.m48564c(android.view.View):void");
    }
}
