package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.i */
final /* synthetic */ class C2744i implements OnClickListener {

    /* renamed from: a */
    private final LiveBroadcastFragment f8699a;

    /* renamed from: b */
    private final HashMap f8700b;

    C2744i(LiveBroadcastFragment liveBroadcastFragment, HashMap hashMap) {
        this.f8699a = liveBroadcastFragment;
        this.f8700b = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8699a.mo8770a(this.f8700b, dialogInterface, i);
    }
}
