package com.p280ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.app.c */
public final class C22909c {

    /* renamed from: a */
    public static final String f60637a = f60637a;

    /* renamed from: b */
    public static final String f60638b = f60638b;

    /* renamed from: c */
    public static final String f60639c = f60639c;

    /* renamed from: d */
    public static final C22910a f60640d = new C22910a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.c$a */
    public static final class C22910a {
        private C22910a() {
        }

        /* renamed from: a */
        public static String m75393a() {
            return C22909c.f60638b;
        }

        /* renamed from: c */
        private static String m75394c() {
            return C22909c.f60637a;
        }

        /* renamed from: d */
        private static String m75395d() {
            return C22909c.f60639c;
        }

        /* renamed from: b */
        public final String mo59883b() {
            if (!C6399b.m19946v()) {
                StringBuilder sb = new StringBuilder();
                sb.append(m75393a());
                sb.append(C6399b.m19935k());
                return sb.toString();
            } else if (TextUtils.isEmpty(C6399b.f18694b.mo15329x())) {
                return "musically";
            } else {
                return C6399b.f18694b.mo15329x();
            }
        }

        public /* synthetic */ C22910a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final String mo59882a(String str) {
            C7573i.m23587b(str, "url");
            if (C6319n.m19593a(str)) {
                return str;
            }
            try {
                Uri parse = Uri.parse(str);
                C7573i.m23582a((Object) parse, "uri");
                String scheme = parse.getScheme();
                String b = mo59883b();
                if (C7573i.m23585a((Object) m75394c(), (Object) scheme) || C7573i.m23585a((Object) m75395d(), (Object) scheme)) {
                    str = C7634n.m23711a(str, scheme, b, false);
                }
            } catch (Exception unused) {
            }
            return str;
        }

        /* renamed from: b */
        public final boolean mo59884b(String str) {
            C7573i.m23587b(str, "scheme");
            if (C6319n.m19593a(str)) {
                return false;
            }
            if (C7573i.m23585a((Object) m75394c(), (Object) str)) {
                return true;
            }
            String b = mo59883b();
            if (C6319n.m19593a(b) || !C7573i.m23585a((Object) b, (Object) str)) {
                return false;
            }
            return true;
        }
    }
}
