package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k */
final /* synthetic */ class C4813k implements OnDismissListener {

    /* renamed from: a */
    private final LinkInRoomVideoAnchorWidget f13712a;

    C4813k(LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget) {
        this.f13712a = linkInRoomVideoAnchorWidget;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13712a.mo12166a(dialogInterface);
    }
}
