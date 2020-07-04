package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.livesdk.C3849aa;

public class LiveMessageRecyclerView extends RecyclerView {

    /* renamed from: M */
    private float f16904M;

    /* renamed from: N */
    private float f16905N;

    /* renamed from: O */
    private float f16906O;

    /* renamed from: P */
    private boolean f16907P = true;

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (C3849aa.f11542b) {
            return 0.0f;
        }
        return super.getBottomFadingEdgeStrength();
    }

    public void setDisableAllowIntercept(boolean z) {
        this.f16907P = z;
    }

    public LiveMessageRecyclerView(Context context) {
        super(context);
    }

    /* renamed from: c */
    private void m18136c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!C3849aa.f11541a || !this.f16907P) {
            this.f16905N = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                ViewParent parent = getParent();
                if (parent != null && this.f16907P) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f16904M = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                this.f16906O = this.f16905N - this.f16904M;
                if (Math.abs(this.f16906O) <= 10.0f || getScrollY() != 0) {
                    m18136c(true);
                } else {
                    m18136c(false);
                }
            }
        } else if (motionEvent.getAction() == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMessageRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
