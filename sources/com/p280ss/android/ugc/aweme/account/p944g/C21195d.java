package com.p280ss.android.ugc.aweme.account.p944g;

import android.text.TextUtils;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.d */
public final class C21195d implements C21196e {
    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            if (!authResult.f32438a) {
                LobbyException lobbyException = authResult.f32440c;
                if (lobbyException != null) {
                    C7573i.m23582a((Object) lobbyException, "this");
                    i = lobbyException.getErrorCode();
                    str = lobbyException.getMessage();
                } else {
                    str = null;
                    i = 0;
                }
                if (authResult.f32439b) {
                    ReportTokenResponseUtil.m71735a(TokenResponseStatus.CANCEL, null, "line");
                    C21231d.f57039b.mo57162a(2, "line", i, str);
                    return;
                }
                int i2 = authResult.f32447j.getInt("line_response_ordinal", 0);
                C21537g.m72220a(i2, str, "line");
                TokenResponseStatus tokenResponseStatus = TokenResponseStatus.FAILURE;
                StringBuilder sb = new StringBuilder("Internal error {code = ");
                sb.append(i2);
                sb.append(", desc = ");
                sb.append(str);
                sb.append('}');
                ReportTokenResponseUtil.m71735a(tokenResponseStatus, sb.toString(), "line");
                C21231d.f57039b.mo57162a(1, "line", i2, str);
                C21537g.m72220a(i2, str, "line");
            } else if (!TextUtils.isEmpty(authResult.f32443f)) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, null, "line");
            } else {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, "token = null", "line");
            }
        }
    }
}
