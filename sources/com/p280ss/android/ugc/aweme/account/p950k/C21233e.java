package com.p280ss.android.ugc.aweme.account.p950k;

import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.e */
public final class C21233e {

    /* renamed from: a */
    public static final String f57040a = f57040a;

    /* renamed from: b */
    public static final String f57041b = f57041b;

    /* renamed from: c */
    public static final String f57042c = f57042c;

    /* renamed from: d */
    public static final C21234a f57043d = new C21234a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.k.e$a */
    public static final class C21234a {
        private C21234a() {
        }

        public /* synthetic */ C21234a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static JSONObject m71480a(Integer num, String str, String str2) {
            C7573i.m23587b(str2, "scene");
            C21101a a = C21101a.m71159a();
            if (num == null || num.intValue() != 0) {
                a.mo56940a("error_code", num).mo56942a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("extra", str2);
            }
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo57166a(int i, Integer num, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "SwitchAccount(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), num, str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21233e.f57042c, i, m71480a(num, str, ""));
        }

        /* renamed from: a */
        public final void mo57167a(int i, String str, int i2, String str2) {
            C7573i.m23587b(str, "scene");
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "Logout(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21233e.f57041b, i, m71480a(Integer.valueOf(i2), str2, str));
        }
    }

    /* renamed from: a */
    public static final void m71479a(int i, String str, int i2, String str2) {
        f57043d.mo57167a(i, str, i2, str2);
    }
}
