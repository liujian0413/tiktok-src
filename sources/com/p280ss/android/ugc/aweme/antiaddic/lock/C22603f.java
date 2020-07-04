package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.AntiAddictionTipActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.TeenagerModeAppealActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.TimeUnlockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.f */
public final class C22603f {

    /* renamed from: a */
    public static boolean f60181a;

    /* renamed from: b */
    private static String f60182b;

    /* renamed from: d */
    public static String m74728d() {
        return f60182b;
    }

    /* renamed from: e */
    public static boolean m74729e() {
        return f60181a;
    }

    /* renamed from: a */
    public static boolean m74722a(C23469a<Boolean> aVar, String str) {
        FragmentActivity fragmentActivity = (FragmentActivity) C6405d.m19984g();
        if (fragmentActivity == null || !(fragmentActivity instanceof AmeActivity) || (fragmentActivity instanceof AntiAddictionTipActivity) || (fragmentActivity instanceof CrossPlatformActivity)) {
            return false;
        }
        Intent intent = new Intent(fragmentActivity, TimeUnlockActivity.class);
        if (aVar != null) {
            m74730f().mo61081a(fragmentActivity, aVar);
            if (((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
                intent = new Intent(fragmentActivity, TeenagerModeAppealActivity.class);
                intent.putExtra("type", 2);
            }
            intent.putExtra("from", str);
        } else {
            C6907h.m21524a("time_lock_block_show", (Map) C22984d.m75611a().mo59973a("enter_from", "time_lock_block").f60753a);
        }
        fragmentActivity.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static void m74718a(View view, final String str, final boolean z) {
        if (!C6399b.m19944t()) {
            TextView textView = (TextView) view.findViewById(R.id.q8);
            if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
                textView.setVisibility(4);
                return;
            }
            C10789c.m31502a(textView);
            String string = view.getContext().getString(R.string.e8t);
            SpannableString spannableString = new SpannableString(C23481i.m77091b(C6399b.m19944t() ? R.string.e8s : R.string.l6));
            C23472a.m77062a(spannableString, 0, spannableString.length(), C23481i.m77088a(R.color.a4p));
            textView.setText(new SpannableStringBuilder().append(string).append(" ").append(spannableString));
            textView.setVisibility(0);
            textView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C22603f.m74720a(str, "reset");
                    if (z) {
                        C22603f.f60181a = true;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m74720a(String str, String str2) {
        String str3 = (String) SharePrefCache.inst().getTeenagerProtectionScheme().mo59877d();
        if (!TextUtils.isEmpty(str3)) {
            C7195s.m22438a().mo18682a(m74712a(str3, str, str2));
        }
    }

    /* renamed from: b */
    public static boolean m74725b() {
        return m74722a(null, "");
    }

    /* renamed from: c */
    public static C23468a<Boolean> m74726c() {
        return C23470b.m77051a().mo61086b(TimeUnlockActivity.f60192b, Boolean.class);
    }

    /* renamed from: f */
    private static C23468a<Boolean> m74730f() {
        return C23470b.m77051a().mo61084a(TimeUnlockActivity.f60192b, Boolean.class);
    }

    /* renamed from: a */
    public static void m74713a() {
        Context g = C6405d.m19984g();
        if (g == null) {
            g = C6399b.m19921a();
        }
        if (g instanceof MainActivity) {
            ((MainActivity) g).finish();
        }
        g.startActivity(new Intent(g, MainActivity.class).setFlags(268468224));
    }

    /* renamed from: a */
    public static void m74719a(String str) {
        f60182b = str;
    }

    /* renamed from: a */
    public static void m74721a(boolean z) {
        f60181a = false;
    }

    /* renamed from: a */
    public static void m74714a(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            intent.putExtra("hide_nav_bar", true);
            intent.putExtras(bundle);
            intent.setData(Uri.parse("https://aweme.snssdk.com/falcon/douyin/children_agreement"));
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static void m74715a(FragmentActivity fragmentActivity) {
        int e = fragmentActivity.getSupportFragmentManager().mo2657e();
        for (int i = 0; i < e; i++) {
            fragmentActivity.getSupportFragmentManager().mo2655c();
        }
    }

    /* renamed from: b */
    public static void m74724b(FragmentActivity fragmentActivity, int i) {
        m74715a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).mo59306a(C22612c.m74774c(i));
    }

    /* renamed from: c */
    public static void m74727c(FragmentActivity fragmentActivity, int i) {
        m74715a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).mo59306a(C22612c.m74770a(i));
    }

    /* renamed from: a */
    public static void m74716a(FragmentActivity fragmentActivity, int i) {
        if (i == 0) {
            C10761a.m31383a((Context) fragmentActivity, (int) R.string.e92).mo25750a();
        } else {
            C10761a.m31383a((Context) fragmentActivity, (int) R.string.e6d).mo25750a();
        }
        m74724b(fragmentActivity, i);
    }

    /* renamed from: a */
    private static String m74712a(String str, String str2, String str3) {
        Uri parse = Uri.parse(str);
        Builder builder = new Builder();
        builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
        for (String str4 : parse.getQueryParameterNames()) {
            builder.appendQueryParameter(str4, m74711a(str4, parse, str2, str3));
        }
        return builder.build().toString();
    }

    /* renamed from: a */
    public static void m74717a(FragmentActivity fragmentActivity, int i, TimeLockUserSetting timeLockUserSetting) {
        if (i == 0) {
            C10761a.m31383a((Context) fragmentActivity, (int) R.string.e8m).mo25750a();
            timeLockUserSetting.setTimeLockOn(true);
            C22647a aVar = (C22647a) ((TimeLockOptionViewModel) C0069x.m159a(fragmentActivity).mo147a(TimeLockOptionViewModel.class)).f60314a.getValue();
            if (aVar == null || aVar.f60283b == 0) {
                throw new RuntimeException("@dongzesong");
            }
            timeLockUserSetting.setLockTimeInMin(aVar.f60283b);
            C6907h.m21524a("open_time_lock_finish", (Map) C22984d.m75611a().mo59970a("set_time", aVar.f60283b).f60753a);
        } else {
            timeLockUserSetting.setContentFilterOn(true);
            C23060u.m75742a().mo60092v().mo59871a(Boolean.valueOf(true));
            C6907h.m21524a("open_teen_mode_finish", (Map) C22984d.m75611a().mo59970a("is_login", C21115b.m71197a().isLogin() ? 1 : 0).mo59973a("enter_from", f60182b).f60753a);
            new Handler(Looper.myLooper()).post(new Runnable() {
                public final void run() {
                    C22603f.m74713a();
                    C10761a.m31383a(C6399b.m19921a(), (int) R.string.dgs).mo25750a();
                }
            });
            if (!C6399b.m19944t() && !TimeLockRuler.isTimeLockOn() && !((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
                timeLockUserSetting.setTimeLockOn(true);
                timeLockUserSetting.setLockTimeInMin(40);
            }
        }
        TimeLockRuler.applyUserSetting(timeLockUserSetting);
        m74724b(fragmentActivity, i);
    }

    /* renamed from: a */
    private static String m74711a(String str, Uri uri, String str2, String str3) {
        if (TextUtils.equals("url", str) || TextUtils.equals("rn_schema", str)) {
            return m74723b(str, uri, str2, str3);
        }
        return uri.getQueryParameter(str);
    }

    /* renamed from: b */
    private static String m74723b(String str, Uri uri, String str2, String str3) {
        Builder buildUpon = Uri.parse(uri.getQueryParameter(str)).buildUpon();
        buildUpon.appendQueryParameter("enter_from", str2);
        buildUpon.appendQueryParameter("type", str3);
        buildUpon.appendQueryParameter("minor_control_type", String.valueOf(C22598e.m74688j()));
        return buildUpon.toString();
    }
}
