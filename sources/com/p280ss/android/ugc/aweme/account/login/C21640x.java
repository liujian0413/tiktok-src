package com.p280ss.android.ugc.aweme.account.login;

import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.x */
public final class C21640x {
    /* renamed from: b */
    public static void m72455b(boolean z, String str) {
        String str2 = "create_account_next";
        C21102b a = C21102b.m71165a().mo56944a("is_success", z ? 1 : 0);
        String str3 = "enter_method";
        if (C21671bd.m72539g()) {
            str = "pop_up";
        }
        C6907h.m21524a(str2, (Map) a.mo56946a(str3, str).f56672a);
    }

    /* renamed from: c */
    public static void m72456c(boolean z, String str) {
        String str2 = "create_password_next";
        C21102b a = C21102b.m71165a().mo56944a("is_success", z ? 1 : 0);
        String str3 = "enter_method";
        if (C21671bd.m72539g()) {
            str = "pop_up";
        }
        C6907h.m21524a(str2, (Map) a.mo56946a(str3, str).f56672a);
    }

    /* renamed from: a */
    public static void m72454a(boolean z, String str) {
        String str2;
        boolean z2;
        int i;
        if (z) {
            IAccountUserService a = C21671bd.m72520a();
            if (C21671bd.m72539g()) {
                str2 = "pop_up";
            } else {
                str2 = C21592t.f57969a;
            }
            String str3 = "f_age_gate_show";
            C21102b a2 = C21102b.m71165a().mo56946a("enter_method", str2);
            String str4 = "user_is_login";
            boolean z3 = false;
            if (a == null || !a.isLogin()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C21102b a3 = a2.mo56946a(str4, String.valueOf(z2)).mo56946a("is_bind_fb", String.valueOf(C20098b.m66270a().mo53819a("facebook"))).mo56946a("is_bind_gl", String.valueOf(C20098b.m66270a().mo53819a("google")));
            String str5 = "user_mode";
            if (a == null) {
                i = -1;
            } else {
                i = a.getCurUser().getUserMode();
            }
            C21102b a4 = a3.mo56944a(str5, i);
            String str6 = "is_ftc_enable";
            if (C22345t.m73973f() == 1) {
                z3 = true;
            }
            C6907h.m21524a(str3, (Map) a4.mo56946a(str6, String.valueOf(z3)).mo56946a("platform", str).f56672a);
        }
    }

    /* renamed from: a */
    public static void m72453a(boolean z, AgeGateResponse ageGateResponse, String str) {
        String str2;
        int i;
        if (z) {
            String str3 = "f_age_gate_response";
            C21102b a = C21102b.m71165a().mo56946a("platform", str);
            String str4 = "enter_method";
            if (C21671bd.m72539g()) {
                str2 = "pop_up";
            } else {
                str2 = C21592t.f57969a;
            }
            C21102b a2 = a.mo56946a(str4, str2);
            String str5 = "f_mode";
            int i2 = 1;
            int i3 = -1;
            if (ageGateResponse == null || ageGateResponse.getStatus_code() != 0) {
                i = -1;
            } else if (ageGateResponse.is_eligible()) {
                i = 0;
            } else {
                i = 1;
            }
            C21102b a3 = a2.mo56944a(str5, i);
            String str6 = "is_success";
            if (ageGateResponse == null || ageGateResponse.getStatus_code() != 0 || !ageGateResponse.is_eligible()) {
                i2 = 0;
            }
            C21102b a4 = a3.mo56944a(str6, i2);
            String str7 = "error_code";
            if (ageGateResponse != null) {
                i3 = ageGateResponse.getStatus_code();
            }
            C6907h.m21524a(str3, (Map) a4.mo56944a(str7, i3).f56672a);
        }
    }
}
