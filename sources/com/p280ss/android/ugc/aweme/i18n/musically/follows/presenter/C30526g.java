package com.p280ss.android.ugc.aweme.i18n.musically.follows.presenter;

import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.follows.presenter.g */
final class C30526g extends C30521c {
    C30526g(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<User> mo80230a(C30520b bVar) {
        return bVar.f80201a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C30520b mo80229a(String str, long j, int i, int i2) throws Exception {
        return FollowFollowerApi.m99657a(str, j, i, i2);
    }
}
