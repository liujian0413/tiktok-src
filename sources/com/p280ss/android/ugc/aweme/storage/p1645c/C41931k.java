package com.p280ss.android.ugc.aweme.storage.p1645c;

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47984g;

/* renamed from: com.ss.android.ugc.aweme.storage.c.k */
public final class C41931k extends C41913a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "synthetise-video";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.CACHE;
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103476l;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sTmpVideoDir");
        return c.mo102928a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        if (C41911c.m133284b()) {
            return true;
        }
        Set a = C41911c.m133283a();
        m133359a(a);
        m133360b(a);
        m133361c(a);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        if (C41911c.m133284b()) {
            return 0;
        }
        Set a = C41911c.m133283a();
        return m133362d(a) + 0 + m133363e(a) + m133364f(a);
    }

    /* renamed from: a */
    private final void m133359a(Set<String> set) {
        C41909d dVar = new C41909d(set, C35574k.m114859a().mo70094i().mo102931b().mo102970b());
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(mo31401c());
        dVar.mo102946a();
    }

    /* renamed from: c */
    private static void m133361c(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103477m;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sParallelUploadDir");
        File a = c.mo102928a(str);
        C41909d dVar = new C41909d(set, C35574k.m114859a().mo70094i().mo102931b().mo102970b());
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(a);
        dVar.mo102946a();
    }

    /* renamed from: d */
    private final long m133362d(Set<String> set) {
        C41906b bVar = new C41906b(set, C35574k.m114859a().mo70094i().mo102931b().mo102970b());
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) bVar);
        aVar.mo102942a(mo31401c());
        return bVar.f108983a;
    }

    /* renamed from: f */
    private static long m133364f(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103477m;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sParallelUploadDir");
        File a = c.mo102928a(str);
        Set b = C35574k.m114859a().mo70094i().mo102931b().mo102970b();
        if (!a.exists()) {
            return 0;
        }
        C41906b bVar = new C41906b(set, b);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) bVar);
        aVar.mo102942a(a);
        return 0 + bVar.f108983a;
    }

    /* renamed from: b */
    private static void m133360b(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103468d;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDir");
        File a = c.mo102928a(str);
        if (a.exists() && a.isDirectory()) {
            File[] listFiles = a.listFiles();
            C7573i.m23582a((Object) listFiles, "filesRoot.listFiles()");
            Iterable c2 = C7519g.m23444c((T[]) listFiles);
            Collection arrayList = new ArrayList();
            Iterator it = c2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                File file = (File) next;
                if (file.exists() && file.isFile()) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (File file2 : (List) arrayList) {
                if (C47984g.m148940a(file2, "synthetise_") || C47984g.m148942b(file2, "_synthetise")) {
                    Iterator it2 = set.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next2 = it2.next();
                        if (i < 0) {
                            C7525m.m23465b();
                        }
                        if (C47984g.m148940a(file2, (String) next2)) {
                            break;
                        }
                        i++;
                    }
                    if (-1 == i) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private static long m133363e(Set<String> set) {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103468d;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDir");
        File a = c.mo102928a(str);
        long j = 0;
        if (a.exists() && a.isDirectory()) {
            File[] listFiles = a.listFiles();
            C7573i.m23582a((Object) listFiles, "filesRoot.listFiles()");
            Iterable c2 = C7519g.m23444c((T[]) listFiles);
            Collection arrayList = new ArrayList();
            Iterator it = c2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                File file = (File) next;
                if (file.exists() && file.isFile()) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (File file2 : (List) arrayList) {
                if ((C47984g.m148940a(file2, "synthetise_") && (C47984g.m148942b(file2, "-concat-v") || C47984g.m148942b(file2, "-concat-a"))) || C47984g.m148942b(file2, "_synthetise")) {
                    Iterator it2 = set.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next2 = it2.next();
                        if (i < 0) {
                            C7525m.m23465b();
                        }
                        if (C47984g.m148940a(file2, (String) next2)) {
                            break;
                        }
                        i++;
                    }
                    if (-1 == i) {
                        j += file2.length();
                    }
                }
            }
        }
        return j;
    }
}
