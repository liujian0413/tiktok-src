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

/* renamed from: com.ss.android.ugc.aweme.account.k.c */
public final class C21229c {

    /* renamed from: a */
    public static final String f57034a = f57034a;

    /* renamed from: b */
    public static final String f57035b = f57035b;

    /* renamed from: c */
    public static final String f57036c = f57036c;

    /* renamed from: d */
    public static final C21230a f57037d = new C21230a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.k.c$a */
    public static final class C21230a {
        private C21230a() {
        }

        public /* synthetic */ C21230a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static JSONObject m71456a(int i, String str, String str2) {
            C21101a a = C21101a.m71159a();
            if (i != 0) {
                a.mo56940a("error_code", Integer.valueOf(i)).mo56942a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("scene", str2);
            }
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        public final void mo57159a(int i, String str, int i2, String str2) {
            C7573i.m23587b(str, "scene");
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "BindMobile(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21229c.f57035b, i, m71456a(i2, str2, str));
        }

        /* renamed from: b */
        public final void mo57160b(int i, String str, int i2, String str2) {
            C7573i.m23587b(str, "scene");
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "ChangeMobile(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21229c.f57036c, i, m71456a(i2, str2, str));
        }
    }

    /* renamed from: a */
    public static final void m71454a(int i, String str, int i2, String str2) {
        f57037d.mo57159a(i, str, i2, str2);
    }

    /* renamed from: b */
    public static final void m71455b(int i, String str, int i2, String str2) {
        f57037d.mo57160b(i, str, i2, str2);
    }
}
