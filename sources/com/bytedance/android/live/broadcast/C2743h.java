package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.h */
final /* synthetic */ class C2743h implements OnClickListener {

    /* renamed from: a */
    private final LiveBroadcastFragment f8697a;

    /* renamed from: b */
    private final HashMap f8698b;

    C2743h(LiveBroadcastFragment liveBroadcastFragment, HashMap hashMap) {
        this.f8697a = liveBroadcastFragment;
        this.f8698b = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8697a.mo8778b(this.f8698b, dialogInterface, i);
    }
}
