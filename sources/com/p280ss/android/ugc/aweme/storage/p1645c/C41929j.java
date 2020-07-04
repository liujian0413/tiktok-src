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
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.storage.c.j */
public final class C41929j extends C41913a {

    /* renamed from: b */
    public static final C41930a f109001b = new C41930a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.j$a */
    public static final class C41930a {
        private C41930a() {
        }

        public /* synthetic */ C41930a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "shoot-video";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.CACHE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        m133351l();
        m133350k();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        return m133352m() + 0 + m133353n();
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103469e;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sTmpDir");
        return c.mo102928a(str);
    }

    /* renamed from: l */
    private final void m133351l() {
        C41909d dVar = new C41909d(null, C35574k.m114859a().mo70094i().mo102931b().mo102970b(), 1, null);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(mo31401c());
        dVar.mo102946a();
    }

    /* renamed from: m */
    private final long m133352m() {
        if (!mo31401c().exists()) {
            return 0;
        }
        C41906b bVar = new C41906b(null, C35574k.m114859a().mo70094i().mo102931b().mo102970b(), 1, null);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) bVar);
        aVar.mo102942a(mo31401c());
        return bVar.f108983a;
    }

    /* renamed from: k */
    private static void m133350k() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103468d;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDir");
        File a = c.mo102928a(str);
        if (a.exists() && a.isDirectory()) {
            Set a2 = C41911c.m133283a();
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
                String name = file2.getName();
                C7573i.m23582a((Object) name, "filesToDelete.name");
                if (!C7634n.m23723c(name, "-concat-v", false)) {
                    String name2 = file2.getName();
                    C7573i.m23582a((Object) name2, "filesToDelete.name");
                    if (!C7634n.m23723c(name2, "-concat-a", false)) {
                        String name3 = file2.getName();
                        C7573i.m23582a((Object) name3, "filesToDelete.name");
                        if (!C7634n.m23723c(name3, "_synthetise", false)) {
                        }
                    }
                }
                Iterator it2 = a2.iterator();
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
                    String str2 = (String) next2;
                    String path = file2.getPath();
                    C7573i.m23582a((Object) path, "filesToDelete.path");
                    if (C7634n.m23721b(path, str2, false)) {
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

    /* renamed from: n */
    private static long m133353n() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103468d;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDir");
        File a = c.mo102928a(str);
        long j = 0;
        if (a.exists() && a.isDirectory()) {
            Set a2 = C41911c.m133283a();
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
                String name = file2.getName();
                C7573i.m23582a((Object) name, "undeleted.name");
                if (!C7634n.m23721b(name, "synthetise_", false)) {
                    String name2 = file2.getName();
                    C7573i.m23582a((Object) name2, "undeleted.name");
                    if (!C7634n.m23723c(name2, "-concat-v", false)) {
                        String name3 = file2.getName();
                        C7573i.m23582a((Object) name3, "undeleted.name");
                        if (!C7634n.m23723c(name3, "-concat-a", false)) {
                        }
                    }
                    Iterator it2 = a2.iterator();
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
                        String str2 = (String) next2;
                        String path = file2.getPath();
                        C7573i.m23582a((Object) path, "undeleted.path");
                        if (C7634n.m23721b(path, str2, false)) {
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
