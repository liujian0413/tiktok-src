package com.p280ss.android.ugc.aweme.util;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.business.base.BusinessToolsConfig;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.business.p473a.C9667a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.jirafast.base.C12004a;
import com.bytedance.jirafast.base.C12005b;
import com.bytedance.jirafast.base.C12007d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.util.b */
public final class C42869b {

    /* renamed from: a */
    static IBusinessToolsService f111366a;

    /* renamed from: b */
    private static C12007d f111367b = C42875d.f111373a;

    /* renamed from: c */
    private static C12004a f111368c = C42876e.f111374a;

    /* renamed from: b */
    private static void m136126b() {
        if (m136133i()) {
            m136122a().startScreenshotObserver();
        }
    }

    /* renamed from: c */
    private static void m136127c() {
        if (m136133i()) {
            m136122a().stopScreenshotObserver();
        }
    }

    /* renamed from: d */
    private static void m136128d() {
        if (m136133i()) {
            m136126b();
        }
    }

    /* renamed from: e */
    private static void m136129e() {
        if (m136133i()) {
            m136127c();
        }
    }

    /* renamed from: i */
    private static boolean m136133i() {
        IBusinessToolsService a = m136122a();
        if (!m136134j() || a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static IBusinessToolsService m136122a() {
        if (f111366a == null) {
            try {
                f111366a = (IBusinessToolsService) ServiceManager.get().getService(IBusinessToolsService.class);
            } catch (IllegalArgumentException unused) {
                f111366a = null;
            }
        }
        return f111366a;
    }

    /* renamed from: f */
    private static String m136130f() {
        if (C6399b.m19946v()) {
            return "musical.ly";
        }
        if (C6399b.m19947w()) {
            return "tiktok";
        }
        return "抖音";
    }

    /* renamed from: g */
    private static String m136131g() {
        if (C6399b.m19944t()) {
            return "14.7.4".substring(0, "14.7.4".lastIndexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        return "14.7.4";
    }

    /* renamed from: h */
    private static String m136132h() {
        if (C6399b.m19946v()) {
            return "[Android][M]";
        }
        if (C6399b.m19947w()) {
            return "[Android][T]";
        }
        return "[Android][D]";
    }

    /* renamed from: j */
    private static boolean m136134j() {
        if (TextUtils.equals(C6399b.m19941q(), "business") || TextUtils.equals(C6399b.m19941q(), "release_outer_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ void m136125a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m136129e();
        } else {
            m136128d();
        }
    }

    /* renamed from: a */
    public static void m136123a(Application application) {
        String str;
        if (m136134j() && C6776h.m20947b(application) && m136133i()) {
            String q = C6399b.m19941q();
            if (C6399b.m19946v()) {
                str = "http://api2-19-h2.musical.ly/aweme/v1/";
            } else if (C6399b.m19947w()) {
                str = "http://api21-h2.tiktokv.com/aweme/v1/";
            } else {
                str = "http://aweme.snssdk.com/aweme/v1/";
            }
            String str2 = str;
            C9667a aVar = new C9667a();
            String f = m136130f();
            String g = m136131g();
            String h = m136132h();
            StringBuilder sb = new StringBuilder("\nDeviceId:");
            sb.append(AppLog.getServerDeviceId());
            sb.append("\nVersion Name:14.7.4");
            sb.append("\nVersion Code:2021407040");
            C12005b bVar = new C12005b("https://jira.bytedance.com/rest/api/2", "AME", "feedback2", "feedback2", 1233, f, g, h, sb.toString(), q, C6399b.m19944t(), str2);
            aVar.f26382a = bVar;
            BusinessToolsConfig instance = BusinessToolsConfig.getInstance("14.7.4", 2021407040, 1233, false);
            instance.setBugReportConfig(aVar);
            m136122a().initialize(application, instance);
            m136122a().setOnGetMoreJIRAParamsListener(f111367b);
            m136122a().setGoToFeedbackPageListener(f111368c);
            C6405d.m19981e().mo19325f(C42870c.f111369a);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m136124a(Context context, String str) {
        String str2;
        if (C6399b.m19946v()) {
            str2 = "https://m.tiktok.com/aweme/faq_beta_version/";
        } else if (C6399b.m19947w()) {
            str2 = "https://www.tiktokv.com/aweme/faq_beta_version/";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f60502b);
            sb.append("/falcon/douyin_falcon/faq_beta_version/");
            str2 = sb.toString();
        }
        C19290j jVar = new C19290j(str2);
        jVar.mo51188a("enter_from", "settings");
        jVar.mo51188a("imgUrl", str);
        SmartRouter.buildRoute(context, "//webview").withParam("url", (Parcelable) Uri.parse(jVar.toString())).withParam("hide_nav_bar", true).open();
    }
}
