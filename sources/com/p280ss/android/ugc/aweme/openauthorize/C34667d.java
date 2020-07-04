package com.p280ss.android.ugc.aweme.openauthorize;

import com.C1642a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.d */
public final class C34667d {

    /* renamed from: a */
    public static final String f90442a = f90442a;

    /* renamed from: b */
    public static final String f90443b = f90443b;

    /* renamed from: c */
    public static final int f90444c = 1;

    /* renamed from: d */
    public static final int f90445d = 2;

    /* renamed from: e */
    public static final C34668a f90446e = new C34668a(null);

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.d$a */
    public static final class C34668a {
        private C34668a() {
        }

        /* renamed from: a */
        public static int m111961a() {
            return C34667d.f90444c;
        }

        /* renamed from: b */
        public static int m111963b() {
            return C34667d.f90445d;
        }

        public /* synthetic */ C34668a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static JSONObject m111962a(int i, String str, String str2) {
            C42967ba a = C42967ba.m136396a();
            if (i != 0) {
                C42967ba a2 = a.mo104679a("error_code", Integer.valueOf(i)).mo104680a("error_desc", str);
                String str3 = "client_key";
                if (str2 == null) {
                    str2 = "";
                }
                a2.mo104680a(str3, str2);
            }
            JSONObject b = a.mo104681b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo87964a(int i, int i2, String str, String str2) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "monitorAuthorize(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            C6893q.m21444a(C34667d.f90443b, i, m111962a(i2, str, str2));
        }
    }
}
