package com.bytedance.android.livesdk.chatroom.p220ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bo */
final /* synthetic */ class C5221bo implements OnKeyListener {

    /* renamed from: a */
    private final LiveInputDialogFragment f15317a;

    C5221bo(LiveInputDialogFragment liveInputDialogFragment) {
        this.f15317a = liveInputDialogFragment;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.f15317a.mo13248a(view, i, keyEvent);
    }
}
