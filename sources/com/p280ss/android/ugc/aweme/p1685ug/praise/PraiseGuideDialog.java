package com.p280ss.android.ugc.aweme.p1685ug.praise;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.PraiseGuideDialog */
public final class PraiseGuideDialog extends AbsPraiseGuideDialog {
    /* renamed from: a */
    public final String mo104326a() {
        String string = getContext().getString(R.string.cfg);
        C7573i.m23582a((Object) string, "context.getString(R.string.mus_report_problem)");
        return string;
    }

    /* renamed from: h */
    private static String m135630h() {
        if (!C6399b.m19946v()) {
            return "https://www.tiktok.com/falcon/tiktok_rn_web/feedback/";
        }
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        String aD = a.mo18741aD();
        if (TextUtils.isEmpty(aD)) {
            aD = "m.tiktok.com";
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(aD);
        sb.append("/falcon/tiktok_rn_web/feedback/");
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo104327c() {
        C19290j jVar;
        Map<String, String> map = new C22984d().mo59973a("enter_from", "praise_dialog").f60753a;
        C6907h.m21524a("FAQ", (Map) map);
        C6907h.m21524a("click_feedback_entrance", (Map) map);
        Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
        if (!C6399b.m19946v() || !C43122ff.m136767b()) {
            try {
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                if (f.isLogin()) {
                    C7195s a = C7195s.m22438a();
                    IESSettingsProxy a2 = C30199h.m98861a();
                    C7573i.m23582a((Object) a2, "SettingsReader.get()");
                    FeedbackConf feedbackConf = a2.getFeedbackConf();
                    C7573i.m23582a((Object) feedbackConf, "SettingsReader.get().feedbackConf");
                    a.mo18682a(feedbackConf.getNormalEntry());
                    return;
                }
                C7195s a3 = C7195s.m22438a();
                IESSettingsProxy a4 = C30199h.m98861a();
                C7573i.m23582a((Object) a4, "SettingsReader.get()");
                FeedbackConf feedbackConf2 = a4.getFeedbackConf();
                C7573i.m23582a((Object) feedbackConf2, "SettingsReader.get().feedbackConf");
                a3.mo18682a(feedbackConf2.getNotLoggedIn());
            } catch (Exception unused) {
                jVar = new C19290j(m135630h());
                Locale a5 = C30472f.m99529a(getContext());
                C7573i.m23582a((Object) a5, "Locales.getFrom(context)");
                jVar.mo51188a("locale", a5.getLanguage());
            }
        } else {
            jVar = new C19290j("https://m.tiktok.com/aweme/inapp/v2/c_feedback");
            jVar.mo51188a("enter_from", "praise_dialog");
            intent.setData(Uri.parse(jVar.toString()));
            intent.putExtra("hide_nav_bar", true);
            getContext().startActivity(intent);
        }
    }

    /* renamed from: d */
    public final void mo104328d() {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            StringBuilder sb = new StringBuilder("market://details?id=");
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            sb.append(context.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            if (intent.resolveActivity(context2.getPackageManager()) != null) {
                getContext().startActivity(intent);
                return;
            }
            StringBuilder sb2 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            Context context3 = getContext();
            C7573i.m23582a((Object) context3, "context");
            sb2.append(context3.getPackageName());
            intent.setData(Uri.parse(sb2.toString()));
            Context context4 = getContext();
            C7573i.m23582a((Object) context4, "context");
            if (intent.resolveActivity(context4.getPackageManager()) != null) {
                getContext().startActivity(intent);
            }
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
            Context context5 = getContext();
            C7573i.m23582a((Object) context5, "context");
            sb3.append(context5.getPackageName());
            intent.setData(Uri.parse(sb3.toString()));
            Context context6 = getContext();
            C7573i.m23582a((Object) context6, "context");
            if (intent.resolveActivity(context6.getPackageManager()) != null) {
                getContext().startActivity(intent);
            }
        }
    }

    public PraiseGuideDialog(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        super(context, z);
    }
}
