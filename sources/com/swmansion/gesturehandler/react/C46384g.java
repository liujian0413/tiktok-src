package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.C46347b;
import com.swmansion.gesturehandler.C46349d;

/* renamed from: com.swmansion.gesturehandler.react.g */
public final class C46384g {

    /* renamed from: a */
    public final ReactRootView f119421a;

    /* renamed from: b */
    public boolean f119422b;

    /* renamed from: c */
    private final ReactContext f119423c;

    /* renamed from: d */
    private final C46349d f119424d;

    /* renamed from: e */
    private final C46347b f119425e;

    /* renamed from: f */
    private boolean f119426f;

    /* renamed from: com.swmansion.gesturehandler.react.g$a */
    class C46386a extends C46347b {
        /* renamed from: a */
        public final void mo115188a() {
            C46384g.this.f119422b = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            C46384g.this.f119421a.onChildStartedNativeGesture(obtain);
        }

        private C46386a() {
        }

        /* renamed from: a */
        public final void mo115189a(MotionEvent motionEvent) {
            if (this.f119286e == 0) {
                mo115214g();
                C46384g.this.f119422b = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                mo115215h();
            }
        }
    }

    /* renamed from: a */
    public final void mo115307a() {
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f119423c.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().mo115306b(this.f119425e.f119284c);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    /* renamed from: b */
    public final void mo115311b() {
        if (this.f119425e != null && this.f119425e.f119286e == 2) {
            this.f119425e.mo115213f();
            this.f119425e.mo115215h();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.ViewGroup, code=android.view.ViewParent, for r3v0, types: [android.view.ViewParent, java.lang.Object, android.view.ViewGroup] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.react.ReactRootView m145707a(android.view.ViewParent r3) {
        /*
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r0 = r3
        L_0x0004:
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0 instanceof com.facebook.react.ReactRootView
            if (r1 != 0) goto L_0x000f
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0004
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            com.facebook.react.ReactRootView r0 = (com.facebook.react.ReactRootView) r0
            return r0
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " has not been mounted under ReactRootView"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.C46384g.m145707a(android.view.ViewGroup):com.facebook.react.ReactRootView");
    }

    /* renamed from: a */
    public final void mo115309a(boolean z) {
        if (this.f119424d != null && !this.f119426f) {
            mo115311b();
        }
    }

    /* renamed from: a */
    public final boolean mo115310a(MotionEvent motionEvent) {
        this.f119426f = true;
        this.f119424d.mo115223a(motionEvent);
        this.f119426f = false;
        if (this.f119422b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115308a(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    C46384g.this.mo115311b();
                }
            });
        }
    }

    public C46384g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id > 0) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            C46383f registry = rNGestureHandlerModule.getRegistry();
            this.f119421a = m145707a(viewGroup);
            this.f119423c = reactContext;
            this.f119424d = new C46349d(viewGroup, registry, new C46389j());
            this.f119424d.f119311a = 0.1f;
            this.f119425e = new C46386a();
            this.f119425e.f119284c = -id;
            registry.mo115304a(this.f119425e);
            registry.mo115305a(this.f119425e.f119284c, id);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        StringBuilder sb = new StringBuilder("Expect view tag to be set for ");
        sb.append(viewGroup);
        throw new IllegalStateException(sb.toString());
    }
}
