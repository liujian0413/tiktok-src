package com.p280ss.android.ugc.aweme.account.p950k;

import com.C1642a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.f */
public final class C21235f {

    /* renamed from: a */
    public static final String f57044a = f57044a;

    /* renamed from: b */
    public static final String f57045b = f57045b;

    /* renamed from: c */
    public static final String f57046c = f57046c;

    /* renamed from: d */
    public static final C21236a f57047d = new C21236a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.k.f$a */
    public static final class C21236a {
        private C21236a() {
        }

        public /* synthetic */ C21236a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo57168a(int i, int i2, int i3, String str) {
            mo57169a(i, i2, i3, str, null);
        }

        /* renamed from: a */
        private static JSONObject m71486a(int i, String str, int i2, String str2) {
            C21101a a = C21101a.m71159a();
            if (i != 0) {
                a.mo56940a("error_code", Integer.valueOf(i)).mo56942a("error_desc", str);
            }
            a.mo56940a("send_type", Integer.valueOf(i2));
            if (str2 != null) {
                a.mo56942a("send_from", str2);
            }
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: b */
        public final void mo57170b(int i, int i2, int i3, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "SendWhatsappCode(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21235f.f57046c, i, m71486a(i3, str, i2, "choose_dialog"));
        }

        /* renamed from: a */
        public final void mo57169a(int i, int i2, int i3, String str, String str2) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "SendCode(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a(C21235f.f57045b, i, m71486a(i3, str, i2, str2));
        }
    }

    /* renamed from: a */
    public static final void m71483a(int i, int i2, int i3, String str) {
        f57047d.mo57168a(i, i2, i3, str);
    }

    /* renamed from: a */
    public static final void m71484a(int i, int i2, int i3, String str, String str2) {
        f57047d.mo57169a(i, i2, i3, str, str2);
    }

    /* renamed from: b */
    public static final void m71485b(int i, int i2, int i3, String str) {
        f57047d.mo57170b(i, i2, i3, str);
    }
}
