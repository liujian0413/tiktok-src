package com.p280ss.android.ugc.aweme.p1003am;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.am.d */
public class C22494d {

    /* renamed from: b */
    private static volatile C22494d f59939b;

    /* renamed from: a */
    public boolean f59940a = false;

    /* renamed from: c */
    private List<C22496a> f59941c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.am.d$a */
    static class C22496a {

        /* renamed from: a */
        String f59942a;

        private C22496a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C22496a) || !TextUtils.equals(((C22496a) obj).f59942a, this.f59942a)) {
                return false;
            }
            return true;
        }
    }

    private C22494d() {
    }

    /* renamed from: a */
    public static final C22494d m74385a() {
        if (f59939b == null) {
            synchronized (C22494d.class) {
                if (f59939b == null) {
                    f59939b = new C22494d();
                }
            }
        }
        return f59939b;
    }

    /* renamed from: b */
    private void m74386b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C22496a aVar = new C22496a();
            aVar.f59942a = str;
            synchronized (this) {
                if (!this.f59941c.contains(aVar)) {
                    this.f59941c.add(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59062a(List<String> list) {
        if (list != null) {
            for (String b : list) {
                m74386b(b);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo59063a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            Iterator it = this.f59941c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C22496a aVar = (C22496a) it.next();
                if (aVar != null && TextUtils.equals(aVar.f59942a, str)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }
}
