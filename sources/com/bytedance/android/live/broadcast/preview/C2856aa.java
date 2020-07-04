package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.broadcast.preview.aa */
final /* synthetic */ class C2856aa implements OnClickListener {

    /* renamed from: a */
    private final StartLiveFragmentD f9082a;

    /* renamed from: b */
    private final String f9083b;

    C2856aa(StartLiveFragmentD startLiveFragmentD, String str) {
        this.f9082a = startLiveFragmentD;
        this.f9083b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9082a.mo9494a(this.f9083b, dialogInterface, i);
    }
}
