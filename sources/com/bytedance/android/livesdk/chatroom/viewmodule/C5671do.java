package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import com.bytedance.ies.sdk.widgets.KVData;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.do */
final /* synthetic */ class C5671do implements C0053p {

    /* renamed from: a */
    private final LiveShareWidget f16756a;

    C5671do(LiveShareWidget liveShareWidget) {
        this.f16756a = liveShareWidget;
    }

    public final void onChanged(Object obj) {
        this.f16756a.mo13921a((KVData) obj);
    }
}
