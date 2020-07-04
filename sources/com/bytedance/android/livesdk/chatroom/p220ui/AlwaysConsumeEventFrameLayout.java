package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.AlwaysConsumeEventFrameLayout */
public class AlwaysConsumeEventFrameLayout extends FrameLayout {
    public AlwaysConsumeEventFrameLayout(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AlwaysConsumeEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
