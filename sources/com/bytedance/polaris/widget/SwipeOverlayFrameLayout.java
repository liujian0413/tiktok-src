package com.bytedance.polaris.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    private GestureDetector f33031a;

    /* renamed from: b */
    private C12439a f33032b;

    /* renamed from: c */
    private float f33033c;

    /* renamed from: d */
    private float f33034d;

    /* renamed from: e */
    private boolean f33035e = true;

    /* renamed from: f */
    private boolean f33036f;

    /* renamed from: g */
    private boolean f33037g;

    /* renamed from: com.bytedance.polaris.widget.SwipeOverlayFrameLayout$a */
    public interface C12439a {
        /* renamed from: a */
        boolean mo30213a();

        /* renamed from: b */
        boolean mo30214b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f33036f = z;
    }

    public void setOnSwipeListener(C12439a aVar) {
        this.f33032b = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f33035e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f33037g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m36183a(context);
    }

    /* renamed from: a */
    private void m36183a(Context context) {
        C124381 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SwipeOverlayFrameLayout.this.mo30350a(motionEvent, motionEvent2, f, f2);
            }
        };
        this.f33033c = C9738o.m28708b(context, 45.0f);
        this.f33034d = C9738o.m28708b(context, 65.0f);
        this.f33031a = new GestureDetector(context.getApplicationContext(), r0);
        this.f33031a.setOnDoubleTapListener(null);
        this.f33031a.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f33037g = false;
            }
            if (this.f33037g && this.f33036f) {
                z = true;
            }
            if (!this.f33035e || this.f33031a == null || z || !this.f33031a.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36183a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36183a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo30350a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.f33032b == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > this.f33033c) {
            return false;
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
        float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
        if (abs2 >= abs || abs4 >= abs3) {
            return false;
        }
        if (abs3 > this.f33034d) {
            if (f > 0.0f) {
                z = this.f33032b.mo30213a();
            } else if (f < 0.0f) {
                z = this.f33032b.mo30214b();
            }
        }
        return z;
    }
}
