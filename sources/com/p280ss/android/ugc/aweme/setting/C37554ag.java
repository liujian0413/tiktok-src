package com.p280ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.utils.C43054df;
import com.p280ss.android.ugc.trill.setting.DisplaySettingActivity;
import com.p280ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ag */
public final class C37554ag {

    /* renamed from: a */
    public static final C37554ag f97960a = new C37554ag();

    private C37554ag() {
    }

    /* renamed from: c */
    public static void m120306c(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Context context = activity;
        if (!C37555ah.m120311a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
        } else {
            AgreementActivity.m99747a(activity, C43054df.m136597a("terms-of-use"), false, activity.getString(R.string.cfz));
        }
    }

    /* renamed from: d */
    public static void m120307d(Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (!C37555ah.m120311a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjs).mo25750a();
        } else {
            AgreementActivity.m99747a(activity, "https://www.tiktok.com/copyright.html", false, activity.getString(R.string.ahi));
        }
    }

    /* renamed from: a */
    public final void mo94842a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C6907h.m21524a("click_safety_center", (Map) C22984d.m75611a().f60753a);
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/");
        sb.append(m120303a((Context) activity));
        sb.append("/safety/");
        AgreementActivity.m99747a(activity, sb.toString(), false, activity.getString(R.string.dhx));
    }

    /* renamed from: e */
    public final void mo94844e(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Context context = activity;
        if (!C37555ah.m120311a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            return;
        }
        C19290j jVar = new C19290j("https://support.tiktok.com");
        jVar.mo51188a("lang", m120303a(context));
        AgreementActivity.m99747a(activity, jVar.mo51184a(), false, activity.getString(R.string.b65));
    }

    /* renamed from: a */
    private static String m120303a(Context context) {
        Locale a = C30472f.m99529a(context);
        C7573i.m23582a((Object) a, "Locales.getFrom(context)");
        String language = a.getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            language = "en";
        }
        C7573i.m23582a((Object) language, "locale");
        return language;
    }

    /* renamed from: b */
    public final void mo94843b(Activity activity) {
        C19290j jVar;
        C7573i.m23587b(activity, "activity");
        if (C32326h.m104881e()) {
            jVar = new C19290j("https://api.tiktokv.com/magic/runtime/?id=1159");
        } else {
            jVar = new C19290j("https://support.tiktok.com/knowledge-base/community-policy");
            jVar.mo51188a("lang", m120303a((Context) activity));
            jVar.mo51188a("enter_from", "settings");
        }
        AgreementActivity.m99747a(activity, jVar.toString(), false, activity.getString(R.string.aev));
    }

    /* renamed from: b */
    public static void m120305b(Activity activity, boolean z) {
        Class cls;
        C7573i.m23587b(activity, "activity");
        C33228ab.m107200a("enter_general_setting").mo85057b("previous_page", "settings_page").mo85057b("enter_method", "click_button").mo85252e();
        Context context = activity;
        if (z) {
            cls = ChildrenDisplaySettingActivity.class;
        } else {
            cls = DisplaySettingActivity.class;
        }
        activity.startActivity(new Intent(context, cls));
    }

    /* renamed from: a */
    public static void m120304a(Activity activity, boolean z) {
        C7573i.m23587b(activity, "activity");
        Context context = activity;
        if (!C37555ah.m120311a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            return;
        }
        if (z) {
            AgreementActivity.m99747a(activity, "https://www.tiktok.com/aweme/inapp/v2/c_privacy", false, activity.getString(R.string.d4j));
        } else {
            String j = C25789b.m84763j();
            if (!TextUtils.isEmpty(j)) {
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                intent.setData(Uri.parse(j));
                intent.putExtra("hide_nav_bar", true);
                intent.putExtra("hide_status_bar", true);
                activity.startActivity(intent);
            } else {
                AgreementActivity.m99747a(activity, C43054df.m136597a("privacy-policy"), false, activity.getString(R.string.d4j));
            }
        }
        C6907h.m21524a("enter_privacy_policy_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
    }
}
