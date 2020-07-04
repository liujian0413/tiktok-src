package com.bytedance.android.live.core.utils;

import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.bytedance.android.live.uikit.p176d.C3519c;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.live.core.utils.z */
public final class C3416z extends SimpleOnGestureListener {

    /* renamed from: a */
    public final C7486b<Object> f10216a = C7486b.m23223a();

    /* renamed from: b */
    public final C7486b<Object> f10217b = C7486b.m23223a();

    /* renamed from: c */
    GestureDetector f10218c = new GestureDetector(this);

    /* renamed from: d */
    private boolean f10219d;

    /* renamed from: e */
    private float f10220e;

    /* renamed from: f */
    private float f10221f;

    /* renamed from: a */
    private void m12676a() {
        this.f10219d = false;
        this.f10220e = 0.0f;
        this.f10221f = 0.0f;
    }

    /* renamed from: a */
    public final void mo10313a(MotionEvent motionEvent) {
        this.f10218c.onTouchEvent(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        m12676a();
        return super.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7486b<Object> bVar;
        C7486b<Object> bVar2;
        if (motionEvent == null || motionEvent2 == null || this.f10219d) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(motionEvent2.getY() - motionEvent.getY()) >= 100.0f || Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
            return false;
        }
        this.f10219d = true;
        if (this.f10220e < 0.0f) {
            if (C3519c.m12965a(C3358ac.m12528e())) {
                bVar2 = this.f10216a;
            } else {
                bVar2 = this.f10217b;
            }
            bVar2.onNext(motionEvent2);
        } else {
            if (C3519c.m12965a(C3358ac.m12528e())) {
                bVar = this.f10217b;
            } else {
                bVar = this.f10216a;
            }
            bVar.onNext(motionEvent2);
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7486b<Object> bVar;
        C7486b<Object> bVar2;
        if (motionEvent == null || motionEvent2 == null || this.f10219d) {
            return false;
        }
        this.f10220e += f;
        this.f10221f += f2;
        if (Math.abs(this.f10220e) <= Math.abs(this.f10221f) * 2.0f || Math.abs(this.f10220e) <= 250.0f) {
            return false;
        }
        this.f10219d = true;
        if (this.f10220e < 0.0f) {
            if (C3519c.m12965a(C3358ac.m12528e())) {
                bVar2 = this.f10216a;
            } else {
                bVar2 = this.f10217b;
            }
            bVar2.onNext(motionEvent2);
        } else {
            if (C3519c.m12965a(C3358ac.m12528e())) {
                bVar = this.f10217b;
            } else {
                bVar = this.f10216a;
            }
            bVar.onNext(motionEvent2);
        }
        return true;
    }
}
