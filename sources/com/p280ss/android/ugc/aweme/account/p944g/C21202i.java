package com.p280ss.android.ugc.aweme.account.p944g;

import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.i */
public final class C21202i implements C21196e {
    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        if (authResult != null) {
            int i = 0;
            String str = null;
            LobbyException lobbyException = authResult.f32440c;
            if (lobbyException != null) {
                C7573i.m23582a((Object) lobbyException, "this");
                i = lobbyException.getErrorCode();
                str = lobbyException.getMessage();
            }
            if (authResult.f32438a) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, "", "vk");
            } else if (authResult.f32439b) {
                C21231d.f57039b.mo57162a(2, "vk", i, str);
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.CANCEL, "", "vk");
            } else {
                C21231d.f57039b.mo57162a(1, "vk", i, str);
                C21537g.m72222a(str, "vk");
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, "", "vk");
            }
        }
    }
}
