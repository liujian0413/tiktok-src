package com.p280ss.android.ugc.aweme.feed;

import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42937ar;

/* renamed from: com.ss.android.ugc.aweme.feed.h */
public final class C28410h {
    /* renamed from: b */
    public static void m93360b() {
        C23338f.m76566d().mo60634b("enter_music_guide_available", false);
    }

    /* renamed from: f */
    public static void m93366f() {
        C23338f.m76566d().mo60630b("last_show_dou_pop_time", System.currentTimeMillis());
    }

    /* renamed from: l */
    public static void m93372l() {
        C23338f.m76566d().mo60630b("dou_other_profile_show_pop_time", System.currentTimeMillis());
    }

    /* renamed from: n */
    public static void m93374n() {
        C23338f.m76566d().mo60634b("show_coupon_guide_dialog", true);
    }

    /* renamed from: o */
    public static boolean m93375o() {
        return C23338f.m76566d().mo60627a("show_coupon_guide_dialog", false);
    }

    /* renamed from: p */
    public static boolean m93376p() {
        return C23338f.m76566d().mo60627a("has_receive_new_coupon", false);
    }

    /* renamed from: q */
    public static boolean m93377q() {
        return C23338f.m76566d().mo60627a("show_coupon_guide_pop", false);
    }

    /* renamed from: r */
    public static boolean m93378r() {
        return C23338f.m76566d().mo60627a("show_upload_img_tip_dialog", true);
    }

    /* renamed from: s */
    public static boolean m93379s() {
        return C23338f.m76566d().mo60627a("show_profile_collection_guide", false);
    }

    /* renamed from: d */
    public static void m93364d() {
        StringBuilder sb = new StringBuilder("enter_insights_");
        sb.append(C6861a.m21337f().getCurUserId());
        C23338f.m76566d().mo60634b(sb.toString(), false);
    }

    /* renamed from: e */
    public static void m93365e() {
        C23339g d = C23338f.m76566d();
        d.mo60629b("cold_start_times", d.mo60620a("cold_start_times", 0) + 1);
    }

    /* renamed from: a */
    public static boolean m93359a() {
        C23339g d = C23338f.m76566d();
        if (!d.mo60627a("enter_music_guide_available", true) || (!C6399b.m19944t() && d.mo60620a("cold_start_times", 0) < 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m93363c() {
        C23339g d = C23338f.m76566d();
        StringBuilder sb = new StringBuilder("enter_insights_");
        sb.append(C6861a.m21337f().getCurUserId());
        if (!d.mo60627a(sb.toString(), true) || !C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static void m93367g() {
        C23339g d = C23338f.m76566d();
        String a = C1642a.m8034a("show_dou_pop_count_%s", new Object[]{C6861a.m21337f().getCurUser().getUid()});
        d.mo60629b(a, d.mo60620a(a, 0) + 1);
    }

    /* renamed from: i */
    public static long m93369i() {
        User curUser = C6861a.m21337f().getCurUser();
        return C23338f.m76566d().mo60621a(C1642a.m8034a("new_dou_self_active_id_%s", new Object[]{curUser.getUid()}), 0);
    }

    /* renamed from: j */
    public static boolean m93370j() {
        C23339g d = C23338f.m76566d();
        int a = d.mo60620a(C1642a.m8034a("dou_other_profile_show_pop_count_%s", new Object[]{C6861a.m21337f().getCurUser().getUid()}), 0);
        long a2 = d.mo60621a("dou_other_profile_show_pop_time", 0);
        if (a >= 3 || C42937ar.m136297b(a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static void m93371k() {
        C23339g d = C23338f.m76566d();
        String a = C1642a.m8034a("dou_other_profile_show_pop_count_%s", new Object[]{C6861a.m21337f().getCurUser().getUid()});
        d.mo60629b(a, d.mo60620a(a, 0) + 1);
    }

    /* renamed from: m */
    public static void m93373m() {
        C23338f.m76566d().mo60630b(C1642a.m8034a("dou_self_user_type_%s", new Object[]{C6861a.m21337f().getCurUser().getUid()}), System.currentTimeMillis());
    }

    /* renamed from: h */
    public static boolean m93368h() {
        C23339g d = C23338f.m76566d();
        User curUser = C6861a.m21337f().getCurUser();
        int a = d.mo60620a(C1642a.m8034a("show_dou_pop_count_%s", new Object[]{curUser.getUid()}), 0);
        long a2 = d.mo60621a("last_show_dou_pop_time", 0);
        long a3 = d.mo60621a(C1642a.m8034a("dou_self_user_type_%s", new Object[]{curUser.getUid()}), 0);
        if (a >= 3 || C42937ar.m136297b(a2) || C42937ar.m136297b(a3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m93358a(boolean z) {
        C23338f.m76566d().mo60634b("has_receive_new_coupon", z);
    }

    /* renamed from: c */
    public static void m93362c(boolean z) {
        C23338f.m76566d().mo60634b("show_upload_img_tip_dialog", false);
    }

    /* renamed from: a */
    public static void m93357a(long j) {
        User curUser = C6861a.m21337f().getCurUser();
        C23338f.m76566d().mo60630b(C1642a.m8034a("new_dou_self_active_id_%s", new Object[]{curUser.getUid()}), j);
    }

    /* renamed from: b */
    public static void m93361b(boolean z) {
        C23338f.m76566d().mo60634b("show_coupon_guide_pop", true);
    }
}
