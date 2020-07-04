package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.k */
final /* synthetic */ class C5317k implements OnClickListener {

    /* renamed from: a */
    private final Runnable f15559a;

    C5317k(Runnable runnable) {
        this.f15559a = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbsInteractionFragment.m16246a(this.f15559a, dialogInterface, i);
    }
}
