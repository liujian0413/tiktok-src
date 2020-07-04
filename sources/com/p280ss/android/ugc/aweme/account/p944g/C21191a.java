package com.p280ss.android.ugc.aweme.account.p944g;

import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.g.a */
public final class C21191a implements C21196e {
    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        String str;
        int i;
        int i2;
        if (authResult != null) {
            if (authResult.f32438a) {
                C44985a.m141939a(authResult.f32443f, authResult.f32445h);
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, null, "facebook");
                return;
            }
            String str2 = "";
            LobbyException lobbyException = authResult.f32440c;
            boolean z = false;
            if (lobbyException != null) {
                C7573i.m23582a((Object) lobbyException, "this");
                i = lobbyException.getErrorCode();
                str = lobbyException.getMessage();
            } else {
                str = str2;
                i = 0;
            }
            if (authResult.f32439b) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.CANCEL, null, "facebook");
                C21231d.f57039b.mo57162a(2, "facebook", i, str);
                return;
            }
            C6921a.m21559a((Throwable) authResult.f32440c);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" | ");
            LobbyException lobbyException2 = authResult.f32440c;
            if (!(lobbyException2 == null || lobbyException2.getStackTrace() == null)) {
                LobbyException lobbyException3 = authResult.f32440c;
                if (lobbyException3 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) lobbyException3, "authResult.errorCause!!");
                for (StackTraceElement stackTraceElement : lobbyException3.getStackTrace()) {
                    sb.append(stackTraceElement.toString());
                }
            }
            String sb2 = sb.toString();
            C7573i.m23582a((Object) sb2, "builder.toString()");
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                if (str == null) {
                    C7573i.m23580a();
                }
                if (C7634n.m23776c(charSequence, (CharSequence) "connection", true)) {
                    i2 = -10002;
                    C21537g.m72222a(sb2, "facebook");
                    C21231d.f57039b.mo57162a(1, "facebook", i2, sb2);
                    ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, sb2, "facebook");
                }
            }
            i2 = -10000;
            C21537g.m72222a(sb2, "facebook");
            C21231d.f57039b.mo57162a(1, "facebook", i2, sb2);
            ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, sb2, "facebook");
        }
    }
}
