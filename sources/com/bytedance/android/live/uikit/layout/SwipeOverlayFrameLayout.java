package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    private GestureDetector f10511a;

    /* renamed from: b */
    private C3538a f10512b;

    /* renamed from: c */
    private float f10513c;

    /* renamed from: d */
    private float f10514d;

    /* renamed from: e */
    private boolean f10515e = true;

    /* renamed from: f */
    private boolean f10516f;

    /* renamed from: g */
    private boolean f10517g;

    /* renamed from: com.bytedance.android.live.uikit.layout.SwipeOverlayFrameLayout$a */
    public interface C3538a {
        /* renamed from: a */
        boolean mo10675a();

        /* renamed from: b */
        boolean mo10676b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f10516f = z;
    }

    public void setOnSwipeListener(C3538a aVar) {
        this.f10512b = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f10515e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f10517g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m13009a(context);
    }

    /* renamed from: a */
    private void m13009a(Context context) {
        C35371 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return SwipeOverlayFrameLayout.this.mo10668a(motionEvent, motionEvent2, f, f2);
            }
        };
        this.f10513c = C9738o.m28708b(context, 45.0f);
        this.f10514d = C9738o.m28708b(context, 65.0f);
        this.f10511a = new GestureDetector(context.getApplicationContext(), r0);
        this.f10511a.setOnDoubleTapListener(null);
        this.f10511a.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f10517g = false;
            }
            if (this.f10517g && this.f10516f) {
                z = true;
            }
            if (!this.f10515e || this.f10511a == null || z || !this.f10511a.onTouchEvent(motionEvent)) {
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
        m13009a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13009a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10668a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (this.f10512b == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > this.f10513c) {
            return false;
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
        float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
        if (abs2 >= abs || abs4 >= abs3) {
            return false;
        }
        if (abs3 > this.f10514d) {
            if (f > 0.0f) {
                z = this.f10512b.mo10676b();
            } else if (f < 0.0f) {
                z = this.f10512b.mo10675a();
            }
        }
        return z;
    }
}
