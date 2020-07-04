package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.livesdk.message.model.C8481ah;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.c */
final /* synthetic */ class C4271c implements Runnable {

    /* renamed from: a */
    private final PlatformMessageHelper f12435a;

    /* renamed from: b */
    private final Room f12436b;

    /* renamed from: c */
    private final C8481ah f12437c;

    C4271c(PlatformMessageHelper platformMessageHelper, Room room, C8481ah ahVar) {
        this.f12435a = platformMessageHelper;
        this.f12436b = room;
        this.f12437c = ahVar;
    }

    public final void run() {
        this.f12435a.lambda$addFollowGuideMessage$0$PlatformMessageHelper(this.f12436b, this.f12437c);
    }
}
