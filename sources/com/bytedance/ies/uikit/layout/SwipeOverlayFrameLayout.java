package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    private GestureDetector f29976a;

    /* renamed from: b */
    private C11043a f29977b;

    /* renamed from: c */
    private float f29978c;

    /* renamed from: d */
    private float f29979d;

    /* renamed from: e */
    private boolean f29980e = true;

    /* renamed from: f */
    private boolean f29981f;

    /* renamed from: g */
    private boolean f29982g;

    /* renamed from: com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout$a */
    public interface C11043a {
        /* renamed from: a */
        boolean mo26721a();

        /* renamed from: b */
        boolean mo26722b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f29981f = z;
    }

    public void setOnSwipeListener(C11043a aVar) {
        this.f29977b = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f29980e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f29982g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m32373a(context);
    }

    /* renamed from: a */
    private void m32373a(Context context) {
        C110421 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SwipeOverlayFrameLayout.this.mo26714a(motionEvent, motionEvent2, f, f2);
            }
        };
        this.f29978c = C9738o.m28708b(context, 45.0f);
        this.f29979d = C9738o.m28708b(context, 65.0f);
        this.f29976a = new GestureDetector(context.getApplicationContext(), r0);
        this.f29976a.setOnDoubleTapListener(null);
        this.f29976a.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f29982g = false;
            }
            if (this.f29982g && this.f29981f) {
                z = true;
            }
            if (!this.f29980e || this.f29976a == null || z || !this.f29976a.onTouchEvent(motionEvent)) {
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
        m32373a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m32373a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26714a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.f29977b == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > this.f29978c) {
            return false;
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
        float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
        if (abs2 >= abs || abs4 >= abs3) {
            return false;
        }
        if (abs3 > this.f29979d) {
            if (f > 0.0f) {
                z = this.f29977b.mo26722b();
            } else if (f < 0.0f) {
                z = this.f29977b.mo26721a();
            }
        }
        return z;
    }
}
