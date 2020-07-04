package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: com.bytedance.android.live.broadcast.preview.br */
final /* synthetic */ class C2900br implements OnCancelListener {

    /* renamed from: a */
    private final StartLiveFragmentDefault f9127a;

    C2900br(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9127a = startLiveFragmentDefault;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f9127a.mo9557h(dialogInterface);
    }
}
