package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.f */
public final class C29371f {

    /* renamed from: a */
    private Map<String, C29370e> f77407a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.h.f$a */
    static class C29372a {

        /* renamed from: a */
        public static final C29371f f77408a = new C29371f();
    }

    /* renamed from: a */
    public static C29371f m96475a() {
        return C29372a.f77408a;
    }

    /* renamed from: b */
    public final boolean mo75105b() {
        if (this.f77407a.isEmpty()) {
            return false;
        }
        for (C29370e eVar : this.f77407a.values()) {
            if (eVar.f77398c.mo104684c(16777216)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo75104b(String str) {
        if (!this.f77407a.isEmpty()) {
            this.f77407a.remove(str);
        }
    }

    /* renamed from: c */
    public final C29370e mo75106c(String str) {
        if (this.f77407a.isEmpty()) {
            return null;
        }
        return (C29370e) this.f77407a.get(str);
    }

    /* renamed from: a */
    public final void mo75101a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f77407a.clear();
        }
        Iterator it = this.f77407a.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo75103a(String str, C29370e eVar) {
        this.f77407a.put(str, eVar);
    }

    /* renamed from: a */
    public final void mo75102a(String str, int i) {
        C29370e c = mo75106c(str);
        if (c != null) {
            c.f77397b = i;
        }
    }
}
