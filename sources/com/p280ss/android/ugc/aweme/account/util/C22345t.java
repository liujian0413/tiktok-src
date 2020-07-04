package com.p280ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse;
import com.p280ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse.SettingInfo;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.util.t */
public final class C22345t {

    /* renamed from: a */
    private static int f59611a = -1;

    /* renamed from: a */
    public static boolean m73962a() {
        return m73988n().getBoolean("enable_passport_service_switch", true);
    }

    /* renamed from: b */
    public static boolean m73965b() {
        return m73988n().getBoolean("is_accept_term_privacy_new", false);
    }

    /* renamed from: c */
    public static boolean m73968c() {
        return m73988n().getBoolean("ftc_age_gate_response_eligible", true);
    }

    /* renamed from: d */
    public static boolean m73970d() {
        return m73988n().getBoolean("user_has_password", false);
    }

    /* renamed from: e */
    public static int m73971e() {
        return m73988n().getInt("disable_age_gate", 1);
    }

    /* renamed from: g */
    public static boolean m73976g() {
        return m73988n().getBoolean("ftc_age_gate_response_prompt", true);
    }

    /* renamed from: h */
    public static boolean m73978h() {
        return m73988n().getBoolean("ftc_delete_video_alert_showing", false);
    }

    /* renamed from: i */
    public static String m73979i() {
        return m73988n().getString("after_login_birthday", "");
    }

    /* renamed from: j */
    public static boolean m73982j() {
        return m73988n().getBoolean("ftc_create_account_showing", false);
    }

    /* renamed from: k */
    public static boolean m73984k() {
        return m73988n().getBoolean("ftc_create_password_showing", false);
    }

    /* renamed from: l */
    public static boolean m73986l() {
        return m73990p().getBoolean("account_terminal_app_has_logged_out", true);
    }

    /* renamed from: n */
    private static SharedPreferences m73988n() {
        return C7285c.m22838a(C21084a.f56601a, "aweme-app", 0);
    }

    /* renamed from: o */
    private static SharedPreferences m73989o() {
        return C7285c.m22838a(C21084a.f56601a, "aweme_user", 0);
    }

    /* renamed from: p */
    private static SharedPreferences m73990p() {
        return C7285c.m22838a(C21084a.f56601a, "aweme_account_terminal_relative_sp", 0);
    }

    /* renamed from: q */
    private static SharedPreferences m73991q() {
        return C7285c.m22838a(C21084a.f56601a, "account_aweme_login_settings_file", 0);
    }

    /* renamed from: f */
    public static int m73973f() {
        if (f59611a == -1) {
            f59611a = m73988n().getInt("ftc_age_enable", 0);
        }
        return f59611a;
    }

    /* renamed from: m */
    public static List<SettingInfo> m73987m() {
        String string = m73991q().getString("aweme_login_setting_content", "");
        if (TextUtils.isEmpty(string)) {
            return Collections.emptyList();
        }
        try {
            LoginSettingResponse loginSettingResponse = (LoginSettingResponse) new C6600e().mo15974a(string, LoginSettingResponse.class);
            if (loginSettingResponse != null && !C6307b.m19566a((Collection<T>) loginSettingResponse.getData())) {
                return loginSettingResponse.getData();
            }
        } catch (Exception unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static void m73957a(int i) {
        m73988n().edit().putInt("sync_to_toutiao", i).apply();
    }

    /* renamed from: b */
    public static void m73963b(int i) {
        m73988n().edit().putInt("disable_age_gate", i).apply();
    }

    /* renamed from: c */
    public static void m73966c(int i) {
        m73988n().edit().putInt("ftc_age_enable", i).apply();
    }

    /* renamed from: d */
    public static void m73969d(boolean z) {
        m73988n().edit().putBoolean("has_enter_bind_phone", true).apply();
    }

    /* renamed from: e */
    public static void m73972e(boolean z) {
        m73988n().edit().putBoolean("is_accept_term_privacy_new", true).apply();
    }

    /* renamed from: g */
    public static void m73975g(boolean z) {
        m73988n().edit().putBoolean("ftc_age_gate_response_prompt", z).apply();
    }

    /* renamed from: h */
    public static void m73977h(boolean z) {
        m73988n().edit().putBoolean("ftc_delete_video_alert_showing", z).apply();
    }

    /* renamed from: i */
    public static void m73980i(boolean z) {
        m73988n().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    /* renamed from: j */
    public static void m73981j(boolean z) {
        m73988n().edit().putBoolean("ftc_create_password_showing", z).apply();
    }

    /* renamed from: k */
    public static void m73983k(boolean z) {
        m73988n().edit().putBoolean("enable_twitter_new_key", z).commit();
    }

    /* renamed from: l */
    public static void m73985l(boolean z) {
        m73990p().edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    /* renamed from: a */
    public static void m73958a(long j) {
        m73988n().edit().putLong("lastTimeResetPsw", j).apply();
    }

    /* renamed from: b */
    public static void m73964b(boolean z) {
        m73988n().edit().putBoolean("enable_email_login_switch", z).apply();
    }

    /* renamed from: c */
    public static void m73967c(boolean z) {
        m73988n().edit().putBoolean("is_sync_to_huoshan", z).apply();
    }

    /* renamed from: f */
    public static void m73974f(boolean z) {
        m73988n().edit().putBoolean("ftc_age_gate_response_eligible", z).apply();
    }

    /* renamed from: a */
    public static void m73959a(String str) {
        m73988n().edit().putString("after_login_birthday", str).apply();
    }

    /* renamed from: a */
    public static void m73961a(boolean z) {
        m73988n().edit().putBoolean("enable_passport_service_switch", z).apply();
    }

    /* renamed from: a */
    public static void m73960a(String str, int i) {
        Editor edit = m73989o().edit();
        StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
        sb.append(str);
        edit.putInt(sb.toString(), i).apply();
    }
}
