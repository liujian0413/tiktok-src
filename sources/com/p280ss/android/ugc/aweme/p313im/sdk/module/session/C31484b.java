package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31517b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.C6966a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.b */
final /* synthetic */ class C31484b implements C6966a {

    /* renamed from: a */
    private final C31517b f82460a;

    /* renamed from: b */
    private final BaseContent f82461b;

    /* renamed from: c */
    private final Message f82462c;

    C31484b(C31517b bVar, BaseContent baseContent, Message message) {
        this.f82460a = bVar;
        this.f82461b = baseContent;
        this.f82462c = message;
    }

    /* renamed from: a */
    public final void mo18035a(IMUser iMUser) {
        C31482a.m102382a(this.f82460a, this.f82461b, this.f82462c, iMUser);
    }
}
