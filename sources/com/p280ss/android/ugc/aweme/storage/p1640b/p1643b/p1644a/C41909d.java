package com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.d */
public final class C41909d implements C41908c {

    /* renamed from: c */
    public static final C41910a f108986c = new C41910a(null);

    /* renamed from: a */
    public boolean f108987a;

    /* renamed from: b */
    public boolean f108988b;

    /* renamed from: d */
    private final List<File> f108989d;

    /* renamed from: e */
    private final Set<String> f108990e;

    /* renamed from: f */
    private final Set<String> f108991f;

    /* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.d$a */
    public static final class C41910a {
        private C41910a() {
        }

        public /* synthetic */ C41910a(C7571f fVar) {
            this();
        }
    }

    public C41909d() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo102946a() {
        for (File file : this.f108989d) {
            file.delete();
            C35574k.m114859a().mo70094i().mo102929a().mo102963b(file);
        }
        this.f108989d.clear();
    }

    /* renamed from: a */
    private final void m133278a(File file) {
        if (m133279b(file)) {
            this.f108989d.add(0, file);
        }
    }

    /* renamed from: b */
    private final boolean m133279b(File file) {
        Iterator it = this.f108990e.iterator();
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
            Iterator it2 = this.f108991f.iterator();
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

    public C41909d(Set<String> set, Set<String> set2) {
        C7573i.m23587b(set, "prefixWhiteList");
        C7573i.m23587b(set2, "inclusionWhiteList");
        this.f108990e = set;
        this.f108991f = set2;
        this.f108988b = true;
        this.f108989d = new ArrayList();
    }

    /* renamed from: a */
    public final void mo102944a(File file, boolean z) {
        C7573i.m23587b(file, "file");
        if (this.f108988b && z && file.isDirectory()) {
            return;
        }
        if (this.f108987a || !file.isDirectory()) {
            m133278a(file);
        }
    }

    public /* synthetic */ C41909d(Set set, Set set2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            set = C7513am.m23408a();
        }
        if ((i & 2) != 0) {
            set2 = C7513am.m23408a();
        }
        this(set, set2);
    }
}
