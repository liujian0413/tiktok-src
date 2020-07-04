package com.p280ss.android.ugc.aweme.sharer.p1545b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.c */
public final class C38347c {

    /* renamed from: a */
    public static final String f99546a = f99546a;

    /* renamed from: b */
    public static final String f99547b = f99547b;

    /* renamed from: c */
    public static final String f99548c = f99548c;

    /* renamed from: d */
    public static final String f99549d = f99549d;

    /* renamed from: e */
    public static final String f99550e = f99550e;

    /* renamed from: f */
    public static final String f99551f = f99551f;

    /* renamed from: g */
    public static final String f99552g = "title";

    /* renamed from: h */
    public static final String f99553h = f99553h;

    /* renamed from: i */
    public static final String f99554i = f99554i;

    /* renamed from: j */
    public static final String f99555j = f99555j;

    /* renamed from: k */
    public static final String f99556k = f99556k;

    /* renamed from: l */
    public static final String f99557l = f99557l;

    /* renamed from: m */
    public static final C38349b f99558m = new C38349b(null);

    /* renamed from: n */
    private final Context f99559n;

    /* renamed from: com.ss.android.ugc.aweme.sharer.b.c$a */
    public static final class C38348a {

        /* renamed from: a */
        public static final C38348a f99560a = new C38348a();

        private C38348a() {
        }

        /* renamed from: a */
        private static void m122514a(Builder builder, String str, List<String> list) {
            if (list != null) {
                builder.appendQueryParameter(str, new JSONArray(list).toString());
            }
        }

        /* renamed from: a */
        public final Uri mo95937a(int i, String str, String str2, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
            boolean z;
            C7573i.m23587b(list, C38347c.f99554i);
            C7573i.m23587b(list2, C38347c.f99555j);
            C7573i.m23587b(list3, C38347c.f99556k);
            C7573i.m23587b(list4, C38347c.f99557l);
            Builder builder = new Builder();
            builder.scheme(C38349b.m122516a());
            builder.authority(C38349b.m122517b());
            builder.appendQueryParameter(C38349b.m122518c(), String.valueOf(i));
            boolean z2 = false;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    builder.appendQueryParameter(C38349b.m122519d(), str);
                }
            }
            if (str2 != null) {
                if (str2.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    builder.appendQueryParameter(C38349b.m122520e(), str2);
                }
            }
            m122514a(builder, C38349b.m122521f(), list);
            m122514a(builder, C38349b.m122522g(), list2);
            m122514a(builder, C38349b.m122523h(), list3);
            m122514a(builder, C38349b.m122524i(), list4);
            Uri build = builder.build();
            C7573i.m23582a((Object) build, "uriBuilder.build()");
            return build;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.b.c$b */
    public static final class C38349b {
        private C38349b() {
        }

        /* renamed from: a */
        public static String m122516a() {
            return C38347c.f99549d;
        }

        /* renamed from: b */
        public static String m122517b() {
            return C38347c.f99550e;
        }

        /* renamed from: c */
        public static String m122518c() {
            return C38347c.f99551f;
        }

        /* renamed from: d */
        public static String m122519d() {
            return C38347c.f99552g;
        }

        /* renamed from: e */
        public static String m122520e() {
            return C38347c.f99553h;
        }

        /* renamed from: f */
        public static String m122521f() {
            return C38347c.f99554i;
        }

        /* renamed from: g */
        public static String m122522g() {
            return C38347c.f99555j;
        }

        /* renamed from: h */
        public static String m122523h() {
            return C38347c.f99556k;
        }

        /* renamed from: i */
        public static String m122524i() {
            return C38347c.f99557l;
        }

        public /* synthetic */ C38349b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private final void m122509a() {
        if (!m122511b()) {
            m122512c();
        }
    }

    /* renamed from: c */
    private final void m122512c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(f99547b));
        this.f99559n.startActivity(intent);
    }

    /* renamed from: b */
    private final boolean m122511b() {
        if (!m122510a(f99546a)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(f99548c));
        this.f99559n.startActivity(intent);
        return true;
    }

    public C38347c(Context context) {
        C7573i.m23587b(context, "context");
        this.f99559n = context;
    }

    /* renamed from: a */
    private final boolean m122510a(String str) {
        try {
            if (this.f99559n.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95936a(int i, String str, String str2, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, f99553h);
        C7573i.m23587b(list, f99554i);
        C7573i.m23587b(list2, f99555j);
        C7573i.m23587b(list3, f99556k);
        C7573i.m23587b(list4, f99557l);
        Uri a = C38348a.f99560a.mo95937a(1, str, str2, list, list2, list3, list4);
        Intent intent = new Intent();
        intent.setData(a);
        try {
            this.f99559n.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            m122509a();
        }
    }
}
