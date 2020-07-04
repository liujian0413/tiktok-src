package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.j */
final /* synthetic */ class C5316j implements OnClickListener {

    /* renamed from: a */
    private final AbsInteractionFragment f15554a;

    /* renamed from: b */
    private final long f15555b;

    /* renamed from: c */
    private final long f15556c;

    /* renamed from: d */
    private final String f15557d;

    /* renamed from: e */
    private final Runnable f15558e;

    C5316j(AbsInteractionFragment absInteractionFragment, long j, long j2, String str, Runnable runnable) {
        this.f15554a = absInteractionFragment;
        this.f15555b = j;
        this.f15556c = j2;
        this.f15557d = str;
        this.f15558e = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15554a.mo13110a(this.f15555b, this.f15556c, this.f15557d, this.f15558e, dialogInterface, i);
    }
}
