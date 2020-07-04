package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9499a;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.d */
final /* synthetic */ class C4272d implements Runnable {

    /* renamed from: a */
    private final PlatformMessageHelper f12438a;

    /* renamed from: b */
    private final Room f12439b;

    /* renamed from: c */
    private final C9499a f12440c;

    C4272d(PlatformMessageHelper platformMessageHelper, Room room, C9499a aVar) {
        this.f12438a = platformMessageHelper;
        this.f12439b = room;
        this.f12440c = aVar;
    }

    public final void run() {
        this.f12438a.lambda$addFollowGuideMessage$1$PlatformMessageHelper(this.f12439b, this.f12440c);
    }
}
