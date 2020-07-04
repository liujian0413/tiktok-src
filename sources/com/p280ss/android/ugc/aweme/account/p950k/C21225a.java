package com.p280ss.android.ugc.aweme.account.p950k;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.a */
public final class C21225a {

    /* renamed from: a */
    public static String f57027a = "";

    /* renamed from: b */
    public static String f57028b = "";

    /* renamed from: c */
    public static final C21226a f57029c = new C21226a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$a */
    public static final class C21226a {
        private C21226a() {
        }

        /* renamed from: a */
        private static String m71442a() {
            return C21225a.f57028b;
        }

        public /* synthetic */ C21226a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m71444a(String str) {
            C7573i.m23587b(str, "<set-?>");
            C21225a.f57028b = str;
        }

        /* renamed from: a */
        public final void mo57158a(boolean z) {
            if (!z) {
                if (C7163a.m22363a()) {
                    Locale locale = Locale.US;
                    C7573i.m23582a((Object) locale, "Locale.US");
                    C7573i.m23582a((Object) C1642a.m8035a(locale, "monitorAutoLogout(%b)", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)), "java.lang.String.format(locale, format, *args)");
                }
                C22345t.m73985l(true);
                C21227b.m71450a("monitor_account_business", 1, m71443a("auto_logout", m71442a()));
            }
        }

        /* renamed from: a */
        private static JSONObject m71443a(String str, String str2) {
            C21101a a = C21101a.m71159a();
            a.mo56942a("type", str);
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("error_desc", str2);
            }
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public static void m71445a(String str, Integer num) {
            C7163a.m22363a();
            JSONObject b = C21101a.m71159a().mo56942a("url_path", str).mo56940a("error_code", num).mo56943b();
            C7573i.m23582a((Object) b, "json");
            C21227b.m71450a("two_step_auth", 0, b);
        }

        /* renamed from: b */
        public static void m71447b(boolean z, String str, boolean z2, int i) {
            C7163a.m22363a();
            C21101a a = C21101a.m71159a().mo56939a("success", Boolean.valueOf(z));
            String str2 = "error_desc";
            if (str == null) {
                str = "";
            }
            JSONObject b = a.mo56942a(str2, str).mo56939a("has_sim_card", Boolean.valueOf(z2)).mo56940a("google_availability", Integer.valueOf(i)).mo56943b();
            boolean z3 = !z;
            C7573i.m23582a((Object) b, "json");
            C21227b.m71450a("sms_auto_fill", z3 ? 1 : 0, b);
        }

        /* renamed from: a */
        public static void m71446a(boolean z, String str, boolean z2, int i) {
            C7163a.m22363a();
            C21101a a = C21101a.m71159a().mo56939a("success", Boolean.valueOf(z));
            String str2 = "error_desc";
            if (str == null) {
                str = "";
            }
            JSONObject b = a.mo56942a(str2, str).mo56939a("has_sim_card", Boolean.valueOf(z2)).mo56940a("google_availability", Integer.valueOf(i)).mo56943b();
            boolean z3 = !z;
            C7573i.m23582a((Object) b, "json");
            C21227b.m71450a("phone_auto_fill", z3 ? 1 : 0, b);
        }
    }

    /* renamed from: a */
    public static final String m71436a() {
        return f57028b;
    }

    /* renamed from: a */
    public static final void m71437a(String str) {
        f57027a = str;
    }

    /* renamed from: a */
    public static final void m71438a(boolean z) {
        f57029c.mo57158a(z);
    }

    /* renamed from: a */
    public static final void m71439a(boolean z, String str, boolean z2, int i) {
        C21226a.m71446a(z, str, z2, i);
    }

    /* renamed from: b */
    public static final void m71440b(String str) {
        f57028b = str;
    }

    /* renamed from: b */
    public static final void m71441b(boolean z, String str, boolean z2, int i) {
        C21226a.m71447b(z, str, z2, i);
    }
}
