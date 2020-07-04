package com.bytedance.android.livesdk.chatroom.p220ui;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.utility.C3596c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aj */
final /* synthetic */ class C5187aj implements C7327h {

    /* renamed from: a */
    static final C7327h f15243a = new C5187aj();

    private C5187aj() {
    }

    public final Object apply(Object obj) {
        return ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).convertStickerBean((Effect) obj);
    }
}
