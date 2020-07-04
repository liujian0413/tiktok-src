package com.bytedance.sdk.account.p645a;

import com.bytedance.sdk.account.utils.C12909b;
import com.p280ss.android.account.C18895c;
import com.p280ss.android.common.applog.AppLog;

/* renamed from: com.bytedance.sdk.account.a.b */
public final class C12714b {

    /* renamed from: com.bytedance.sdk.account.a.b$a */
    public static class C12715a {

        /* renamed from: a */
        public static String f33723a = "https://";

        /* renamed from: b */
        public static String f33724b = "http://";

        /* renamed from: A */
        public static String m36926A() {
            return m36938a("/passport/auth/authorize/");
        }

        /* renamed from: C */
        public static String m36928C() {
            return m36938a("/passport/password/check/");
        }

        /* renamed from: D */
        public static String m36929D() {
            return m36938a("/passport/password/update/");
        }

        /* renamed from: E */
        public static String m36930E() {
            return m36938a("/passport/auth/one_login_by_ticket/");
        }

        /* renamed from: F */
        public static String m36931F() {
            return m36938a("/passport/auth/one_login/");
        }

        /* renamed from: G */
        public static String m36932G() {
            return m36938a("/passport/mobile/bind_login/");
        }

        /* renamed from: H */
        public static String m36933H() {
            return m36938a("/passport/mobile/confirm_qrcode/");
        }

        /* renamed from: I */
        public static String m36934I() {
            return m36938a("/passport/account/logout_others/");
        }

        /* renamed from: J */
        public static String m36935J() {
            return m36938a("/passport/mobile/login_by_ticket/");
        }

        /* renamed from: a */
        public static String m36937a() {
            return m36938a("/passport/mobile/refresh_captcha/");
        }

        /* renamed from: b */
        public static String m36939b() {
            return m36938a("/passport/mobile/send_code/v1/");
        }

        /* renamed from: c */
        public static String m36940c() {
            return m36938a("/passport/mobile/register/");
        }

        /* renamed from: d */
        public static String m36941d() {
            return m36938a("/passport/mobile/login/");
        }

        /* renamed from: e */
        public static String m36942e() {
            return m36938a("/passport/email/login/");
        }

        /* renamed from: f */
        public static String m36943f() {
            return m36938a("/passport/email/register/v2/");
        }

        /* renamed from: g */
        public static String m36944g() {
            return m36938a("/passport/mobile/sms_login/");
        }

        /* renamed from: h */
        public static String m36945h() {
            return m36938a("/passport/mobile/sms_login_only/");
        }

        /* renamed from: i */
        public static String m36946i() {
            return m36938a("/passport/mobile/sms_login_continue/");
        }

        /* renamed from: j */
        public static String m36947j() {
            return m36938a("/passport/password/reset/");
        }

        /* renamed from: k */
        public static String m36948k() {
            return m36938a("/passport/mobile/check_code/");
        }

        /* renamed from: l */
        public static String m36949l() {
            return m36938a("/passport/password/reset_by_ticket/");
        }

        /* renamed from: m */
        public static String m36950m() {
            return m36938a("/passport/email/check_code/");
        }

        /* renamed from: n */
        public static String m36951n() {
            return m36938a("/passport/password/reset_by_email_ticket/");
        }

        /* renamed from: o */
        public static String m36952o() {
            return m36938a("/passport/email/send_code/");
        }

        /* renamed from: p */
        public static String m36953p() {
            return m36938a("/passport/email/register_verify_login/");
        }

        /* renamed from: q */
        public static String m36954q() {
            return m36938a("/passport/user/check_email_registered");
        }

        /* renamed from: r */
        public static String m36955r() {
            return m36938a("/passport/password/change/");
        }

        /* renamed from: s */
        public static String m36956s() {
            return m36938a("/passport/mobile/bind/v2/");
        }

        /* renamed from: t */
        public static String m36957t() {
            return m36938a("/passport/mobile/bind/v1/");
        }

        /* renamed from: u */
        public static String m36958u() {
            return m36938a("/passport/mobile/change/v1/");
        }

        /* renamed from: v */
        public static String m36959v() {
            return m36938a("/passport/password/set/");
        }

        /* renamed from: w */
        public static String m36960w() {
            return m36938a("/passport/mobile/validate_code/v1/");
        }

        /* renamed from: x */
        public static String m36961x() {
            return m36938a("/passport/user/login/");
        }

        /* renamed from: y */
        public static String m36962y() {
            return m36938a("/passport/username/register/");
        }

        /* renamed from: z */
        public static String m36963z() {
            return m36938a("/passport/mobile/send_voice_code/");
        }

        /* renamed from: K */
        private static String m36936K() {
            return C18895c.m61668a().mo50929a();
        }

        /* renamed from: B */
        public static String m36927B() {
            StringBuilder sb = new StringBuilder(m36938a("/passport/account/switch/"));
            AppLog.appendCommonParams(sb, false);
            return sb.toString();
        }

        /* renamed from: a */
        public static String m36938a(String str) {
            C12909b d = C18895c.m61673d();
            if (d == null || !d.mo31393a()) {
                StringBuilder sb = new StringBuilder();
                sb.append(f33723a);
                sb.append(m36936K());
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f33724b);
            sb2.append(m36936K());
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: com.bytedance.sdk.account.a.b$b */
    public static class C12716b {
        /* renamed from: a */
        public static String m36964a() {
            return m36965a("/passport/auth/login/");
        }

        /* renamed from: b */
        public static String m36966b() {
            return m36965a("/passport/auth/login_only/");
        }

        /* renamed from: c */
        public static String m36967c() {
            return m36965a("/passport/auth/register/");
        }

        /* renamed from: d */
        public static String m36968d() {
            return m36965a("/passport/auth/bind/");
        }

        /* renamed from: e */
        public static String m36969e() {
            return m36965a("/passport/user/logout/");
        }

        /* renamed from: f */
        public static String m36970f() {
            return m36965a("/2/user/info/");
        }

        /* renamed from: g */
        public static String m36971g() {
            return m36965a("/passport/account/info/");
        }

        /* renamed from: h */
        private static String m36972h() {
            return C18895c.m61668a().mo50929a();
        }

        /* renamed from: a */
        private static String m36965a(String str) {
            C12909b d = C18895c.m61673d();
            if (d == null || !d.mo31393a()) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(m36972h());
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("http://");
            sb2.append(m36972h());
            sb2.append(str);
            return sb2.toString();
        }
    }
}
