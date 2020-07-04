package com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.g */
public final class C24585g extends C34028a<User> {
    /* renamed from: a */
    public final void mo64379a(final String str) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
                    return C35731g.m115439a(C35731g.m115449b((String) null, str, 0), false, (String) null);
                }
                return C35731g.m115439a(C35731g.m115448b(str), false, (String) null);
            }
        }, 0);
    }
}
