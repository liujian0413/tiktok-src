package com.bytedance.android.live.broadcast.bgbroadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.f */
final /* synthetic */ class C2494f implements OnClickListener {

    /* renamed from: a */
    private final BgBroadcastFragment f8082a;

    /* renamed from: b */
    private final HashMap f8083b;

    /* renamed from: c */
    private final boolean f8084c;

    C2494f(BgBroadcastFragment bgBroadcastFragment, HashMap hashMap, boolean z) {
        this.f8082a = bgBroadcastFragment;
        this.f8083b = hashMap;
        this.f8084c = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8082a.mo8979a(this.f8083b, this.f8084c, dialogInterface, i);
    }
}
