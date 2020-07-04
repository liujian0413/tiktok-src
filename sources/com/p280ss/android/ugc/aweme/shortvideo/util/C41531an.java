package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.os.Looper;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.agilelogger.C19178e;
import com.p280ss.android.agilelogger.p840d.C19176b;
import com.p280ss.android.agilelogger.utils.FormatUtils.TYPE;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an */
public final class C41531an {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f107999a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41531an.class), "isLogEnable", "isLogEnable()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41531an.class), "tagWhiteList", "getTagWhiteList()Ljava/util/Set;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41531an.class), "printer", "getPrinter()Lcom/ss/android/agilelogger/printer/AndroidPrinter;"))};

    /* renamed from: b */
    public static final C41531an f108000b = new C41531an();

    /* renamed from: c */
    private static final C7541d f108001c = C7546e.m23569a(C41532a.f108004a);

    /* renamed from: d */
    private static final C7541d f108002d = C7546e.m23569a(C41534c.f108006a);

    /* renamed from: e */
    private static final C7541d f108003e = C7546e.m23569a(C41533b.f108005a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an$a */
    static final class C41532a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C41532a f108004a = new C41532a();

        C41532a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m132290a() {
            return C7573i.m23585a((Object) "__ies_tools_android_opt_test__", (Object) C6399b.m19941q());
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m132290a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an$b */
    static final class C41533b extends Lambda implements C7561a<C19176b> {

        /* renamed from: a */
        public static final C41533b f108005a = new C41533b();

        C41533b() {
            super(0);
        }

        /* renamed from: a */
        private static C19176b m132291a() {
            return new C19176b();
        }

        public final /* synthetic */ Object invoke() {
            return m132291a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an$c */
    static final class C41534c extends Lambda implements C7561a<Set<String>> {

        /* renamed from: a */
        public static final C41534c f108006a = new C41534c();

        C41534c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m132292a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0042 A[Catch:{ NameNotFoundException -> 0x0058 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.Set<java.lang.String> m132292a() {
            /*
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                java.util.Set r0 = (java.util.Set) r0
                android.app.Application r1 = com.p280ss.android.ugc.aweme.framework.p1276e.C29960a.m98230a()     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = "AppProvider.getApp()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NameNotFoundException -> 0x0058 }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0058 }
                android.app.Application r2 = com.p280ss.android.ugc.aweme.framework.p1276e.C29960a.m98230a()     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r3 = "AppProvider.getApp()"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0058 }
                r3 = 128(0x80, float:1.794E-43)
                android.content.pm.ApplicationInfo r1 = com.p280ss.android.ugc.aweme.shortvideo.util.C41535ao.m132293a(r1, r2, r3)     // Catch:{ NameNotFoundException -> 0x0058 }
                android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r2 = "tools_opt_tag"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ NameNotFoundException -> 0x0058 }
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ NameNotFoundException -> 0x0058 }
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x003f
                int r2 = r2.length()     // Catch:{ NameNotFoundException -> 0x0058 }
                if (r2 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r2 = 0
                goto L_0x0040
            L_0x003f:
                r2 = 1
            L_0x0040:
                if (r2 != 0) goto L_0x0058
                r5 = r1
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ NameNotFoundException -> 0x0058 }
                java.lang.String r1 = ","
                r6[r3] = r1     // Catch:{ NameNotFoundException -> 0x0058 }
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.util.List r1 = kotlin.text.C7634n.m23768b(r5, r6, false, 0)     // Catch:{ NameNotFoundException -> 0x0058 }
                java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ NameNotFoundException -> 0x0058 }
                r0.addAll(r1)     // Catch:{ NameNotFoundException -> 0x0058 }
            L_0x0058:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.util.C41531an.C41534c.m132292a():java.util.Set");
        }
    }

    private C41531an() {
    }

    /* renamed from: a */
    private final boolean m132287a() {
        return ((Boolean) f108001c.getValue()).booleanValue();
    }

    /* renamed from: b */
    private final Set<String> m132288b() {
        return (Set) f108002d.getValue();
    }

    /* renamed from: c */
    private final C19176b m132289c() {
        return (C19176b) f108003e.getValue();
    }

    /* renamed from: a */
    public static final void m132286a(int i, String str, String str2) {
        C7573i.m23587b(str, "tag");
        C7573i.m23587b(str2, "message");
        if (f108000b.m132287a() && (!(!f108000b.m132288b().isEmpty()) || f108000b.m132288b().contains(str))) {
            Thread currentThread = Thread.currentThread();
            C7573i.m23582a((Object) currentThread, "Thread.currentThread()");
            int i2 = i;
            String str3 = str;
            C19178e a = C19178e.m62883a(i2, str3, "", currentThread.getId(), C7573i.m23585a((Object) Looper.myLooper(), (Object) Looper.getMainLooper()));
            a.f51852g = TYPE.MSG;
            a.f51853h = str2;
            f108000b.m132289c();
            C19176b.m62881a(a);
        }
    }
}
