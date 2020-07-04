package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bi */
final /* synthetic */ class C4153bi implements C7326g {

    /* renamed from: a */
    private final C4151bg f12195a;

    /* renamed from: b */
    private final FollowPair f12196b;

    /* renamed from: c */
    private final Context f12197c;

    C4153bi(C4151bg bgVar, FollowPair followPair, Context context) {
        this.f12195a = bgVar;
        this.f12196b = followPair;
        this.f12197c = context;
    }

    public final void accept(Object obj) {
        this.f12195a.mo11710a(this.f12196b, this.f12197c, (IUser) obj);
    }
}
