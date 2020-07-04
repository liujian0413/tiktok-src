package com.bytedance.android.live.broadcast.bgbroadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.g */
final /* synthetic */ class C2495g implements OnClickListener {

    /* renamed from: a */
    private final HashMap f8085a;

    C2495g(HashMap hashMap) {
        this.f8085a = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BgBroadcastFragment.m10243a(this.f8085a, dialogInterface, i);
    }
}
