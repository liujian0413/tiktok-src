package com.bytedance.android.livesdk.chatroom.widget;

import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ah */
final /* synthetic */ class C5785ah implements Runnable {

    /* renamed from: a */
    private final LiveRoomWatchUserWidget f17033a;

    /* renamed from: b */
    private final List f17034b;

    C5785ah(LiveRoomWatchUserWidget liveRoomWatchUserWidget, List list) {
        this.f17033a = liveRoomWatchUserWidget;
        this.f17034b = list;
    }

    public final void run() {
        this.f17033a.mo14257a(this.f17034b);
    }
}
