package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ev */
final /* synthetic */ class C5708ev implements OnTouchListener {

    /* renamed from: a */
    private final TextMessageWidget f16802a;

    C5708ev(TextMessageWidget textMessageWidget) {
        this.f16802a = textMessageWidget;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f16802a.mo14013a(view, motionEvent);
    }
}
