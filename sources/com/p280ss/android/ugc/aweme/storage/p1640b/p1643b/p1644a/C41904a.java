package com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.a */
public final class C41904a implements C41908c {

    /* renamed from: a */
    public static final C41905a f108980a = new C41905a(null);

    /* renamed from: b */
    private final Set<String> f108981b;

    /* renamed from: com.ss.android.ugc.aweme.storage.b.b.a.a$a */
    public static final class C41905a {
        private C41905a() {
        }

        public /* synthetic */ C41905a(C7571f fVar) {
            this();
        }
    }

    public C41904a() {
        this(null, 1, null);
    }

    public C41904a(Set<String> set) {
        C7573i.m23587b(set, "prefixWhiteList");
        this.f108981b = set;
    }

    /* renamed from: a */
    private final void m133271a(File file) {
        if (m133272b(file)) {
            file.delete();
        }
    }

    /* renamed from: b */
    private final boolean m133272b(File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        Iterator it = this.f108981b.iterator();
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
            C7573i.m23582a((Object) name, "name");
            if (C7634n.m23723c(name, "mp4", false) || (C7634n.m23721b(name, "temp_", false) && C7634n.m23723c(name, "wav", false))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo102944a(File file, boolean z) {
        C7573i.m23587b(file, "file");
        if (!z && file.isFile()) {
            m133271a(file);
        }
    }

    private /* synthetic */ C41904a(Set set, int i, C7571f fVar) {
        this(C7513am.m23408a());
    }
}
