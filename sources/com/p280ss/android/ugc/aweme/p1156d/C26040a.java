package com.p280ss.android.ugc.aweme.p1156d;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10984b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p1035h.C22993c;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.d.a */
public final class C26040a {

    /* renamed from: a */
    public static final C26040a f68815a = new C26040a();

    /* renamed from: b */
    private static boolean f68816b;

    private C26040a() {
    }

    /* renamed from: a */
    public static void m85518a(C10984b bVar) {
        C7573i.m23587b(bVar, "sessionChangeEvent");
        switch (C26041b.f68817a[bVar.f29708a.ordinal()]) {
            case 1:
                if (!f68816b) {
                    f68816b = true;
                    C19282c.m63182a(C6399b.m19921a(), "monitor", "launch");
                    return;
                }
                return;
            case 2:
                C33221a.m107189a("monitor", "launch", bVar.f29710c);
                C6903bc.m21460A().mo90598a(false);
                return;
            case 3:
                C19282c.m63182a(C6399b.m19921a(), "monitor", "terminate");
                C33221a.m107189a("monitor", "terminate", bVar.f29710c);
                f68816b = false;
                if (C22993c.m75630a()) {
                    C22993c.m75631b().mo59986c();
                    break;
                }
                break;
        }
    }
}
