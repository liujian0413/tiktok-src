package com.p280ss.android.ugc.aweme.account.login.authorize.platforms;

import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil */
public final class ReportTokenResponseUtil {

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.ReportTokenResponseUtil$TokenResponseStatus */
    public enum TokenResponseStatus {
        SUCCESS,
        FAILURE,
        CANCEL
    }

    /* renamed from: a */
    public static void m71735a(TokenResponseStatus tokenResponseStatus, String str, String str2) {
        int i;
        switch (tokenResponseStatus) {
            case FAILURE:
                i = 0;
                break;
            case CANCEL:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        C6907h.m21524a("token_response", (Map) new C21102b().mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).mo56946a("platform", str2).mo56944a("status", i).mo56946a("fail_info", str).mo56944a("_perf_monitor", 1).f56672a);
    }
}
