package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.NoTouchRecyclerView */
public class NoTouchRecyclerView extends RecyclerView {
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NoTouchRecyclerView(Context context) {
        super(context);
    }

    public NoTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoTouchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
