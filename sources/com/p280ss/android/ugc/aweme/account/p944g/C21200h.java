package com.p280ss.android.ugc.aweme.account.p944g;

import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.h */
public final class C21200h implements C21196e {

    /* renamed from: a */
    public static final String[] f56980a = {"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"};

    /* renamed from: b */
    public static final C21201a f56981b = new C21201a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.g.h$a */
    static final class C21201a {
        private C21201a() {
        }

        public /* synthetic */ C21201a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            if (authResult.f32438a) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, null, "twitter");
                return;
            }
            LobbyException lobbyException = authResult.f32440c;
            if (lobbyException != null) {
                C7573i.m23582a((Object) lobbyException, "this");
                i = lobbyException.getErrorCode();
                str = lobbyException.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (C7519g.m23440b((T[]) f56980a, str)) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.CANCEL, null, "twitter");
                C21231d.f57039b.mo57162a(2, "twitter", i, str);
                return;
            }
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
            C21537g.m72222a(sb2, "twitter");
            C21231d.f57039b.mo57162a(1, "twitter", -10000, sb2);
            ReportTokenResponseUtil.m71735a(TokenResponseStatus.FAILURE, sb2, "twitter");
        }
    }
}
