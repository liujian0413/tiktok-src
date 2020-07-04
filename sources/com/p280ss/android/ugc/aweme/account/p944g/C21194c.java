package com.p280ss.android.ugc.aweme.account.p944g;

import android.util.Log;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.c */
public final class C21194c implements C21196e {
    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            LobbyException lobbyException = authResult.f32440c;
            if (lobbyException != null) {
                C7573i.m23582a((Object) lobbyException, "this");
                i = lobbyException.getErrorCode();
                str = lobbyException.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (authResult.f32438a) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, null, "kakaotalk");
            } else if (authResult.f32439b) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" | ");
                sb.append(Log.getStackTraceString(authResult.f32440c));
                String sb2 = sb.toString();
                C7573i.m23582a((Object) sb2, "StringBuilder()\n        …              .toString()");
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.CANCEL, sb2, "kakaotalk");
                C21231d.f57039b.mo57162a(2, "kakaotalk", 0, "");
            } else {
                C21231d.f57039b.mo57162a(1, "kakaotalk", i, str);
                C21537g.m72220a(i, str, "kakaotalk");
                StringBuilder sb3 = new StringBuilder("Error code = ");
                sb3.append(i);
                sb3.append(", desc = ");
                sb3.append(str);
                String sb4 = sb3.toString();
                C7573i.m23582a((Object) sb4, "StringBuilder()\n        …              .toString()");
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, sb4, "kakaotalk");
            }
        }
    }
}
