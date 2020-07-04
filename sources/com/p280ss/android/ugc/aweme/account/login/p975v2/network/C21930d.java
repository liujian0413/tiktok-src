package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.d */
public final class C21930d {

    /* renamed from: a */
    public static final C21930d f58667a = new C21930d();

    private C21930d() {
    }

    /* renamed from: a */
    public static void m73151a(boolean z, BaseAccountFlowFragment baseAccountFlowFragment) {
        int i;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        String str = "verify_sms_code";
        C21102b a = new C21102b().mo56946a("enter_from", baseAccountFlowFragment.mo58340e()).mo56946a("enter_method", baseAccountFlowFragment.mo58341f());
        String str2 = "status";
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C6907h.m21524a(str, (Map) a.mo56944a(str2, i).f56672a);
    }

    /* renamed from: a */
    public static void m73147a(int i, String str, String str2) {
        int i2;
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C21102b a = new C21102b().mo56946a("enter_from", str).mo56946a("enter_method", str2);
        String str3 = "is_success";
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C6907h.m21524a("email_code_verification_result", (Map) a.mo56944a(str3, i2).mo56944a("error_code", i).f56672a);
    }

    /* renamed from: a */
    public static void m73152a(boolean z, String str, BaseAccountFlowFragment baseAccountFlowFragment) {
        C7573i.m23587b(str, "platform");
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", baseAccountFlowFragment.mo58341f()).mo56946a("enter_from", baseAccountFlowFragment.mo58340e()).mo56946a("enter_type", baseAccountFlowFragment.mo58342g()).mo56944a("is_register", z ? 1 : 0).mo56944a("error_code", 0).mo56946a("platform", str).f56672a);
    }

    /* renamed from: a */
    public static void m73150a(boolean z, int i, String str, BaseAccountFlowFragment baseAccountFlowFragment) {
        C7573i.m23587b(str, "platform");
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("enter_method", baseAccountFlowFragment.mo58341f()).mo56946a("enter_from", baseAccountFlowFragment.mo58340e()).mo56946a("enter_type", baseAccountFlowFragment.mo58342g()).mo56944a("is_register", z ? 1 : 0).mo56944a("error_code", i).mo56946a("platform", str).f56672a);
    }

    /* renamed from: a */
    public static void m73153a(boolean z, String str, BaseAccountFlowFragment baseAccountFlowFragment, boolean z2) {
        C7573i.m23587b(str, "platform");
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C21102b a = new C21102b().mo56946a("enter_method", baseAccountFlowFragment.mo58341f()).mo56946a("enter_from", baseAccountFlowFragment.mo58340e()).mo56946a("enter_type", baseAccountFlowFragment.mo58342g()).mo56946a("platform", str).mo56944a("is_register", z ? 1 : 0).mo56946a("log_pb", C21220e.m71418b(baseAccountFlowFragment.getArguments()));
        if (z2) {
            a.mo56946a("login_from", "reset_password");
        }
        C6907h.m21524a("login_submit", (Map) a.f56672a);
    }

    /* renamed from: a */
    public static void m73154a(boolean z, String str, String str2, String str3, int i) {
        C7573i.m23587b(str, "platform");
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "enterMethod");
        C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", str).mo56946a("enter_from", str2).mo56946a("enter_method", str3).mo56944a("is_success", z ? 1 : 0).mo56944a("error_code", i).f56672a);
    }
}
