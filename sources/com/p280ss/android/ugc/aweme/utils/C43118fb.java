package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.lighten.core.C12133n;
import com.p280ss.android.ugc.aweme.app.fabric.C22976a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.utils.fb */
public final class C43118fb {
    /* renamed from: a */
    public static void m136745a() {
        m136746a(10);
    }

    /* renamed from: a */
    public static void m136746a(int i) {
        m136747b(i);
        C12133n.m35305b(i);
        if (5 == i) {
            C6921a.m21555a("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
        } else if (10 == i) {
            C6921a.m21555a("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
        } else if (40 == i) {
            C6921a.m21555a("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
        } else {
            StringBuilder sb = new StringBuilder("trimMemory level:");
            sb.append(i);
            C6921a.m21555a(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m136747b(int i) {
        try {
            int a = (int) ((C22976a.m75588a(C6399b.m19921a()) / 1024) / 1024);
            StringBuilder sb = new StringBuilder();
            sb.append(C6405d.m19984g().getClass().getName());
            sb.append("   freeMem :");
            sb.append(a);
            C6921a.m21555a(sb.toString());
            C6893q.m21447a("TYPE_TRIM_MEMORY", C42967ba.m136396a().mo104679a("memoryLevel", Integer.valueOf(i)).mo104680a("page", C6405d.m19984g().getClass().getName()).mo104679a("freeMemory", Integer.valueOf(a)).mo104681b());
        } catch (Exception unused) {
        }
    }
}
