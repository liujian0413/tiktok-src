package com.p280ss.android.ugc.aweme.account.p944g;

import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil;
import com.p280ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil.TokenResponseStatus;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.b */
public final class C21192b implements C21196e {

    /* renamed from: a */
    public static final List<Integer> f56975a = C7525m.m23464b((T[]) new Integer[]{Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(12501), Integer.valueOf(12502)});

    /* renamed from: b */
    public static final C21193a f56976b = new C21193a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.g.b$a */
    static final class C21193a {
        private C21193a() {
        }

        public /* synthetic */ C21193a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo57131a(AuthResult authResult) {
        if (authResult != null) {
            String str = null;
            if (authResult.f32438a) {
                ReportTokenResponseUtil.m71735a(TokenResponseStatus.SUCCESS, null, "google");
                return;
            }
            int i = 0;
            LobbyException lobbyException = authResult.f32440c;
            if (lobbyException != null) {
                C7573i.m23582a((Object) lobbyException, "this");
                i = lobbyException.getProviderErrorCode();
                lobbyException.getErrorCode();
                str = lobbyException.getMessage();
            }
            if (authResult.f32439b || f56975a.contains(Integer.valueOf(i))) {
                C21231d.f57039b.mo57162a(2, "google", i, str);
                return;
            }
            C21537g.m72220a(i, str, "google");
            C21231d.f57039b.mo57162a(1, "google", i, str);
            TokenResponseStatus tokenResponseStatus = TokenResponseStatus.FAILURE;
            StringBuilder sb = new StringBuilder("googleErrorCode: ");
            sb.append(i);
            sb.append(", errorDesc: ");
            sb.append(str);
            ReportTokenResponseUtil.m71735a(tokenResponseStatus, sb.toString(), "google");
        }
    }
}
