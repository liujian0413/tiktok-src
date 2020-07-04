package com.p280ss.android.ugc.aweme.storage.p1645c;

import android.app.Application;
import com.p280ss.android.ugc.aweme.filter.C29341z;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.f */
public final class C41923f extends C41913a {

    /* renamed from: b */
    public static final C41924a f108999b = new C41924a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.f$a */
    public static final class C41924a {
        private C41924a() {
        }

        public /* synthetic */ C41924a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "filter";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.RESOURCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        m133328l();
        m133329m();
        m133327k();
        C29341z.m96263b();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        Set a = C41911c.m133283a();
        return m133325a(a) + m133326b(a);
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103482r;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sFilterDir");
        return c.mo102928a(str);
    }

    /* renamed from: m */
    private final void m133329m() {
        if (mo31401c().exists()) {
            C41909d dVar = new C41909d(C41911c.m133283a(), null, 2, null);
            dVar.f108987a = true;
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) dVar);
            aVar.mo102942a(mo31401c());
            dVar.mo102946a();
        }
    }

    /* renamed from: l */
    private static void m133328l() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().filesDir");
        File a = c.mo102927a(filesDir, "filter");
        if (a.exists()) {
            C41909d dVar = new C41909d(C41911c.m133283a(), null, 2, null);
            dVar.f108987a = true;
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) dVar);
            aVar.mo102942a(a);
            dVar.mo102946a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3 != false) goto L_0x0042;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m133327k() {
        /*
            com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.port.in.u r0 = r0.mo70090e()
            java.util.List r0 = r0.mo90405c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.ss.android.ugc.aweme.draft.model.c r3 = (com.p280ss.android.ugc.aweme.draft.model.C27311c) r3
            int r4 = r3.f72042k
            r5 = 1
            r6 = 0
            if (r4 < 0) goto L_0x0041
            com.ss.android.ugc.aweme.draft.model.b r3 = r3.f72031S
            java.lang.String r3 = r3.f71961Y
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x003d
            int r3 = r3.length()
            if (r3 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            if (r3 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0019
            r1.add(r2)
            goto L_0x0019
        L_0x0048:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C7525m.m23469a(r1, r2)
            r0.<init>(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r1.iterator()
        L_0x005d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.draft.model.c r2 = (com.p280ss.android.ugc.aweme.draft.model.C27311c) r2
            com.ss.android.ugc.aweme.draft.model.b r3 = r2.f72031S
            com.ss.android.ugc.aweme.port.in.n r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.filter.e.a r4 = r4.mo70097l()
            com.ss.android.ugc.aweme.filter.e.c r4 = r4.mo74949b()
            int r5 = r2.f72042k
            com.ss.android.ugc.aweme.filter.g r4 = r4.mo74962a(r5)
            java.lang.String r4 = r4.mo74978b()
            r3.f71961Y = r4
            com.ss.android.ugc.aweme.port.in.n r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.port.in.u r3 = r3.mo70090e()
            long r2 = r3.mo90400a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r2)
            goto L_0x005d
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.storage.p1645c.C41923f.m133327k():void");
    }

    /* renamed from: b */
    private static long m133326b(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103482r;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sFilterDir");
        File a = c.mo102928a(str);
        C41906b bVar = new C41906b(set, null, 2, null);
        if (a.exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(a);
        }
        return bVar.f108983a + 0;
    }

    /* renamed from: a */
    private static long m133325a(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().filesDir");
        File a = c.mo102927a(filesDir, "filter");
        C41906b bVar = new C41906b(set, null, 2, null);
        if (a.exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(a);
        }
        return bVar.f108983a + 0;
    }
}
