package com.swmansion.gesturehandler;

import android.view.MotionEvent;

/* renamed from: com.swmansion.gesturehandler.l */
public final class C46360l {

    /* renamed from: a */
    public double f119369a;

    /* renamed from: b */
    public float f119370b;

    /* renamed from: c */
    public float f119371c;

    /* renamed from: d */
    private long f119372d;

    /* renamed from: e */
    private long f119373e;

    /* renamed from: f */
    private double f119374f;

    /* renamed from: g */
    private boolean f119375g;

    /* renamed from: h */
    private int[] f119376h = new int[2];

    /* renamed from: i */
    private C46361a f119377i;

    /* renamed from: com.swmansion.gesturehandler.l$a */
    public interface C46361a {
        /* renamed from: a */
        boolean mo115254a(C46360l lVar);

        /* renamed from: b */
        void mo115255b(C46360l lVar);
    }

    /* renamed from: a */
    public final long mo115252a() {
        return this.f119372d - this.f119373e;
    }

    /* renamed from: b */
    private void m145596b() {
        if (this.f119375g) {
            this.f119375g = false;
            if (this.f119377i != null) {
                this.f119377i.mo115255b(this);
            }
        }
    }

    public C46360l(C46361a aVar) {
        this.f119377i = aVar;
    }

    /* renamed from: b */
    private void m145597b(MotionEvent motionEvent) {
        this.f119373e = this.f119372d;
        this.f119372d = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f119376h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f119376h[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float f = x2 - x;
        float f2 = y2 - y;
        this.f119370b = (x + x2) * 0.5f;
        this.f119371c = (y + y2) * 0.5f;
        double d = -Math.atan2((double) f2, (double) f);
        if (Double.isNaN(this.f119374f)) {
            this.f119369a = 0.0d;
        } else {
            this.f119369a = this.f119374f - d;
        }
        this.f119374f = d;
        if (this.f119369a > 3.141592653589793d) {
            this.f119369a -= 3.141592653589793d;
        } else if (this.f119369a < -3.141592653589793d) {
            this.f119369a += 3.141592653589793d;
        }
        if (this.f119369a > 1.5707963267948966d) {
            this.f119369a -= 3.141592653589793d;
            return;
        }
        if (this.f119369a < -1.5707963267948966d) {
            this.f119369a += 3.141592653589793d;
        }
    }

    /* renamed from: a */
    public final boolean mo115253a(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f119375g = false;
                this.f119376h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f119376h[1] = -1;
                break;
            case 1:
                m145596b();
                break;
            case 2:
                if (this.f119375g) {
                    m145597b(motionEvent);
                    if (this.f119377i != null) {
                        this.f119377i.mo115254a(this);
                        break;
                    }
                }
                break;
            case 5:
                if (!this.f119375g) {
                    this.f119376h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f119375g = true;
                    this.f119373e = motionEvent.getEventTime();
                    this.f119374f = Double.NaN;
                    m145597b(motionEvent);
                    C46361a aVar = this.f119377i;
                    break;
                }
                break;
            case 6:
                if (this.f119375g) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (pointerId == this.f119376h[0] || pointerId == this.f119376h[1]) {
                        m145596b();
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
