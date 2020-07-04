package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cg */
final /* synthetic */ class C5240cg implements OnClickListener {

    /* renamed from: a */
    private final LiveProfileDetailFragment f15339a;

    /* renamed from: b */
    private final String f15340b;

    C5240cg(LiveProfileDetailFragment liveProfileDetailFragment, String str) {
        this.f15339a = liveProfileDetailFragment;
        this.f15340b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15339a.mo13307a(this.f15340b, dialogInterface, i);
    }
}
