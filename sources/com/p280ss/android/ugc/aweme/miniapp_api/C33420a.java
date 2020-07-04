package com.p280ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.p1168df.base.C26220a.C26221a;
import com.p280ss.android.ugc.aweme.p1168df.base.p1169a.C26224c;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.a */
public final class C33420a {

    /* renamed from: a */
    public static C33422a f87273a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.a$a */
    public interface C33422a {
        /* renamed from: a */
        void mo18614a();
    }

    /* renamed from: a */
    public static void m108080a(C33422a aVar) {
        f87273a = aVar;
    }

    /* renamed from: a */
    public static boolean m108081a(final Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        final C33435c cVar = new C33435c((Activity) context);
        if (!C33435c.m86193f()) {
            return false;
        }
        cVar.mo67782d();
        cVar.f69118c = new C26221a() {
            /* renamed from: b */
            public final void mo16974b() {
                cVar.mo67783e();
            }

            /* renamed from: a */
            public final void mo16973a() {
                C26224c.m86221a(context);
                if (C33420a.f87273a != null) {
                    C33420a.f87273a.mo18614a();
                }
                cVar.mo67783e();
            }
        };
        return cVar.mo67781c();
    }
}
