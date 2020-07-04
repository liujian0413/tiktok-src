package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.broadcast.preview.bl */
final /* synthetic */ class C2894bl implements OnClickListener {

    /* renamed from: a */
    private final StartLiveFragmentDefault f9120a;

    /* renamed from: b */
    private final String f9121b;

    C2894bl(StartLiveFragmentDefault startLiveFragmentDefault, String str) {
        this.f9120a = startLiveFragmentDefault;
        this.f9121b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9120a.mo9536a(this.f9121b, dialogInterface, i);
    }
}
