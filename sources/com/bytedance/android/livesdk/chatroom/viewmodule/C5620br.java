package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.br */
final /* synthetic */ class C5620br implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f16684a;

    /* renamed from: b */
    private final Runnable f16685b;

    C5620br(LinkInRoomAudioWidget linkInRoomAudioWidget, Runnable runnable) {
        this.f16684a = linkInRoomAudioWidget;
        this.f16685b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16684a.mo13844a(this.f16685b, dialogInterface, i);
    }
}
