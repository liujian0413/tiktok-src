package com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.b */
public final class C41906b implements C41908c {

    /* renamed from: b */
    public static final C41907a f108982b = new C41907a(null);

    /* renamed from: a */
    public long f108983a;

    /* renamed from: c */
    private final Set<String> f108984c;

    /* renamed from: d */
    private final Set<String> f108985d;

    /* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.b$a */
    public static final class C41907a {
        private C41907a() {
        }

        public /* synthetic */ C41907a(C7571f fVar) {
            this();
        }
    }

    public C41906b() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo102945a() {
        this.f108983a = 0;
    }

    /* renamed from: a */
    private final boolean m133274a(File file) {
        if (!file.isFile()) {
            return false;
        }
        Iterator it = this.f108984c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                C7525m.m23465b();
            }
            String str = (String) next;
            String path = file.getPath();
            C7573i.m23582a((Object) path, "file.path");
            if (C7634n.m23721b(path, str, false)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            Iterator it2 = this.f108985d.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next2 = it2.next();
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                String str2 = (String) next2;
                String path2 = file.getPath();
                C7573i.m23582a((Object) path2, "file.path");
                if (C7634n.m23776c((CharSequence) path2, (CharSequence) str2, false)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return true;
            }
        }
        return false;
    }

    public C41906b(Set<String> set, Set<String> set2) {
        C7573i.m23587b(set, "prefixWhiteList");
        C7573i.m23587b(set2, "inclusionWhiteList");
        this.f108984c = set;
        this.f108985d = set2;
    }

    /* renamed from: a */
    public final void mo102944a(File file, boolean z) {
        C7573i.m23587b(file, "file");
        if (m133274a(file)) {
            this.f108983a += file.length();
        }
    }

    public /* synthetic */ C41906b(Set set, Set set2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            set = C7513am.m23408a();
        }
        if ((i & 2) != 0) {
            set2 = C7513am.m23408a();
        }
        this(set, set2);
    }
}
