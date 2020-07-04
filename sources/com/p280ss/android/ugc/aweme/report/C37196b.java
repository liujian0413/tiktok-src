package com.p280ss.android.ugc.aweme.report;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.experiment.VideoReportEnhanceExperiment;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.report.b */
public final class C37196b {
    /* renamed from: a */
    public static void m119566a(Map<String, String> map) {
        if (map != null) {
            C6907h.m21524a("tip_off", (Map) map);
        }
    }

    /* renamed from: a */
    public static void m119565a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C22984d a = new C22984d().mo59973a("author_id", str5).mo59973a("object_id", str4).mo59973a("object_type", str2).mo59973a("enter_from", str).mo59973a("enter_method", str7).mo59973a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            a.mo59973a("room_id", str6);
        }
        C6907h.m21524a("click_report", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static int m119556a() {
        if (m119569b()) {
            return R.drawable.atz;
        }
        return R.drawable.aty;
    }

    /* renamed from: b */
    public static boolean m119569b() {
        if (!C6399b.m19944t() || !C6384b.m19835a().mo15292a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", C6384b.m19835a().mo15295d().enable_enhance_report, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m119557a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return "forward";
        }
        if (aweme.isImage()) {
            return "image";
        }
        return "video";
    }

    /* renamed from: a */
    public static String m119558a(String str) {
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    /* renamed from: b */
    private static String m119567b(Aweme aweme) {
        if (aweme.getAwemeType() == 13) {
            return "forward";
        }
        if (aweme.getAwemeType() == 2) {
            return "image";
        }
        if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return "video";
        }
        if (aweme.getAwemeType() == 34) {
            return "video";
        }
        if (C25352e.m83224g(aweme)) {
            return "douplus";
        }
        if (aweme.isAd()) {
            return "ad";
        }
        return "";
    }

    /* renamed from: a */
    private static void m119564a(Builder builder) {
        boolean z;
        String str;
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser == null || !curUser.isDisciplineMember()) {
            z = false;
        } else {
            z = true;
        }
        if (C6399b.m19944t()) {
            str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getReportUrl();
        } else {
            str = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html";
        }
        Uri parse = Uri.parse(str);
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().mo59877d()).booleanValue() && !z) {
            builder.appendQueryParameter("isFirst", "1");
        }
    }

    /* renamed from: a */
    public static void m119559a(Activity activity, Builder builder) {
        if (activity != null) {
            if (C6399b.m19944t() || C21115b.m71197a().isLogin()) {
                m119568b(activity, builder);
            } else {
                C32656f.m105742a(activity, builder.build().getQueryParameter("report_from"), "report");
            }
        }
    }

    /* renamed from: b */
    public static void m119568b(Activity activity, Builder builder) {
        m119564a(builder);
        Intent intent = new Intent(activity, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putString("status_bar_color", activity.getResources().getString(R.color.a3z).replace("#", ""));
        intent.putExtras(bundle);
        intent.setData(builder.build());
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m119561a(Activity activity, String str, Builder builder) {
        if (activity != null) {
            if (C6399b.m19944t() || C21115b.m71197a().isLogin()) {
                if (TextUtils.equals("ad", str)) {
                    builder.appendQueryParameter("app_name", C6399b.m19929e()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter(C38347c.f99551f, C6399b.m19934j()).appendQueryParameter("install_id", AppLog.getInstallId());
                }
                m119568b(activity, builder);
                return;
            }
            C32656f.m105742a(activity, builder.build().getQueryParameter("report_from"), "report");
        }
    }

    /* renamed from: a */
    public static void m119560a(Activity activity, Aweme aweme, String str, String str2) {
        m119562a(activity, m119567b(aweme), str, str2);
    }

    /* renamed from: a */
    public static void m119562a(Activity activity, String str, String str2, String str3) {
        m119563a(activity, str, str2, str3, "", false, null);
    }

    /* renamed from: a */
    public static void m119563a(Activity activity, String str, String str2, String str3, String str4, boolean z, Map<String, String> map) {
        if (activity != null) {
            boolean t = C6399b.m19944t();
            if (t || C21115b.m71197a().isLogin()) {
                Builder appendQueryParameter = new Builder().appendQueryParameter("object_id", str2).appendQueryParameter("owner_id", str3).appendQueryParameter("report_type", str);
                if (t) {
                    appendQueryParameter.appendQueryParameter("locale", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
                    if (!TextUtils.isEmpty(str4)) {
                        appendQueryParameter.appendQueryParameter("video_owner_id", str4);
                    }
                }
                m119564a(appendQueryParameter);
                Intent intent = new Intent(activity, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", false);
                bundle.putBoolean("hide_nav_bar", true);
                intent.putExtras(bundle);
                intent.setData(appendQueryParameter.build());
                activity.startActivity(intent);
                return;
            }
            C32656f.m105742a(activity, "report", "");
        }
    }
}
