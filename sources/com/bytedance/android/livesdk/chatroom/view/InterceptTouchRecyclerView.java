package com.bytedance.android.livesdk.chatroom.view;

import android.support.p029v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class InterceptTouchRecyclerView extends RecyclerView {
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getParent() instanceof ViewGroup) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
