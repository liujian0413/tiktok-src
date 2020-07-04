package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.live.broadcast.t */
final /* synthetic */ class C2981t implements OnDismissListener {

    /* renamed from: a */
    private final StartLiveActivityProxy f9319a;

    C2981t(StartLiveActivityProxy startLiveActivityProxy) {
        this.f9319a = startLiveActivityProxy;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f9319a.mo8835a(dialogInterface);
    }
}
