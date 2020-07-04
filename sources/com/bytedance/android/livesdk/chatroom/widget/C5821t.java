package com.bytedance.android.livesdk.chatroom.widget;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.t */
final /* synthetic */ class C5821t implements Runnable {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f17155a;

    /* renamed from: b */
    private final int f17156b;

    C5821t(LiveRoomUserInfoWidget liveRoomUserInfoWidget, int i) {
        this.f17155a = liveRoomUserInfoWidget;
        this.f17156b = i;
    }

    public final void run() {
        this.f17155a.mo14245b(this.f17156b);
    }
}
