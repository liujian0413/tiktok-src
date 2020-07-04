package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4861l;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cg */
final /* synthetic */ class C5636cg implements C7327h {

    /* renamed from: a */
    private final LinkPKMvpWidget f16707a;

    /* renamed from: b */
    private final User f16708b;

    /* renamed from: c */
    private final C4861l f16709c;

    C5636cg(LinkPKMvpWidget linkPKMvpWidget, User user, C4861l lVar) {
        this.f16707a = linkPKMvpWidget;
        this.f16708b = user;
        this.f16709c = lVar;
    }

    public final Object apply(Object obj) {
        return this.f16707a.mo13861a(this.f16708b, this.f16709c, (User) obj);
    }
}
