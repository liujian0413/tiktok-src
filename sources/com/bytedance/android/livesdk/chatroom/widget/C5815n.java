package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.n */
final /* synthetic */ class C5815n implements C7326g {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f17149a;

    C5815n(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f17149a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        this.f17149a.mo14247b((FollowPair) obj);
    }
}
