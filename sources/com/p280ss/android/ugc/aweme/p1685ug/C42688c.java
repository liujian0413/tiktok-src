package com.p280ss.android.ugc.aweme.p1685ug;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.taobao.android.dexposed.ClassUtils;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.ug.c */
public final class C42688c {

    /* renamed from: a */
    public static final C42688c f110954a = new C42688c();

    /* renamed from: b */
    public static final C42689a f110955b = new C42689a(null);

    /* renamed from: c */
    private long f110956c;

    /* renamed from: d */
    private final Keva f110957d = Keva.getRepo("first_install_version");

    /* renamed from: com.ss.android.ugc.aweme.ug.c$a */
    public static final class C42689a {
        private C42689a() {
        }

        /* renamed from: a */
        public static C42688c m135545a() {
            return C42688c.f110954a;
        }

        public /* synthetic */ C42689a(C7571f fVar) {
            this();
        }
    }

    private C42688c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m135541a() {
        /*
            r5 = this;
            long r0 = r5.f110956c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x000b
            long r0 = r5.f110956c
            return r0
        L_0x000b:
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            if (r0 == 0) goto L_0x0021
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x002d }
            r4 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r4)     // Catch:{ Exception -> 0x002d }
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            long r0 = r0.firstInstallTime     // Catch:{ Exception -> 0x002d }
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            r5.f110956c = r0     // Catch:{ Exception -> 0x002d }
            long r0 = r5.f110956c     // Catch:{ Exception -> 0x002d }
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1685ug.C42688c.m135541a():long");
    }

    /* renamed from: a */
    private static long m135542a(String str) {
        long parseLong = Long.parseLong(C7634n.m23711a(str, ClassUtils.PACKAGE_SEPARATOR, "", false));
        if (C6399b.m19946v()) {
            return parseLong - 500;
        }
        return parseLong;
    }

    /* renamed from: a */
    private final boolean m135543a(long j, long j2) {
        Boolean a = C28580o.m93828a();
        C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
        if (a.booleanValue()) {
            this.f110957d.storeLong("version_code", m135542a(C6399b.m19940p()));
        }
        long j3 = this.f110957d.getLong("version_code", -1);
        long a2 = m135541a();
        if (a2 <= 0 || a2 <= j || j3 < j2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo104287a(String str, long j) {
        long j2;
        C7573i.m23587b(str, "expectimeStamp");
        if (str.length() == 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("000");
            str = sb.toString();
        }
        if (str.length() != 13) {
            return false;
        }
        Long e = C7634n.m23707e(str);
        if (e != null) {
            j2 = e.longValue();
        } else {
            j2 = 0;
        }
        return m135543a(j2, 940);
    }
}
