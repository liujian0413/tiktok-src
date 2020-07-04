package com.p280ss.android.ugc.aweme.account.login.agegate;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p280ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.agegate.p954ui.AgeGateActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.account.p944g.C21199g;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22352y;
import com.p280ss.android.ugc.aweme.utils.p1693b.C42964a;
import com.p280ss.android.ugc.aweme.utils.p1693b.C42964a.C42965a;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.account.login.agegate.b */
public final class C21297b implements C42965a {

    /* renamed from: c */
    private static String f57213c = "";

    /* renamed from: d */
    private static boolean f57214d;

    /* renamed from: a */
    final int f57215a = 998;

    /* renamed from: b */
    private C21298a f57216b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.agegate.b$a */
    public interface C21298a {
        /* renamed from: a */
        void mo57275a();

        /* renamed from: a */
        void mo57276a(Exception exc);

        /* renamed from: b */
        void mo57277b();

        /* renamed from: c */
        void mo57278c();
    }

    /* renamed from: a */
    public static void m71676a() {
        f57214d = false;
    }

    /* renamed from: b */
    public static boolean m71679b() {
        if (!m71681d() || !m71680c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m71680c() {
        if (C22345t.m73973f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m71681d() {
        if (C22345t.m73971e() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m71677a(DatePicker datePicker) {
        Calendar instance = Calendar.getInstance();
        instance.set(6, instance.getActualMaximum(6));
        instance.add(1, -1);
        Date b = C21886a.m73067b();
        if (instance.getTime().before(b)) {
            instance = Calendar.getInstance();
            instance.set(b.getYear() + 1900, 11, 31);
        }
        datePicker.setUpperBoundDate(instance);
        datePicker.setNonRecurrentForYear(true);
        datePicker.mo57061a(b);
    }

    /* renamed from: a */
    public static boolean m71678a(Activity activity) {
        if (f57214d || activity == null) {
            return false;
        }
        Intent intent = new Intent(activity, MusLoginActivity.class);
        if (C22352y.m74025f()) {
            Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
            if (C21886a.f58594a.mo58324c()) {
                intent = new Intent(activity, SignUpOrLoginActivity.class);
                intent.putExtra("next_page", Step.AGE_GATE.getValue());
            } else {
                intent.putExtra("init_page", 4);
            }
            intent.putExtra("enter_type", "click_login");
        } else if (C22352y.m74022c()) {
            intent.putExtra("init_page", 5);
            intent.putExtra("enter_type", "click_sign_up");
        } else if (C22352y.m74023d()) {
            intent.putExtra("init_page", 6);
            intent.putExtra("enter_type", "click_sign_up");
        } else if (!C22352y.m74024e()) {
            return false;
        } else {
            Intent intent2 = new Intent(activity, DeleteVideoAlertActivity.class);
            intent2.putExtra("age_gate_response", new AgeGateResponse(0, "", C22345t.m73968c(), C22345t.m73976g()));
            activity.startActivity(intent2);
            return true;
        }
        f57214d = true;
        activity.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public final void mo57302a(int i, int i2, Intent intent) {
        if (i == 998 && this.f57216b != null) {
            if (i2 == -1) {
                this.f57216b.mo57278c();
            } else if (i2 == 0) {
                this.f57216b.mo57277b();
            } else {
                this.f57216b.mo57276a(new Exception());
            }
        }
    }

    /* renamed from: a */
    public final void mo57303a(Activity activity, AuthResult authResult, C21298a aVar) {
        this.f57216b = aVar;
        String d = C21199g.m71374d(authResult);
        if (m71679b() || (!m71680c() && (TextUtils.equals(d, "facebook") || TextUtils.equals(d, "google")))) {
            if (this.f57216b != null) {
                this.f57216b.mo57275a();
            }
            return;
        }
        C42964a aVar2 = new C42964a(activity);
        if (C21886a.f58594a.mo58324c()) {
            Intent intent = new Intent(activity, SignUpOrLoginActivity.class);
            intent.putExtra("enter_type", "click_login");
            intent.putExtra("key_auth_result", authResult);
            intent.putExtra("platform", authResult.f32441d);
            if (!m71680c()) {
                intent.putExtra("next_page", Step.THIRD_PARTY_FTC_AGE_GATE.getValue());
            } else {
                intent.putExtra("next_page", Step.THIRD_PARTY_AGE_GATE.getValue());
            }
            aVar2.mo104674a(intent, 998, this);
        } else if (!m71680c()) {
            Intent intent2 = new Intent(activity, MusLoginActivity.class);
            intent2.putExtra("enter_type", "click_login");
            intent2.putExtra("key_auth_result", authResult);
            intent2.putExtra("init_page", 7);
            aVar2.mo104674a(intent2, 998, this);
        } else {
            Intent intent3 = new Intent(activity, AgeGateActivity.class);
            intent3.putExtra("key_auth_result", authResult);
            aVar2.mo104674a(intent3, 998, this);
        }
    }
}
