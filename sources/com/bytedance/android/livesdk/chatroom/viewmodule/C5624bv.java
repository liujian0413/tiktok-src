package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bv */
final /* synthetic */ class C5624bv implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f16689a;

    C5624bv(LinkInRoomAudioWidget linkInRoomAudioWidget) {
        this.f16689a = linkInRoomAudioWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16689a.mo13843a(dialogInterface);
    }
}
