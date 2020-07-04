package com.p280ss.android.ugc.aweme.storage.p1639a;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41895a;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import java.util.Iterator;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.storage.a.a */
public final class C41892a implements C41940c {

    /* renamed from: a */
    public static final C41893a f108969a = new C41893a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.a.a$a */
    public static final class C41893a {
        private C41893a() {
        }

        public /* synthetic */ C41893a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final File mo102928a(String str) {
        C7573i.m23587b(str, "path");
        File file = new File(str);
        m133232a(file);
        return file;
    }

    /* renamed from: a */
    private static boolean m133232a(File file) {
        String str;
        C7573i.m23587b(file, "file");
        boolean z = true;
        if (!C41911c.f108992a.mo102947c()) {
            return true;
        }
        String path = file.getPath();
        C7573i.m23582a((Object) path, "path");
        String str2 = C39811er.f103468d;
        C7573i.m23582a((Object) str2, "ShortVideoConfig2.sDir");
        if (!C7634n.m23721b(path, str2, false)) {
            return true;
        }
        Iterator it = C41895a.m133242a().iterator();
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
            if (C7634n.m23721b(path, (String) next, false)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            z = false;
        }
        if (!z) {
            String parent = file.getParent();
            C7573i.m23582a((Object) parent, "file.parent");
            if (C7634n.m23723c(parent, "/", false)) {
                str = file.getParent();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(file.getParent());
                sb.append("/");
                str = sb.toString();
            }
            z = C7573i.m23585a((Object) str, (Object) C39811er.f103468d);
        }
        if (!z) {
            C35574k.m114859a().mo70094i().mo102929a().mo102958a(file);
        }
        return z;
    }

    /* renamed from: a */
    public final File mo102927a(File file, String str) {
        C7573i.m23587b(file, "parent");
        C7573i.m23587b(str, "child");
        File file2 = new File(file, str);
        m133232a(file2);
        return file2;
    }
}
