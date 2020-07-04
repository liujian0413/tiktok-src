package com.bytedance.android.livesdk.chatroom.p220ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dz */
final /* synthetic */ class C5305dz implements OnEditorActionListener {

    /* renamed from: a */
    private final SimpleInputDialogFragment f15532a;

    C5305dz(SimpleInputDialogFragment simpleInputDialogFragment) {
        this.f15532a = simpleInputDialogFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.f15532a.mo13417a(textView, i, keyEvent);
    }
}
