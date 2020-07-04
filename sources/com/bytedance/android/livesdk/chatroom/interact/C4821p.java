package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.p */
final /* synthetic */ class C4821p implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomVideoGuestWidget f13736a;

    /* renamed from: b */
    private final Runnable f13737b;

    C4821p(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget, Runnable runnable) {
        this.f13736a = linkInRoomVideoGuestWidget;
        this.f13737b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13736a.mo12196a(this.f13737b, dialogInterface, i);
    }
}
