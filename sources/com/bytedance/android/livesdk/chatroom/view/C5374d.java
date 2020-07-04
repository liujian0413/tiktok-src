package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.bytedance.android.livesdk.chatroom.view.d */
public final class C5374d extends FrameLayout {
    public final int getLayoutWidth() {
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getWidth() > 0) {
                getLayoutParams().width = childAt.getWidth();
                return childAt.getWidth();
            }
        }
        getLayoutParams().width = -2;
        return 0;
    }

    public C5374d(Context context) {
        super(context);
    }
}
