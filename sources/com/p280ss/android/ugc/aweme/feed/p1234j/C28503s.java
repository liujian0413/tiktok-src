package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;

/* renamed from: com.ss.android.ugc.aweme.feed.j.s */
public final class C28503s {

    /* renamed from: a */
    private static C25673a f75125a;

    /* renamed from: b */
    private static JediViewModel f75126b;

    /* renamed from: c */
    private static C32009e f75127c;

    /* renamed from: a */
    public static C25673a m93677a() {
        return f75125a;
    }

    /* renamed from: b */
    public static JediViewModel m93681b() {
        return f75126b;
    }

    /* renamed from: c */
    public static C32009e m93685c() {
        return f75127c;
    }

    /* renamed from: a */
    public static void m93678a(JediViewModel jediViewModel) {
        f75126b = jediViewModel;
    }

    /* renamed from: a */
    public static void m93679a(C25673a aVar) {
        f75125a = aVar;
    }

    /* renamed from: b */
    public static void m93682b(JediViewModel jediViewModel) {
        if (f75126b == jediViewModel) {
            f75126b = null;
        }
    }

    /* renamed from: a */
    public static void m93680a(C32009e eVar) {
        f75127c = eVar;
    }

    /* renamed from: b */
    public static void m93683b(C25673a aVar) {
        if (f75125a == aVar) {
            f75125a = null;
        }
    }

    /* renamed from: b */
    public static void m93684b(C32009e eVar) {
        if (f75127c == eVar) {
            f75127c = null;
        }
    }
}
