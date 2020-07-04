package com.bytedance.android.live.broadcast.preview;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;

/* renamed from: com.bytedance.android.live.broadcast.preview.bc */
final /* synthetic */ class C2885bc implements OnClickListener {

    /* renamed from: a */
    private final StartLiveFragmentDefault f9110a;

    /* renamed from: b */
    private final C9312a f9111b;

    C2885bc(StartLiveFragmentDefault startLiveFragmentDefault, C9312a aVar) {
        this.f9110a = startLiveFragmentDefault;
        this.f9111b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9110a.mo9534a(this.f9111b, dialogInterface, i);
    }
}
