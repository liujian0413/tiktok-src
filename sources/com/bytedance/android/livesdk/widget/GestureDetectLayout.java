package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

public class GestureDetectLayout extends FrameLayout {

    /* renamed from: a */
    private List<OnTouchListener> f25004a = new ArrayList();

    /* renamed from: b */
    private List<OnTouchListener> f25005b = new ArrayList();

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo22438a(OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f25005b.add(onTouchListener);
        }
    }

    public GestureDetectLayout(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f25004a.size() - 1; size >= 0; size--) {
            ((OnTouchListener) this.f25004a.get(size)).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f25005b.size() - 1; size >= 0; size--) {
            ((OnTouchListener) this.f25005b.get(size)).onTouch(this, motionEvent);
        }
        return true;
    }

    public GestureDetectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GestureDetectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
