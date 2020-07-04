package com.bytedance.android.livesdk.chatroom.p220ui;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.br */
final /* synthetic */ class C5224br implements Runnable {

    /* renamed from: a */
    private final LivePlayFragment f15323a;

    /* renamed from: b */
    private final Room f15324b;

    C5224br(LivePlayFragment livePlayFragment, Room room) {
        this.f15323a = livePlayFragment;
        this.f15324b = room;
    }

    public final void run() {
        this.f15323a.mo13271b(this.f15324b);
    }
}
