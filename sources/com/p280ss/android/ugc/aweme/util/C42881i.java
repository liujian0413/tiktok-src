package com.p280ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.debugbox.base.C10050a;
import com.bytedance.debugbox.base.C10051b;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jirafast.base.C12004a;
import com.bytedance.jirafast.base.C12005b;
import com.bytedance.jirafast.base.C12006c;
import com.bytedance.jirafast.base.C12007d;
import com.bytedance.jirafast.base.JIRAFileParam;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.util.crony.C42871a;
import com.p280ss.android.ugc.aweme.util.crony.C42873b;
import com.p280ss.android.ugc.aweme.util.crony.C42874c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.util.i */
public final class C42881i {

    /* renamed from: a */
    private static C12007d f111386a = C42883j.f111389a;

    /* renamed from: b */
    private static C12004a f111387b = C42884k.f111390a;

    /* renamed from: l */
    private static List<String> m136176l() {
        return new ArrayList();
    }

    /* renamed from: a */
    public static void m136158a() {
        if (m136167c()) {
            m136169e();
        }
    }

    /* renamed from: b */
    private static IDebugBoxService m136164b() {
        return (IDebugBoxService) ServiceManager.get().getService(IDebugBoxService.class);
    }

    /* renamed from: d */
    private static void m136168d() {
        if (m136167c()) {
            m136164b();
        }
    }

    /* renamed from: e */
    private static void m136169e() {
        if (m136167c()) {
            m136164b();
        }
    }

    /* renamed from: i */
    private static boolean m136173i() {
        return TextUtils.equals(C6399b.m19941q(), "lark_inhouse");
    }

    /* renamed from: j */
    private static boolean m136174j() {
        return TextUtils.equals(C6399b.m19941q(), "local_test");
    }

    /* renamed from: c */
    private static boolean m136167c() {
        if ((C7163a.m22363a() || m136173i()) && !C6870b.m21395c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static String m136170f() {
        if (C6399b.m19946v()) {
            return "musical.ly";
        }
        if (C6399b.m19947w()) {
            return "tiktok";
        }
        return "抖音";
    }

    /* renamed from: g */
    private static String m136171g() {
        if (C6399b.m19944t()) {
            return "14.7.4".substring(0, "14.7.4".lastIndexOf(ClassUtils.PACKAGE_SEPARATOR));
        }
        return "14.7.4";
    }

    /* renamed from: h */
    private static String m136172h() {
        if (C6399b.m19946v()) {
            return "[Android][M]";
        }
        if (C6399b.m19947w()) {
            return "[Android][T]";
        }
        return "[Android][D]";
    }

    /* renamed from: k */
    private static List<String> m136175k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity");
        arrayList.add("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
        arrayList.add("com.ss.android.ugc.aweme.live.LiveFeedActivity");
        return arrayList;
    }

    /* renamed from: c */
    public static void m136166c(Activity activity) {
        if (m136167c()) {
            m136168d();
        }
    }

    /* renamed from: a */
    public static void m136159a(Activity activity) {
        if (m136167c()) {
            m136164b();
        }
    }

    /* renamed from: b */
    public static void m136165b(Activity activity) {
        if (m136167c()) {
            m136164b().forceShowFloatingButton(activity);
        }
    }

    /* renamed from: a */
    public static void m136163a(String str) {
        if (m136167c()) {
            m136164b();
        }
    }

    /* renamed from: a */
    public static void m136160a(final Application application) {
        String str;
        if (C6776h.m20947b(application)) {
            if (m136167c()) {
                String q = C6399b.m19941q();
                if (C6399b.m19946v()) {
                    str = "http://api2-19-h2.musical.ly/aweme/v1/";
                } else if (C6399b.m19947w()) {
                    str = "http://api21-h2.tiktokv.com/aweme/v1/";
                } else {
                    str = "http://aweme.snssdk.com/aweme/v1/";
                }
                String str2 = str;
                String f = m136170f();
                String g = m136171g();
                String h = m136172h();
                StringBuilder sb = new StringBuilder("\nDeviceId:");
                sb.append(AppLog.getServerDeviceId());
                sb.append("\nVersion Name:14.7.4");
                sb.append("\nVersion Code:2021407040");
                C12005b bVar = new C12005b("https://jira.bytedance.com/rest/api/2", "AME", "feedback2", "feedback2", 1233, f, g, h, sb.toString(), q, C6399b.m19944t(), str2);
                C10050a a = C10050a.m29855a(bVar, 1, 1233, "14.7.4", 2021407040, C6887b.m21436b().mo16909b((Context) application, "aweme_commerce_anywheredoor", false), false);
                a.f27349h = !m136174j();
                a.f27350i = false;
                a.f27352k = false;
                a.f27353l = true;
                a.f27354m = m136175k();
                a.f27355n = m136176l();
                a.f27351j = false;
                a.f27356o = new C10051b() {
                };
                m136164b().initialize(application, a);
                m136164b();
                m136164b();
            }
            if (m136174j()) {
                C42871a.m136140a(application);
                C42871a.m136141a((C42874c) new C42873b());
            }
        }
    }

    /* renamed from: a */
    public static void m136161a(Application application, String str) {
        if (m136167c()) {
            m136160a(application);
            ArrayList arrayList = new ArrayList();
            arrayList.add(JIRAFileParam.obtainTxt(str, "crash"));
            StringBuilder sb = new StringBuilder("[Android]");
            sb.append(m136170f());
            sb.append(" 14.7.4");
            sb.append(" Crash");
            new C12006c(arrayList, "", "", sb.toString(), "", null, "");
            m136164b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m136162a(Context context, String str) {
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
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        C19290j jVar = new C19290j(str2);
        jVar.mo51188a("enter_from", "settings");
        jVar.mo51188a("imgUrl", str);
        intent.setData(Uri.parse(jVar.toString()));
        intent.putExtra("hide_nav_bar", true);
        context.startActivity(intent);
    }
}
