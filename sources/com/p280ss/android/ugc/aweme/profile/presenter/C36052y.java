package com.p280ss.android.ugc.aweme.profile.presenter;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.y */
final /* synthetic */ class C36052y implements Callable {

    /* renamed from: a */
    private final UserResponse f94288a;

    C36052y(UserResponse userResponse) {
        this.f94288a = userResponse;
    }

    public final Object call() {
        return C6921a.m21552a(4, "aweme/v1/user", C10944e.m32113a().mo15979b((Object) this.f94288a));
    }
}
