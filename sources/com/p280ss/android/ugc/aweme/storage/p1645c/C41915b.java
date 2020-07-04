package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41904a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import java.io.FileFilter;
import java.util.Set;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.b */
public final class C41915b extends C41913a {

    /* renamed from: b */
    public static final C41916a f108995b = new C41916a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.b$a */
    public static final class C41916a {
        private C41916a() {
        }

        public /* synthetic */ C41916a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.storage.c.b$b */
    static final class C41917b implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Set f108996a;

        C41917b(Set set) {
            this.f108996a = set;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
            if (kotlin.text.C7634n.m23723c(r0, "wav", false) != false) goto L_0x004c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean accept(java.io.File r10) {
            /*
                r9 = this;
                boolean r0 = com.p280ss.android.ugc.aweme.storage.p1640b.C41902b.m133264a(r10)
                r1 = 0
                if (r0 == 0) goto L_0x007f
                boolean r0 = r10.exists()
                if (r0 == 0) goto L_0x007f
                java.lang.String r0 = r10.getName()
                boolean r0 = com.p280ss.android.ugc.aweme.storage.p1640b.C41902b.m133264a(r0)
                if (r0 == 0) goto L_0x007f
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r2 = "temp_"
                r3 = 0
                r4 = 2
                boolean r0 = kotlin.text.C7634n.m23721b(r0, r2, false)
                if (r0 != 0) goto L_0x004c
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r2 = "mp4"
                boolean r0 = kotlin.text.C7634n.m23723c(r0, r2, false)
                if (r0 != 0) goto L_0x004c
                java.lang.String r0 = r10.getName()
                java.lang.String r2 = "file.name"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r2 = "wav"
                boolean r0 = kotlin.text.C7634n.m23723c(r0, r2, false)
                if (r0 == 0) goto L_0x007f
            L_0x004c:
                java.util.Set r0 = r9.f108996a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                r2 = 0
            L_0x0055:
                boolean r5 = r0.hasNext()
                r6 = -1
                if (r5 == 0) goto L_0x007a
                java.lang.Object r5 = r0.next()
                if (r2 >= 0) goto L_0x0065
                kotlin.collections.C7525m.m23465b()
            L_0x0065:
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r7 = r10.getPath()
                java.lang.String r8 = "file.path"
                kotlin.jvm.internal.C7573i.m23582a(r7, r8)
                boolean r5 = kotlin.text.C7634n.m23721b(r7, r5, false)
                if (r5 == 0) goto L_0x0077
                goto L_0x007b
            L_0x0077:
                int r2 = r2 + 1
                goto L_0x0055
            L_0x007a:
                r2 = -1
            L_0x007b:
                if (r2 != r6) goto L_0x007f
                r10 = 1
                return r10
            L_0x007f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.storage.p1645c.C41915b.C41917b.accept(java.io.File):boolean");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "cache";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.CACHE;
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103481q;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sCacheDir");
        return c.mo102928a(str);
    }

    /* renamed from: k */
    private static void m133301k() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("ve_frame_cache2/");
        File a = c.mo102928a(sb.toString());
        C41909d dVar = new C41909d(null, null, 3, null);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(a);
        dVar.mo102946a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        Set a = C41911c.m133283a();
        C41909d dVar = new C41909d(a, C35574k.m114859a().mo70094i().mo102931b().mo102970b());
        m133301k();
        m133297a(a);
        m133296a(dVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        Set a = C41911c.m133283a();
        C41906b bVar = new C41906b(a, C35574k.m114859a().mo70094i().mo102931b().mo102970b());
        return m133295a(bVar) + 0 + m133299b(a) + m133298b(bVar) + m133300c(bVar);
    }

    /* renamed from: c */
    private static long m133300c(C41906b bVar) {
        bVar.mo102945a();
        return bVar.f108983a;
    }

    /* renamed from: a */
    private static long m133295a(C41906b bVar) {
        bVar.mo102945a();
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("ve_frame_cache2/");
        File a = C35574k.m114859a().mo70094i().mo102932c().mo102928a(sb.toString());
        if (a.exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(a);
        }
        return bVar.f108983a + 0;
    }

    /* renamed from: b */
    private static long m133298b(C41906b bVar) {
        bVar.mo102945a();
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103486v;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sNoCopyDraftDir");
        File a = c.mo102928a(str);
        if (a.exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(a);
        }
        return bVar.f108983a + 0;
    }

    /* renamed from: a */
    private static void m133296a(C41909d dVar) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103486v;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sNoCopyDraftDir");
        File a = c.mo102928a(str);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(a);
        dVar.mo102946a();
    }

    /* renamed from: b */
    private static long m133299b(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103481q;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sCacheDir");
        File a = c.mo102928a(str);
        long j = 0;
        if (a.exists()) {
            File[] listFiles = a.listFiles(new C41917b(set));
            C7573i.m23582a((Object) listFiles, "cacheDir.listFiles { fil…it) } == -1\n            }");
            for (File length : listFiles) {
                j += length.length();
            }
        }
        return j;
    }

    /* renamed from: a */
    private static void m133297a(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103481q;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sCacheDir");
        File a = c.mo102928a(str);
        C41904a aVar = new C41904a(set);
        C41903a aVar2 = new C41903a();
        aVar2.mo102941a((C41908c) aVar);
        aVar2.mo102942a(a);
    }
}
