package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0043i;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.c */
public final class C30738c {

    /* renamed from: a */
    private final C0043i f80484a;

    public C30738c(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        this.f80484a = iVar;
    }

    /* renamed from: a */
    public final BaseChatPanel mo80508a(View view, SessionInfo sessionInfo) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(sessionInfo, "sessionInfo");
        switch (sessionInfo.getChatType()) {
            case 0:
            case 1:
            case 2:
            case 4:
                return new SingleChatPanel(this.f80484a, view, (SingleSessionInfo) sessionInfo);
            case 3:
                return new GroupChatPanel(this.f80484a, view, (GroupSessionInfo) sessionInfo);
            default:
                return new BaseChatPanel(this.f80484a, view, sessionInfo);
        }
    }
}
