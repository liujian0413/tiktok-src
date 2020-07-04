package com.p280ss.android.ugc.aweme.app;

import android.app.Application;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.metrics.C33282x;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.b */
public final class C22887b {

    /* renamed from: a */
    public static boolean f60602a;

    /* renamed from: b */
    public static final C22888a f60603b = new C22888a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.b$a */
    public static final class C22888a {
        private C22888a() {
        }

        /* renamed from: a */
        private static boolean m75353a() {
            return C22887b.f60602a;
        }

        /* renamed from: a */
        private static void m75352a(boolean z) {
            C22887b.f60602a = false;
        }

        public /* synthetic */ C22888a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo59852a(String str, Uri uri, boolean z) {
            String str2;
            if (uri != null) {
                str2 = uri.getQueryParameter("gd_label");
            } else {
                str2 = null;
            }
            if (z) {
                String str3 = "";
                String str4 = "";
                if (uri != null) {
                    str4 = uri.getQueryParameter("push_id");
                } else {
                    str = str3;
                }
                C6887b b = C6887b.m21436b();
                Application a = C29960a.m98230a();
                C7573i.m23582a((Object) a, "AppProvider.getApp()");
                long c = b.mo16910c(a.getApplicationContext(), "red_point_count");
                C33282x a2 = new C33282x().mo85366a(str2);
                C22995i a3 = C22995i.m75637a();
                C7573i.m23582a((Object) a3, "AppLifeCircleCacheManager.getInstance()");
                C33282x d = a2.mo85370e(Integer.toString(a3.f60774b ? 1 : 0)).mo85369d(Long.toString(c));
                if (str == null) {
                    str = "";
                }
                C33282x c2 = d.mo85368c(str);
                if (str4 == null) {
                    str4 = "";
                }
                c2.mo85367b(str4).mo85252e();
                C22995i a4 = C22995i.m75637a();
                C7573i.m23582a((Object) a4, "AppLifeCircleCacheManager.getInstance()");
                a4.f60774b = false;
                return;
            }
            C22995i a5 = C22995i.m75637a();
            C7573i.m23582a((Object) a5, "AppLifeCircleCacheManager.getInstance()");
            a5.f60774b = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("land_position", str);
                C6907h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName(str2).setJsonObject(jSONObject));
            } catch (Exception unused) {
            }
            if (m75353a()) {
                C6907h.m21524a(C22912d.f60642b, (Map) C22984d.m75611a().mo59973a("enter_to", str).mo59973a("url", String.valueOf(uri)).f60753a);
                m75352a(false);
            }
        }
    }

    /* renamed from: a */
    public static final void m75350a(String str, Uri uri, boolean z) {
        f60603b.mo59852a(str, uri, z);
    }

    /* renamed from: a */
    public static final void m75351a(boolean z) {
        f60602a = z;
    }
}
