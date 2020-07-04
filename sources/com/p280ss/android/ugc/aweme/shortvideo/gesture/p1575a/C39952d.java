package com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.d */
public abstract class C39952d extends C39946a {

    /* renamed from: h */
    private final float f103747h;

    /* renamed from: i */
    private float f103748i;

    /* renamed from: j */
    protected float f103749j;

    /* renamed from: k */
    protected float f103750k;

    /* renamed from: l */
    protected float f103751l;

    /* renamed from: m */
    protected float f103752m;

    /* renamed from: n */
    public int f103753n;

    /* renamed from: o */
    private float f103754o;

    /* renamed from: p */
    private float f103755p;

    /* renamed from: q */
    private float f103756q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99363a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo99365b(int i, MotionEvent motionEvent);

    public C39952d(Context context) {
        super(context);
        this.f103747h = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99366b(MotionEvent motionEvent) {
        float f;
        super.mo99366b(motionEvent);
        MotionEvent motionEvent2 = this.f103731c;
        this.f103755p = -1.0f;
        this.f103756q = -1.0f;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float f2 = 0.0f;
        if (motionEvent2.getPointerCount() >= 2) {
            f2 = motionEvent2.getX(1);
            f = motionEvent2.getY(1);
        } else {
            f = 0.0f;
        }
        float f3 = f - y;
        this.f103749j = f2 - x;
        this.f103750k = f3;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f2 = motionEvent.getX(1);
            f = motionEvent.getY(1);
        }
        float f4 = f - y2;
        this.f103751l = f2 - x2;
        this.f103752m = f4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo99374c(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        DisplayMetrics displayMetrics = this.f103729a.getResources().getDisplayMetrics();
        this.f103748i = ((float) displayMetrics.widthPixels) - this.f103747h;
        this.f103754o = ((float) displayMetrics.heightPixels) - this.f103747h;
        float f = this.f103747h - ((float) this.f103753n);
        float f2 = this.f103748i + ((float) this.f103753n);
        float f3 = this.f103754o + ((float) this.f103753n);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float a = m127786a(motionEvent, 1);
        float b = m127787b(motionEvent, 1);
        if (rawX < f || rawY < f || rawX > f2 || rawY > f3) {
            z = true;
        } else {
            z = false;
        }
        if (a < f || b < f || a > f2 || b > f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || !z2) && !z && !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static float m127786a(MotionEvent motionEvent, int i) {
        float x = motionEvent.getX() - motionEvent.getRawX();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getX(1) + x;
        }
        return 0.0f;
    }

    /* renamed from: b */
    private static float m127787b(MotionEvent motionEvent, int i) {
        float y = motionEvent.getY() - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            return motionEvent.getY(1) + y;
        }
        return 0.0f;
    }
}
