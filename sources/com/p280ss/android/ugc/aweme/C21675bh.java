package com.p280ss.android.ugc.aweme;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;

/* renamed from: com.ss.android.ugc.aweme.bh */
public final class C21675bh implements C21662av {
    /* renamed from: a */
    public final void mo57921a(Aweme aweme, boolean z, String str) throws Exception {
        String str2;
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            str2 = C35731g.m115449b((String) null, aweme.getAuthorUid(), 0);
        } else {
            str2 = C35731g.m115448b(aweme.getAuthorUid());
        }
        C35731g.m115447b(str2, true, str);
    }

    /* renamed from: a */
    public final void mo57922a(boolean z, String str, String str2, int i, long j, int i2, String str3) throws Exception {
        AwemeApi.m115425a(true, str, str2, 0, 0, 20, str3);
    }
}
