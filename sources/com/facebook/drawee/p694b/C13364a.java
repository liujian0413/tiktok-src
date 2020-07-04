package com.facebook.drawee.p694b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.facebook.drawee.b.a */
public final class C13364a {

    /* renamed from: a */
    public C13365a f35319a;

    /* renamed from: b */
    final float f35320b;

    /* renamed from: c */
    public boolean f35321c;

    /* renamed from: d */
    boolean f35322d;

    /* renamed from: e */
    long f35323e;

    /* renamed from: f */
    float f35324f;

    /* renamed from: g */
    float f35325g;

    /* renamed from: com.facebook.drawee.b.a$a */
    public interface C13365a {
        /* renamed from: i */
        boolean mo32677i();
    }

    /* renamed from: b */
    public final void mo32676b() {
        this.f35321c = false;
        this.f35322d = false;
    }

    /* renamed from: a */
    public final void mo32674a() {
        this.f35319a = null;
        mo32676b();
    }

    /* renamed from: a */
    public static C13364a m39133a(Context context) {
        return new C13364a(context);
    }

    private C13364a(Context context) {
        this.f35320b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo32674a();
    }

    /* renamed from: a */
    public final boolean mo32675a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f35321c = true;
                this.f35322d = true;
                this.f35323e = motionEvent.getEventTime();
                this.f35324f = motionEvent.getX();
                this.f35325g = motionEvent.getY();
                break;
            case 1:
                this.f35321c = false;
                if (Math.abs(motionEvent.getX() - this.f35324f) > this.f35320b || Math.abs(motionEvent.getY() - this.f35325g) > this.f35320b) {
                    this.f35322d = false;
                }
                if (this.f35322d && motionEvent.getEventTime() - this.f35323e <= ((long) ViewConfiguration.getLongPressTimeout()) && this.f35319a != null) {
                    this.f35319a.mo32677i();
                    break;
                }
            case 2:
                if (Math.abs(motionEvent.getX() - this.f35324f) > this.f35320b || Math.abs(motionEvent.getY() - this.f35325g) > this.f35320b) {
                    this.f35322d = false;
                    break;
                }
            case 3:
                this.f35321c = false;
                break;
        }
        this.f35322d = false;
        return true;
    }
}
