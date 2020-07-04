package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.user.User;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ch */
final /* synthetic */ class C5637ch implements C7326g {

    /* renamed from: a */
    private final LinkPKMvpWidget f16710a;

    /* renamed from: b */
    private final User f16711b;

    C5637ch(LinkPKMvpWidget linkPKMvpWidget, User user) {
        this.f16710a = linkPKMvpWidget;
        this.f16711b = user;
    }

    public final void accept(Object obj) {
        this.f16710a.mo13866a(this.f16711b, (SpannableStringBuilder) obj);
    }
}
