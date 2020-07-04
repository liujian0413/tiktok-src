package com.p280ss.android.ugc.aweme.followrequest;

import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33276r;

/* renamed from: com.ss.android.ugc.aweme.followrequest.c */
public final class C29865c {
    /* renamed from: a */
    public static void m97666a() {
        C33228ab.m107200a("shield_off").mo85057b("type", "account").mo85252e();
    }

    /* renamed from: b */
    public static void m97669b() {
        C33228ab.m107200a("shield_on").mo85057b("type", "account").mo85252e();
    }

    /* renamed from: c */
    public static void m97671c() {
        C33228ab.m107200a("change_approve").mo85057b("type", "account").mo85252e();
    }

    /* renamed from: a */
    public static void m97667a(String str, String str2) {
        C33228ab.m107200a("follow_approve").mo85057b("enter_from", str).mo85057b("to_user_id", str2).mo85252e();
    }

    /* renamed from: b */
    public static void m97670b(String str, String str2) {
        C33228ab.m107200a("follow_refuse").mo85057b("enter_from", str).mo85057b("to_user_id", str2).mo85058h().mo85252e();
    }

    /* renamed from: a */
    public static void m97668a(String str, String str2, String str3) {
        ((C33276r) new C33276r().mo85310b(str).mo85048a(str3)).mo85322o(str2).mo85252e();
    }
}
