package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.ies.ugc.appcontext.b */
public final class C6399b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f18693a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6399b.class), "STRING_APP_NAME", "getSTRING_APP_NAME()Ljava/lang/String;"))};

    /* renamed from: b */
    public static final C6399b f18694b = new C6399b();

    /* renamed from: c */
    private static volatile boolean f18695c;

    /* renamed from: d */
    private static volatile Application f18696d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile String f18697e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile Integer f18698f;

    /* renamed from: g */
    private static final C7541d f18699g = C7546e.m23569a(C6401b.f18717a);

    /* renamed from: h */
    private static volatile String f18700h;

    /* renamed from: i */
    private static volatile C6402c f18701i;

    /* renamed from: j */
    private static volatile String f18702j;

    /* renamed from: k */
    private static volatile C6400a f18703k;

    /* renamed from: l */
    private static volatile String f18704l;

    /* renamed from: m */
    private static volatile String f18705m;

    /* renamed from: n */
    private static volatile C6398a f18706n = new C6398a();

    /* renamed from: o */
    private static volatile int f18707o;

    /* renamed from: p */
    private static volatile int f18708p = -1;

    /* renamed from: q */
    private static volatile String f18709q = "";

    /* renamed from: r */
    private static volatile String f18710r = "";

    /* renamed from: s */
    private static volatile String f18711s = "unknown";

    /* renamed from: t */
    private static volatile String f18712t;

    /* renamed from: u */
    private static String f18713u = "";

    /* renamed from: com.bytedance.ies.ugc.appcontext.b$a */
    public static final class C6400a {

        /* renamed from: a */
        public volatile long f18714a;

        /* renamed from: b */
        public volatile String f18715b;

        /* renamed from: c */
        public volatile long f18716c;

        public C6400a() {
            this(0, null, 0, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6400a) {
                    C6400a aVar = (C6400a) obj;
                    if ((this.f18714a == aVar.f18714a) && C7573i.m23585a((Object) this.f18715b, (Object) aVar.f18715b)) {
                        if (this.f18716c == aVar.f18716c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f18714a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f18715b;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            long j2 = this.f18716c;
            return hashCode + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BussinessVersionInfo(versionCode=");
            sb.append(this.f18714a);
            sb.append(", versionName=");
            sb.append(this.f18715b);
            sb.append(", updateVersionCode=");
            sb.append(this.f18716c);
            sb.append(")");
            return sb.toString();
        }

        public C6400a(long j, String str, long j2) {
            C7573i.m23587b(str, "versionName");
            this.f18714a = j;
            this.f18715b = str;
            this.f18716c = j2;
        }

        private /* synthetic */ C6400a(long j, String str, long j2, int i, C7571f fVar) {
            this(-1, "", -1);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.b$b */
    static final class C6401b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C6401b f18717a = new C6401b();

        C6401b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m19953a();
        }

        /* renamed from: a */
        private static String m19953a() {
            Integer a = C6399b.f18698f;
            if (a != null) {
                String a2 = C6399b.m19923a(a.intValue());
                if (a2 != null) {
                    return a2;
                }
            }
            String b = C6399b.f18697e;
            if (b == null) {
                return "";
            }
            return b;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.b$c */
    public static final class C6402c {

        /* renamed from: a */
        public volatile long f18718a;

        /* renamed from: b */
        public volatile String f18719b;

        public C6402c() {
            this(0, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C6402c) {
                    C6402c cVar = (C6402c) obj;
                    if (!(this.f18718a == cVar.f18718a) || !C7573i.m23585a((Object) this.f18719b, (Object) cVar.f18719b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f18718a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f18719b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VersionInfo(versionCode=");
            sb.append(this.f18718a);
            sb.append(", versionName=");
            sb.append(this.f18719b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final boolean mo15333a() {
            if (TextUtils.isEmpty(this.f18719b) || this.f18718a == 0 || this.f18718a == -1) {
                return false;
            }
            return true;
        }

        public C6402c(long j, String str) {
            C7573i.m23587b(str, "versionName");
            this.f18718a = j;
            this.f18719b = str;
        }

        private /* synthetic */ C6402c(long j, String str, int i, C7571f fVar) {
            this(-1, "");
        }
    }

    private C6399b() {
    }

    /* renamed from: b */
    public static final C6398a m19926b() {
        return f18706n;
    }

    /* renamed from: c */
    public static boolean m19928c() {
        return f18695c;
    }

    /* renamed from: k */
    public static int m19935k() {
        return f18708p;
    }

    /* renamed from: l */
    public static String m19936l() {
        return f18709q;
    }

    /* renamed from: m */
    public static String m19937m() {
        return f18710r;
    }

    /* renamed from: n */
    public static int m19938n() {
        return f18707o;
    }

    /* renamed from: q */
    public static String m19941q() {
        return f18711s;
    }

    /* renamed from: r */
    public static String m19942r() {
        return f18712t;
    }

    /* renamed from: y */
    private final String m19948y() {
        return (String) f18699g.getValue();
    }

    /* renamed from: d */
    public final String mo15328d() {
        return m19948y();
    }

    /* renamed from: a */
    public static Context m19921a() {
        Application application = f18696d;
        if (application == null) {
            C7573i.m23583a("context");
        }
        return application;
    }

    /* renamed from: e */
    public static String m19929e() {
        String str = f18700h;
        if (str == null) {
            C7573i.m23583a("appName");
        }
        return str;
    }

    /* renamed from: f */
    public static String m19930f() {
        String str = f18702j;
        if (str == null) {
            C7573i.m23583a("flavor");
        }
        return str;
    }

    /* renamed from: g */
    public static String m19931g() {
        String str = f18705m;
        if (str == null) {
            C7573i.m23583a("releaseBuild");
        }
        return str;
    }

    /* renamed from: h */
    public static long m19932h() {
        C6400a aVar = f18703k;
        if (aVar == null) {
            C7573i.m23583a("bussinessVersionInfo");
        }
        return aVar.f18716c;
    }

    /* renamed from: i */
    public static long m19933i() {
        C6400a aVar = f18703k;
        if (aVar == null) {
            C7573i.m23583a("bussinessVersionInfo");
        }
        return aVar.f18714a;
    }

    /* renamed from: j */
    public static String m19934j() {
        C6400a aVar = f18703k;
        if (aVar == null) {
            C7573i.m23583a("bussinessVersionInfo");
        }
        return aVar.f18715b;
    }

    /* renamed from: o */
    public static long m19939o() {
        C6402c cVar = f18701i;
        if (cVar == null) {
            C7573i.m23583a("versionInfo");
        }
        return cVar.f18718a;
    }

    /* renamed from: p */
    public static String m19940p() {
        C6402c cVar = f18701i;
        if (cVar == null) {
            C7573i.m23583a("versionInfo");
        }
        return cVar.f18719b;
    }

    /* renamed from: s */
    public static boolean m19943s() {
        if (m19938n() == 0 || m19938n() == 3) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m19944t() {
        if (m19938n() == 0 || m19938n() == 3) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m19945u() {
        if (m19938n() == 0 || m19938n() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m19946v() {
        if (m19938n() == 2 || m19938n() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m19947w() {
        if (m19938n() == 1 || m19938n() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final String mo15329x() {
        if (m19947w()) {
            return "snssdk1180";
        }
        if (m19946v()) {
            return "musically";
        }
        return "";
    }

    /* renamed from: z */
    private final void m19949z() {
        boolean z;
        Application application = f18696d;
        if (application == null) {
            C7573i.m23583a("context");
        }
        String a = C6411f.m20000a(application, "meta_umeng_channel");
        if (a != null) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                f18711s = a;
                f18712t = a;
            }
        }
        Application application2 = f18696d;
        if (application2 == null) {
            C7573i.m23583a("context");
        }
        String a2 = C6411f.m20000a(application2, "GIT_BRANCH");
        if (a2 != null) {
            f18709q = a2;
        }
        Application application3 = f18696d;
        if (application3 == null) {
            C7573i.m23583a("context");
        }
        String a3 = C6411f.m20000a(application3, "GIT_SHA");
        if (a3 != null) {
            f18710r = a3;
        }
        Application application4 = f18696d;
        if (application4 == null) {
            C7573i.m23583a("context");
        }
        String a4 = C6411f.m20000a(application4, "release_build");
        if (a4 != null) {
            f18705m = a4;
        }
        if (!m19944t()) {
            Application application5 = f18696d;
            if (application5 == null) {
                C7573i.m23583a("context");
            }
            String b = C6411f.m20002b(application5, f18711s);
            if (b != null) {
                f18712t = b;
            }
        }
    }

    /* renamed from: a */
    public static String m19923a(int i) {
        try {
            Application application = f18696d;
            if (application == null) {
                C7573i.m23583a("context");
            }
            String string = application.getString(i);
            C7573i.m23582a((Object) string, "context.getString(resId)");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo15327a(C6403c cVar) {
        C7573i.m23587b(cVar, "builder");
        f18696d = cVar.mo15337a();
        f18695c = cVar.f18722b;
        f18698f = cVar.f18725e;
        f18697e = cVar.f18724d;
        f18700h = cVar.mo15339b();
        f18702j = cVar.mo15343d();
        f18701i = new C6402c(cVar.f18729i, cVar.mo15341c());
        f18704l = cVar.mo15345e();
        f18707o = cVar.f18732l;
        f18708p = cVar.f18731k;
        C6402c cVar2 = f18701i;
        if (cVar2 == null) {
            C7573i.m23583a("versionInfo");
        }
        if (!cVar2.mo15333a()) {
            Application application = f18696d;
            if (application == null) {
                C7573i.m23583a("context");
            }
            f18701i = C6411f.m19999a(application);
        }
        Application application2 = f18696d;
        if (application2 == null) {
            C7573i.m23583a("context");
        }
        f18703k = C6411f.m20001b(application2);
        m19949z();
        C6405d.m19968a(cVar.mo15337a());
        C6405d.m19969a(cVar.f18723c);
    }

    /* renamed from: a */
    public static String m19924a(Context context, String str) {
        if (context == null) {
            return "";
        }
        return C6411f.m20000a(context, str);
    }

    /* renamed from: a */
    public static final void m19925a(String str, String str2, String str3) {
        C7573i.m23587b(str, "hostI");
        C7573i.m23587b(str2, "hostChannel");
        C7573i.m23587b(str3, "hostDomestic");
        C6398a aVar = f18706n;
        aVar.f18690a = str;
        aVar.f18692c = str2;
        aVar.f18691b = str3;
    }
}
