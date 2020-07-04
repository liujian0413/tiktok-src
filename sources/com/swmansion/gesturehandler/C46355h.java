package com.swmansion.gesturehandler;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.swmansion.gesturehandler.h */
public class C46355h extends C46347b<C46355h> {

    /* renamed from: a */
    private boolean f119332a;

    /* renamed from: b */
    private boolean f119333b;

    public C46355h() {
        mo115195a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115188a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        this.f119285d.onTouchEvent(obtain);
    }

    /* renamed from: c */
    public final C46355h mo115228c(boolean z) {
        this.f119332a = z;
        return this;
    }

    /* renamed from: d */
    public final C46355h mo115229d(boolean z) {
        this.f119333b = z;
        return this;
    }

    /* renamed from: b */
    public final boolean mo115205b(C46347b bVar) {
        return super.mo115205b(bVar);
    }

    /* renamed from: e */
    public final boolean mo115212e(C46347b bVar) {
        if (!this.f119333b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo115210d(C46347b bVar) {
        if (bVar instanceof C46355h) {
            C46355h hVar = (C46355h) bVar;
            if (hVar.f119286e == 4 && hVar.f119333b) {
                return false;
            }
        }
        boolean z = !this.f119333b;
        int i = this.f119286e;
        int i2 = bVar.f119286e;
        if ((i != 4 || i2 != 4 || !z) && i == 4 && z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        View view = this.f119285d;
        int i = this.f119286e;
        if (motionEvent.getActionMasked() == 1) {
            view.onTouchEvent(motionEvent);
            if ((i == 0 || i == 2) && view.isPressed()) {
                mo115213f();
            }
            mo115215h();
            return;
        }
        if (i == 0 || i == 2) {
            if (this.f119332a) {
                m145560a(view, motionEvent);
                view.onTouchEvent(motionEvent);
                mo115213f();
            } else if (m145560a(view, motionEvent)) {
                view.onTouchEvent(motionEvent);
                mo115213f();
            } else if (i != 2) {
                mo115214g();
            }
        } else if (i == 4) {
            view.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    private static boolean m145560a(View view, MotionEvent motionEvent) {
        if (!(view instanceof ViewGroup) || !((ViewGroup) view).onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
