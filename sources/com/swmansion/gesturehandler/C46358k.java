package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ViewConfiguration;

/* renamed from: com.swmansion.gesturehandler.k */
public class C46358k extends C46347b<C46358k> {

    /* renamed from: a */
    public double f119362a;

    /* renamed from: b */
    public double f119363b;

    /* renamed from: p */
    public float f119364p;

    /* renamed from: q */
    public float f119365q;

    /* renamed from: r */
    private ScaleGestureDetector f119366r;

    /* renamed from: s */
    private OnScaleGestureListener f119367s = new OnScaleGestureListener() {
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C46358k.this.f119364p = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d = C46358k.this.f119362a;
            C46358k kVar = C46358k.this;
            double d2 = C46358k.this.f119362a;
            double scaleFactor = (double) scaleGestureDetector.getScaleFactor();
            Double.isNaN(scaleFactor);
            kVar.f119362a = d2 * scaleFactor;
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                C46358k kVar2 = C46358k.this;
                double d3 = C46358k.this.f119362a - d;
                double d4 = (double) timeDelta;
                Double.isNaN(d4);
                kVar2.f119363b = d3 / d4;
            }
            if (Math.abs(C46358k.this.f119364p - scaleGestureDetector.getCurrentSpan()) >= C46358k.this.f119365q && C46358k.this.f119286e == 2) {
                C46358k.this.mo115213f();
            }
            return true;
        }
    };

    public C46358k() {
        mo115195a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115190b() {
        this.f119366r = null;
        this.f119363b = 0.0d;
        this.f119362a = 1.0d;
    }

    /* renamed from: l */
    public final float mo115245l() {
        if (this.f119366r == null) {
            return Float.NaN;
        }
        return this.f119366r.getFocusX();
    }

    /* renamed from: m */
    public final float mo115248m() {
        if (this.f119366r == null) {
            return Float.NaN;
        }
        return this.f119366r.getFocusY();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        if (this.f119286e == 0) {
            Context context = this.f119285d.getContext();
            this.f119363b = 0.0d;
            this.f119362a = 1.0d;
            this.f119366r = new ScaleGestureDetector(context, this.f119367s);
            this.f119365q = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            mo115214g();
        }
        if (this.f119366r != null) {
            this.f119366r.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (this.f119286e != 4 || pointerCount >= 2) {
            if (motionEvent.getActionMasked() == 1) {
                mo115211e();
            }
            return;
        }
        mo115215h();
    }
}
