package com.p280ss.android.ugc.aweme.festival.christmas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.b */
public final class C29135b {

    /* renamed from: a */
    private static C29137d f76887a = null;

    /* renamed from: b */
    private static boolean f76888b = true;

    /* renamed from: b */
    public static boolean m95584b() {
        if (!C29132a.m95560a()) {
            return false;
        }
        return m95588f();
    }

    /* renamed from: c */
    public static void m95585c() {
        f76887a.mo60434a(System.currentTimeMillis());
    }

    /* renamed from: d */
    public static void m95586d() {
        f76887a.mo60436b(System.currentTimeMillis());
    }

    /* renamed from: e */
    private static boolean m95587e() {
        return C29132a.m95561a(f76887a.mo60433a(), System.currentTimeMillis());
    }

    /* renamed from: f */
    private static boolean m95588f() {
        return C29132a.m95561a(f76887a.mo60435b(), System.currentTimeMillis());
    }

    static {
        try {
            f76887a = (C29137d) C23336d.m76560a(AwemeApplication.m21341a(), C29137d.class);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Get show xmas tree SP failed.");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m95582a() {
        if (!C29132a.m95560a() || !f76888b) {
            return false;
        }
        f76888b = false;
        return m95587e();
    }

    /* renamed from: a */
    public static void m95579a(Context context) {
        C30221c g = C29132a.m95572g();
        if (g != null && !TextUtils.isEmpty(g.f79513c)) {
            m95580a(context, g.f79513c);
        }
    }

    /* renamed from: a */
    public static int m95578a(Aweme aweme) {
        if (!(aweme.getUploadMiscInfoStruct() == null || aweme.getUploadMiscInfoStruct().mvThemeId == null)) {
            String str = aweme.getUploadMiscInfoStruct().mvThemeId;
            List<String> list = null;
            if (C29132a.m95572g() != null) {
                list = C29132a.m95572g().f79522l;
            }
            if (list != null) {
                for (String equals : list) {
                    if (TextUtils.equals(equals, str)) {
                        return 1;
                    }
                }
            }
        }
        return 2;
    }

    /* renamed from: a */
    public static void m95580a(Context context, String str) {
        m95581a(context, str, null);
    }

    /* renamed from: a */
    public static boolean m95583a(Activity activity, Aweme aweme) {
        boolean z = false;
        if (activity == null || aweme == null || C29132a.m95572g() == null) {
            return false;
        }
        if (C29132a.m95560a() && C29132a.m95564b(aweme)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static void m95581a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str.startsWith("https://") || str.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(str, "ISO-8859-1"));
                } catch (Exception unused) {
                }
                Intent a = C25833b.m84945a(context, Uri.parse(sb.toString()));
                a.setClass(context, CrossPlatformActivity.class);
                a.putExtra("hide_more", false);
                a.putExtra("bundle_auto_play_audio", true);
                context.startActivity(a);
                return;
            }
            sb.append(str);
            C7195s.m22438a().mo18682a(sb.toString());
        }
    }
}
