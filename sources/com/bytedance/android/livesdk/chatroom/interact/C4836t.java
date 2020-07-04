package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.t */
final /* synthetic */ class C4836t implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomVideoGuestWidget f13783a;

    C4836t(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget) {
        this.f13783a = linkInRoomVideoGuestWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13783a.mo12195a(dialogInterface);
    }
}
