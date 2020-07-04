package com.p280ss.android.image.p878a;

import android.content.Context;
import android.support.p022v4.view.C0978j;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.image.a.e */
public final class C19585e implements OnScaleGestureListener {

    /* renamed from: a */
    public boolean f52968a;

    /* renamed from: b */
    float f52969b;

    /* renamed from: c */
    float f52970c;

    /* renamed from: d */
    private final float f52971d;

    /* renamed from: e */
    private final float f52972e;

    /* renamed from: f */
    private final ScaleGestureDetector f52973f;

    /* renamed from: g */
    private final C19583c f52974g;

    /* renamed from: h */
    private VelocityTracker f52975h;

    /* renamed from: i */
    private int f52976i = -1;

    /* renamed from: j */
    private int f52977j;

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo51761a() {
        return this.f52973f.isInProgress();
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f52974g.mo51757a();
    }

    /* renamed from: b */
    private float m64518b(MotionEvent motionEvent) {
        try {
            return C0978j.m4133c(motionEvent, this.f52977j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    private float m64520c(MotionEvent motionEvent) {
        try {
            return C0978j.m4134d(motionEvent, this.f52977j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: a */
    public final boolean mo51762a(MotionEvent motionEvent) {
        this.f52973f.onTouchEvent(motionEvent);
        int a = C0978j.m4129a(motionEvent);
        m64517a(a, motionEvent);
        m64519b(a, motionEvent);
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f52974g.mo51759a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public C19585e(Context context, C19583c cVar) {
        this.f52973f = new ScaleGestureDetector(context, this);
        this.f52974g = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f52972e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f52971d = (float) viewConfiguration.getScaledTouchSlop();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m64517a(int r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = -1
            r2 = 0
            if (r5 == r0) goto L_0x0037
            r0 = 6
            if (r5 == r0) goto L_0x0013
            switch(r5) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0037;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0039
        L_0x000c:
            int r5 = r6.getPointerId(r2)
            r4.f52976i = r5
            goto L_0x0039
        L_0x0013:
            int r5 = android.support.p022v4.view.C0978j.m4131b(r6)
            int r0 = android.support.p022v4.view.C0978j.m4132b(r6, r5)
            int r3 = r4.f52976i
            if (r0 != r3) goto L_0x0039
            if (r5 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            int r0 = android.support.p022v4.view.C0978j.m4132b(r6, r5)
            r4.f52976i = r0
            float r0 = android.support.p022v4.view.C0978j.m4133c(r6, r5)
            r4.f52969b = r0
            float r5 = android.support.p022v4.view.C0978j.m4134d(r6, r5)
            r4.f52970c = r5
            goto L_0x0039
        L_0x0037:
            r4.f52976i = r1
        L_0x0039:
            int r5 = r4.f52976i
            if (r5 == r1) goto L_0x003f
            int r2 = r4.f52976i
        L_0x003f:
            int r5 = android.support.p022v4.view.C0978j.m4130a(r6, r2)
            r4.f52977j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.p878a.C19585e.m64517a(int, android.view.MotionEvent):void");
    }

    /* renamed from: b */
    private void m64519b(int i, MotionEvent motionEvent) {
        boolean z = false;
        switch (i) {
            case 0:
                this.f52975h = VelocityTracker.obtain();
                if (this.f52975h != null) {
                    this.f52975h.addMovement(motionEvent);
                }
                this.f52969b = m64518b(motionEvent);
                this.f52970c = m64520c(motionEvent);
                this.f52968a = false;
                return;
            case 1:
                if (this.f52968a && this.f52975h != null) {
                    this.f52969b = m64518b(motionEvent);
                    this.f52970c = m64520c(motionEvent);
                    this.f52975h.addMovement(motionEvent);
                    this.f52975h.computeCurrentVelocity(1000);
                    float xVelocity = this.f52975h.getXVelocity();
                    float yVelocity = this.f52975h.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f52972e) {
                        this.f52974g.mo51760a(this.f52969b, this.f52970c, -xVelocity, -yVelocity);
                    }
                }
                if (this.f52975h != null) {
                    this.f52975h.recycle();
                    this.f52975h = null;
                    break;
                }
                break;
            case 2:
                float b = m64518b(motionEvent);
                float c = m64520c(motionEvent);
                float f = b - this.f52969b;
                float f2 = c - this.f52970c;
                if (!this.f52968a) {
                    if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f52971d)) {
                        z = true;
                    }
                    this.f52968a = z;
                }
                if (this.f52968a) {
                    this.f52974g.mo51758a(f, f2);
                    this.f52969b = b;
                    this.f52970c = c;
                    if (this.f52975h != null) {
                        this.f52975h.addMovement(motionEvent);
                        return;
                    }
                }
                break;
            case 3:
                if (this.f52975h != null) {
                    this.f52975h.recycle();
                    this.f52975h = null;
                    return;
                }
                break;
        }
    }
}
