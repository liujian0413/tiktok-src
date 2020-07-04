package com.p280ss.android.ugc.aweme.friends.invite;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37990ar;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.b */
public final class C30053b {

    /* renamed from: a */
    protected final Context f79029a;

    /* renamed from: b */
    public String f79030b;

    /* renamed from: c */
    public String f79031c;

    /* renamed from: d */
    protected C37990ar f79032d;

    /* renamed from: e */
    private User f79033e;

    public C30053b(Context context) {
        this.f79029a = context;
    }

    /* renamed from: a */
    public final void mo76327a(User user, String str, String str2) {
        this.f79033e = user;
        this.f79030b = str;
        this.f79031c = str2;
        this.f79032d = new C37990ar(this.f79029a, C23323e.m76499a(user.getAvatarMedium()));
    }
}
